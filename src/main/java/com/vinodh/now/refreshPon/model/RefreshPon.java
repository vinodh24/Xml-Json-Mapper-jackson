package com.vinodh.now.refreshPon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "refreshPon")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class RefreshPon {
	
	@JacksonXmlProperty(localName = "ponResponse")
    private List<PonResponse> ponResponse;

	public List<PonResponse> getPonResponse() {
		return ponResponse;
	}

	public void setPonResponse(List<PonResponse> ponResponse) {
		this.ponResponse = ponResponse;
	}

	@Override
	public String toString() {
		return "RefreshPon [ponResponse=" + ponResponse + "]";
	}

}
