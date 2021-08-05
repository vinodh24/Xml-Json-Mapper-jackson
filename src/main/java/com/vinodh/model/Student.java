package com.vinodh.model;

public class Student {
	private Name name;

	private Address address;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	public Name getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
