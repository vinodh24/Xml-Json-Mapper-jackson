package com.vinodh.xml.request;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OSS")
@JsonPropertyOrder({ "xmlns", "xmlnsXsi", "xsiSchemaLocation", "request", "requestElement" })
public class OSS {
    
	@JacksonXmlProperty(isAttribute = true,localName = "xmlns")
	private String xmlns;
	@JacksonXmlProperty(isAttribute = true,localName = "xmlns:xsi")
	private String xmlnsXsi;
	@JacksonXmlProperty(isAttribute = true,localName ="xsi:schemaLocation")
	private String xsiSchemaLocation;
	@JacksonXmlProperty(localName = "Request")
	private Request request;
	@JacksonXmlProperty(localName = "RequestElement")
	private RequestElement requestElement;

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String value) {
		this.xmlns = value;
	}

	public String getXmlnsXsi() {
		return xmlnsXsi;
	}

	public void setXmlnsXsi(String value) {
		this.xmlnsXsi = value;
	}

	public String getXsiSchemaLocation() {
		return xsiSchemaLocation;
	}

	public void setXsiSchemaLocation(String value) {
		this.xsiSchemaLocation = value;
	}


	public Request getRequest() {
		return request;
	}

	public void setRequest(Request value) {
		this.request = value;
	}

	public RequestElement getRequestElement() {
		return requestElement;
	}

	public void setRequestElement(RequestElement value) {
		this.requestElement = value;
	}

	@Override
	public String toString() {
		return "OSS [xmlns=" + xmlns + ", xmlnsXsi=" + xmlnsXsi
				+ ", xsiSchemaLocation=" + xsiSchemaLocation + ", request="
				+ request + ", requestElement=" + requestElement + "]";
	}
	
	

}
