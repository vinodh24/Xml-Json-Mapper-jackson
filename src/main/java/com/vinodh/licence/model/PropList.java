package com.vinodh.licence.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement(localName = "PropList")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class PropList implements Serializable{

	private static final long serialVersionUID = -4023380403223957623L;
	
	@JacksonXmlProperty(localName = "Prop")
	private Set<Prop> Prop;

	public Set<Prop> getProp() {
		return Prop;
	}
	
	public void setProp(Set<Prop> prop) {
		Prop = prop;
	}

	@Override
	public String toString() {
		return "PropList [Prop=" + Prop + "]";
	}
	
	
}
