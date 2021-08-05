package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.licence.model.License;
import com.vinodh.util.XmlMapperUtil;

public class LicenseFileTest {

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
		String xml=inputPutFileToXmlString("LicenseFile.xml");
		//System.out.println(xml);
		License license =XmlMapperUtil.mapFromXml(xml, License.class);
		System.out.println(license);
		String xml1=XmlMapperUtil.mapToXml(license);
		System.out.println(xml1);
	}

}
