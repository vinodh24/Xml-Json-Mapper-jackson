package com.vinodh.ctl.model;

import java.util.List;

public class Param {
	public String key;
    public String description;
    public String defaultValue;
    public List<String> validValues;
    public String decription;
    
	@Override
	public String toString() {
		return "Param [key=" + key + ", description=" + description + ", defaultValue=" + defaultValue
				+ ", validValues=" + validValues + ", decription=" + decription + "]";
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public List<String> getValidValues() {
		return validValues;
	}
	public void setValidValues(List<String> validValues) {
		this.validValues = validValues;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
}
