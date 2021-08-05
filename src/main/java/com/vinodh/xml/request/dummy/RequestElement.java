package com.vinodh.xml.request.dummy;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "RequestElement")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class RequestElement {

	@JacksonXmlProperty(localName = "Attribute")
	private List<Attribute> attribute;

   
    public List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
    }

	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(List<Attribute> attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "RequestElement [attribute=" + attribute + "]";
	}
    
    
    

}
