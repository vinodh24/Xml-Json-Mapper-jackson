package com.vinodh.now.refreshOnt.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "refreshOnt")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class RefreshOnt {
	
	@JacksonXmlProperty(localName = "ontResponse")
    private List<OntResponse> ponResponse;

	public List<OntResponse> getPonResponse() {
		return ponResponse;
	}

	public void setPonResponse(List<OntResponse> ponResponse) {
		this.ponResponse = ponResponse;
	}

	@Override
	public String toString() {
		return "RefreshPon [ponResponse=" + ponResponse + "]";
	}

}
