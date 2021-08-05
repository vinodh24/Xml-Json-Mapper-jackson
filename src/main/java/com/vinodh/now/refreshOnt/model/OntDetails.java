package com.vinodh.now.refreshOnt.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ontDetails")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class OntDetails {

	private String ontPort;
	private String portType;     
	private String telephoneNumber;
	private String dataCos;
	private String sTag;
	private String cTag;
	private String videoCos;
	private String type;
	
	
	public String getOntPort() {
		return ontPort;
	}
	public void setOntPort(String ontPort) {
		this.ontPort = ontPort;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		this.portType = portType;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getDataCos() {
		return dataCos;
	}
	public void setDataCos(String dataCos) {
		this.dataCos = dataCos;
	}
	public String getsTag() {
		return sTag;
	}
	public void setsTag(String sTag) {
		this.sTag = sTag;
	}
	public String getcTag() {
		return cTag;
	}
	public void setcTag(String cTag) {
		this.cTag = cTag;
	}
	public String getVideoCos() {
		return videoCos;
	}
	public void setVideoCos(String videoCos) {
		this.videoCos = videoCos;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "OntDetails [ontPort=" + ontPort + ", portType=" + portType + ", telephoneNumber=" + telephoneNumber
				+ ", dataCos=" + dataCos + ", sTag=" + sTag + ", cTag=" + cTag + ", videoCos=" + videoCos + ", type="
				+ type + "]";
	}

}
