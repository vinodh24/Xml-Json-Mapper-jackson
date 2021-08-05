package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.model.ResourceBundle;
import com.vinodh.util.XmlMapperUtil;

public class Test {
	
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

	public static void main(String[] args) throws IOException {
		String xml=inputPutFileToXmlString("resourcebundle.xml");
		ResourceBundle ResourceBundle =XmlMapperUtil.mapFromXml(xml, ResourceBundle.class);
		System.out.println(ResourceBundle);
		String xml2=XmlMapperUtil.mapToXml(ResourceBundle);
		System.out.println(xml2);
	}
}
