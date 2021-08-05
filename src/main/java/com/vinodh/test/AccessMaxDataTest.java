package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.ctl.model.AccessMaxData;
import com.vinodh.ctl.model.TechnologyMap;
import com.vinodh.util.JsonMapperUtil;

public class AccessMaxDataTest {

	public static void main(String[] args) {
		try {
			String json=inputPutFileToJsonString("accessmax.json");
			AccessMaxData accessMaxData=JsonMapperUtil.mapFromJson(json,AccessMaxData.class);
			System.out.println(accessMaxData);
//			for (Param param : accessMaxData.getParams()) {
//				
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
     
	}
	
	public static String inputPutFileToJsonString(String fileName)throws IOException {
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
	
	public static String getTechnology(List<TechnologyMap> technologyMaps)throws IOException {
		for (TechnologyMap technologyMap : technologyMaps) {
			System.out.println(technologyMap);
		}
		return null;
	}
	
	


}
