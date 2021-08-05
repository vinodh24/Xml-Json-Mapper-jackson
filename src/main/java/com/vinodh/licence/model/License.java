package com.vinodh.licence.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "License")
public class License {
	
	@JacksonXmlProperty(localName = "CompanyName")
	private String companyName;
	@JacksonXmlProperty(localName = "ContactPerson")
	private String contactPerson;
	@JacksonXmlProperty(localName = "Group")
	private String group;
	@JacksonXmlProperty(localName = "ProductName")
	private String productName;
	@JacksonXmlProperty(localName = "PhoneNumber")
	private String phoneNumber;
	@JacksonXmlProperty(localName = "ContactEmail")
	private String contactEmail;
	@JacksonXmlProperty(localName = "PropList")
	private PropList propList;
	@JacksonXmlProperty(localName = "IssuedDate")
	private String issuedDate;
	@JacksonXmlProperty(localName = "LicenceKey")
	private String licenceKey;
	
	public String getCompanyName() {
		return companyName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public String getGroup() {
		return group;
	}
	public String getProductName() {
		return productName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public PropList getPropList() {
		return propList;
	}
	public String getIssuedDate() {
		return issuedDate;
	}
	public String getLicenceKey() {
		return licenceKey;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public void setPropList(PropList propList) {
		this.propList = propList;
	}
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}
	public void setLicenceKey(String licenceKey) {
		this.licenceKey = licenceKey;
	}
	
	@Override
	public String toString() {
		return "License [companyName=" + companyName + ", contactPerson=" + contactPerson + ", group=" + group
				+ ", productName=" + productName + ", phoneNumber=" + phoneNumber + ", contactEmail=" + contactEmail
				+ ", propList=" + propList + ", issuedDate=" + issuedDate + ", licenceKey=" + licenceKey + "]";
	}

	
}