package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vinodh.now.schema.model.ResourceBundle;
import com.vinodh.util.XmlMapperUtil;

public class ServiceNowSchemaTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String xml=inputPutFileToXmlString("schemaResponseBundle.xml");
		ResourceBundle resourceBundle=XmlMapperUtil.mapFromXml(xml, ResourceBundle.class);
		System.out.println(resourceBundle);
		String resourceBundle1=XmlMapperUtil.mapToXml(resourceBundle);
		System.out.println(resourceBundle1);
	}
	
	public static String inputPutFileToXmlString(String fileName)throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new FileReader(new ClassPathResource(fileName).getFile()));
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		line = null;
		return sb.toString();
	}

}
