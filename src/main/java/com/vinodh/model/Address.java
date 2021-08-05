package com.vinodh.model;

public class Address {
	private String street;
	private String city;
	private String email;
	private String phone;
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", email="
				+ email + ", phone=" + phone + "]";
	}
}
