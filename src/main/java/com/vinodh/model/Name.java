package com.vinodh.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Name {
	@JacksonXmlProperty(localName="firstname")
	private String firstName;
	@JacksonXmlProperty(localName="lastname")
	private String lastName;
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
