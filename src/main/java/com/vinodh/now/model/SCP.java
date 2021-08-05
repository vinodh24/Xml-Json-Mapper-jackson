package com.vinodh.now.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "scp")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class SCP
{
	@JacksonXmlProperty(localName = "jsonScpResponse")
    private List<JsonScpResponse> jsonScpResponse;

	public List<JsonScpResponse> getJsonScpResponse() {
		return jsonScpResponse;
	}

	public void setJsonScpResponse(List<JsonScpResponse> jsonScpResponse) {
		this.jsonScpResponse = jsonScpResponse;
	}
	
	@Override
	public String toString() {
		return "SCP [jsonScpResponse=" + jsonScpResponse + "]";
	}

}