package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.now.refreshOnt.model.RefreshOnt;
import com.vinodh.util.XmlMapperUtil;

public class ServiceNowRefreshOntTest {
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
		String xml=inputPutFileToXmlString("refreshONT.xml");
		RefreshOnt  refreshOnt=XmlMapperUtil.mapFromXml(xml, RefreshOnt.class);
		System.out.println("refreshOnt  "+refreshOnt);
		System.out.println("getJsonScpResponse:::  "+refreshOnt.getPonResponse().get(0));
	}
}
