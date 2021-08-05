package com.vinodh.now.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "jsonScpResponse")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class JsonScpResponse {

	@JacksonXmlProperty(isAttribute = true,localName ="model")
	private String model;

	private Status status;
	
	private String message;

	private String vendor;

	@JacksonXmlProperty(isAttribute = true,localName ="clli")
	private String clli;

	@JacksonXmlProperty(isAttribute = true,localName ="scp")
	private String scp;

	@JacksonXmlProperty(localName = "deviceIP")
	private String deviceIP;

	private String ems;

	private List<String> portName;

	private String portType;

	private String deviceName;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getClli() {
		return clli;
	}

	public void setClli(String clli) {
		this.clli = clli;
	}

	public String getScp() {
		return scp;
	}

	public void setScp(String scp) {
		this.scp = scp;
	}

	public String getDeviceIP() {
		return deviceIP;
	}

	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}

	public String getEms() {
		return ems;
	}

	public void setEms(String ems) {
		this.ems = ems;
	}

	public List<String> getPortName() {
		return portName;
	}

	public void setPortName(List<String> portName) {
		this.portName = portName;
	}

	public String getPortType() {
		return portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "JsonScpResponse [model=" + model + ", status=" + status + ", message=" + message + ", vendor=" + vendor
				+ ", clli=" + clli + ", scp=" + scp + ", deviceIP=" + deviceIP + ", ems=" + ems + ", portName="
				+ portName + ", portType=" + portType + ", deviceName=" + deviceName + "]";
	}

}
