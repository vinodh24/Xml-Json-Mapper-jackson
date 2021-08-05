package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.now.refreshPon.model.RefreshPon;
import com.vinodh.util.XmlMapperUtil;

public class ServiceNowRefreshPonTest {
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
		String xml=inputPutFileToXmlString("refreshPon.xml");
		RefreshPon  refreshPon=XmlMapperUtil.mapFromXml(xml, RefreshPon.class);
		System.out.println("refreshResponse  "+refreshPon);
		System.out.println("getJsonScpResponse:::  "+refreshPon.getPonResponse().get(0));
	}
}
