package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.model.Students;
import com.vinodh.util.JsonMapperUtil;
import com.vinodh.util.XmlMapperUtil;

public class StudentTest {
	public static void main(String[] args) throws IOException {
		String xml=inputPutFileToXmlString("Students.xml");
		Students students=XmlMapperUtil.mapFromXml(xml, Students.class);
		String students1=XmlMapperUtil.mapToXml(students);
		System.out.println(students1);
		String studentsxml=JsonMapperUtil.mapToJson(students);
		System.out.println(studentsxml);
		Students studentsjson=JsonMapperUtil.mapFromJson(studentsxml, Students.class);
		System.out.println(studentsjson);
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
