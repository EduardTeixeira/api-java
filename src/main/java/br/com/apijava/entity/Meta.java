
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
@JsonPropertyOrder({ "page_number", "page_size" })
public class Meta {

	@JsonProperty("page_number")
	private Integer pageNumber;
	@JsonProperty("page_size")
	private Integer pageSize;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("page_number")
	public Integer getPageNumber() {
		return pageNumber;
	}

	@JsonProperty("page_number")
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	@JsonProperty("page_size")
	public Integer getPageSize() {
		return pageSize;
	}

	@JsonProperty("page_size")
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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
