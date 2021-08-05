package com.vinodh.now.refreshPon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.vinodh.now.model.Status;

@JacksonXmlRootElement(localName = "ponResponse")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class PonResponse {

	private String message;
	private Status status;
	
	@JacksonXmlProperty(isAttribute = true,localName ="deviceIP")
	private String deviceIP;
	@JacksonXmlProperty(isAttribute = true,localName ="clli")
	private String clli;
	@JacksonXmlProperty(isAttribute = true,localName ="vendor")
	private String vendor;

	@JacksonXmlProperty(isAttribute = true,localName ="model")
	private String model;
	
	@JacksonXmlProperty(isAttribute = true,localName ="pon")
	private String pon;
	
	private List<PonDetails> ponDetails;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDeviceIP() {
		return deviceIP;
	}

	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}

	public String getClli() {
		return clli;
	}

	public void setClli(String clli) {
		this.clli = clli;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPon() {
		return pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public List<PonDetails> getPonDetails() {
		return ponDetails;
	}

	public void setPonDetails(List<PonDetails> ponDetails) {
		this.ponDetails = ponDetails;
	}
	
	@Override
	public String toString() {
		return "PonResponse [message=" + message + ", status=" + status + ", deviceIP=" + deviceIP + ", clli=" + clli
				+ ", vendor=" + vendor + ", model=" + model + ", pon=" + pon + ", ponDetails=" + ponDetails + "]";
	}


}
