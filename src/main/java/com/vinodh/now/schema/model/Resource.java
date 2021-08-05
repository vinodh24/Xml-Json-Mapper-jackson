package com.vinodh.now.schema.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "resource")
public class Resource {

	private String id;
	@JacksonXmlProperty(localName = "error-code")
	private String error_code;
	private String value;
	private String key;
	
	public String getId() {
		return id;
	}
	public String getError_type() {
		return error_code;
	}
	public String getValue() {
		return value;
	}
	public String getKey() {
		return key;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setError_type(String error_code) {
		this.error_code = error_code;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", error_code=" + error_code + ", value="
				+ value + ", key=" + key + "]";
	}
}
