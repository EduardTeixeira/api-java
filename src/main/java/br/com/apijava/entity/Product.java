package br.com.apijava.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "meta", "products" })
public class Product {

	@JsonProperty("meta")
	private Meta meta;
	@JsonProperty("products")
	private List<Product_> products = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}

	@JsonProperty("meta")
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@JsonProperty("products")
	public List<Product_> getProducts() {
		return products;
	}

	@JsonProperty("products")
	public void setProducts(List<Product_> products) {
		this.products = products;
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
