package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.util.XmlMapperUtil;
import com.vinodh.xml.request.Attribute;
import com.vinodh.xml.request.OSS;
import com.vinodh.xml.request.Request;
import com.vinodh.xml.request.RequestElement;

public class ZoneXmlRequestTest {

	public static void main(String[] args) throws IOException {
		//String xml=inputPutFileToXmlString("dzonerequest.xml");
		//System.out.println(xml);
		//OSS oss=XmlMapperUtil.mapFromXml(xml, OSS.class);
		//System.out.println(oss);
		String xml1=XmlMapperUtil.mapToXml(getDzoneRequest());
		System.out.println(""+xml1);

	}

	public static OSS getDzoneRequest() {
		OSS oss=getOssSchemaLocation();
		Request request=new Request();
		request.setOperName("velankani");
		request.setRequestMode("offline");
		request.setRequestType("add");
		request.setSessionID("1234512345");
		request.setVersion("2.4");
		oss.setRequest(request);
		oss.setRequestElement(getRequestElement());
		return oss;
	}
	
	public static RequestElement getRequestElement() {
		RequestElement requestElement=new RequestElement();
		List<Attribute> attributeList=new ArrayList<Attribute>();
		Attribute attribute=new Attribute();
		attribute.setName("vinodh");
		attribute.setValue("Navya");
		attributeList.add(attribute);
		requestElement.setAttribute(attributeList);
		return requestElement;		
	}

	public static OSS getOssSchemaLocation() {
		OSS oss=new OSS();
		oss.setXmlns("http://www.zhone.com/OSSXML");
		oss.setXmlnsXsi("http://www.w3.org/2001/XMLSchema-instance");
		oss.setXsiSchemaLocation("http://www.zhone.com/OSSXML ossxml.xsd");
		return oss;	
	}

	public static String inputPutFileToXmlString(String fileName) throws IOException {
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
