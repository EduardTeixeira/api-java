package br.com.apijava.entity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "price", "image", "brand", "id", "title", "reviewScore" })
public class Product_ {

//	{ 
//		"meta" : { 
//		"número_página" : 1 ,
//		"tamanho_página" : 100
//		} ,
//		"produtos" : [ 
//		{ 
//		"price" : 1699.0 ,
//		"image" : "http://challenge-api.luizalabs.com/images/1bf0f365-fbdd-4e21-9786-da459d78dd1f.jpg" ,
//		"brand" : "b \ u00e9b \ u00e9 confort" ,
//		"id" : "1bf0f365-fbdd-4e21-9786-da459d78dd1f" ,
//		"title" : "Cadeira para Iseos Automáticos B \ u00e9b \ u00e9 Confort Earth Brown"
//		} ,

	@JsonProperty("price")
	private Double price;
	@JsonProperty("image")
	private String image;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("id")
	private String id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("reviewScore")
	private Double reviewScore;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("price")
	public Double getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Double price) {
		this.price = price;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}

	@JsonProperty("brand")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("reviewScore")
	public Double getReviewScore() {
		return reviewScore;
	}

	@JsonProperty("reviewScore")
	public void setReviewScore(Double reviewScore) {
		this.reviewScore = reviewScore;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
