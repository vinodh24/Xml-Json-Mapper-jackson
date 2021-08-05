package com.vinodh.test;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vinodh.model.Name;
import com.vinodh.util.MapToPojo;

public class MapToPojoTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
		Name name=new Name();
		name.setFirstName("vinodh");
		name.setLastName("Navya");
		Map<String, String> data=MapToPojo.convertObjectToSingleMap(name);
		System.out.println(data);
		Name name1=MapToPojo.convertMapToPojo(data,Name.class);
        System.out.println(name1);
	}

}
