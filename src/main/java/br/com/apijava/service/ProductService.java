package br.com.apijava.service;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import br.com.apijava.entity.Product;

@Service
public class ProductService {

	// ler o JSON desse site e retornar uma classe <list>
	public static final String URL = "http://challenge-api.luizalabs.com/api/product/?page=1";

	public List<Product> getProductsList() {

		return jsonToProduct(jsonUrlRequest(URL));
	}

	public String jsonUrlRequest(String link) {

		String json = null;

		try {

			URL url = new URL(link);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setDoOutput(true);

			connection.setInstanceFollowRedirects(false);

			connection.setRequestMethod("GET");

			connection.setRequestProperty("Content-Type", "application/json");

			connection.setRequestProperty("charset", "utf-8");

			connection.connect();

			InputStream is = connection.getInputStream();

			json = streamToString(is);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return json;
	}

	@SuppressWarnings("resource")
	private String streamToString(InputStream is) {

		String text = new Scanner(is, "UTF-8").useDelimiter("\\Z").next();

		return text;
	}

	private List<Product> jsonToProduct(String str) {

		List<Product> listProducts = new ArrayList<>();

		if (str != null) {

			org.json.JSONObject obj = new JSONObject(str);

			JSONArray array = obj.getJSONArray("products");

			for (int i = 0; i < array.length(); i++) {

				if (array.length() > 0 && array != null) {

					// colocar uma verificacao aqui de valores que n existem ou nulos...

					Product product = new Product();

					product.setId(array.getJSONObject(i).getString("id"));

					product.setPrice(array.getJSONObject(i).getDouble("price"));

					product.setImage(array.getJSONObject(i).getString("image"));

					product.setBrand(array.getJSONObject(i).getString("brand"));

					product.setTitle(array.getJSONObject(i).getString("title"));

					product.setReviewScore(array.getJSONObject(i).getDouble("reviewScore"));

					listProducts.add(product);
				}
			}

			return listProducts;
		}

		return null;
	}

}
