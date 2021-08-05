package com.vinodh.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.vinodh.now.model.JsonResponse;
import com.vinodh.now.model.RefreshResponse;
import com.vinodh.util.XmlMapperUtil;

public class ServiceNowTest {

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
		String xml=inputPutFileToXmlString("servicenow.xml");
		//System.out.println(xml);
		RefreshResponse refreshResponse =XmlMapperUtil.mapFromXml(xml, RefreshResponse.class);
		System.out.println("refreshResponse  "+refreshResponse);
		System.out.println("getPon  "+refreshResponse.getJsonResponse().get(0).getPon());
		getResponseBasedOnVendorAndModel("Adtran", "LCTA5000", "TA 5000", "", "", "",refreshResponse);


	}
	
	public static JsonResponse getResponseBasedOnVendorAndModel(String vendor,String clli,String model,String scp,String ontId,String ontPort, RefreshResponse refreshResponse){
		List<JsonResponse> jsonResponses=refreshResponse.getJsonResponse();
		for (JsonResponse jsonResponse : jsonResponses) {
			if (jsonResponse.getVendor().contains(vendor)&&jsonResponse.getClli().contains(clli)&&jsonResponse.getModel().contains(model)) {
				System.out.println("jsonResponse  ::: "+jsonResponse);
				if(jsonResponse.getStatus().getCode().contains("200")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
					//System.out.println("jsonResponse  ::: "+jsonResponse);
				}else if (jsonResponse.getStatus().getCode().contains("400")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse.getMessage()).build();
				}else if (jsonResponse.getStatus().getCode().contains("401")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse.getMessage()).build();
				}else if (jsonResponse.getStatus().getCode().contains("402")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("403")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("404")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("405")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("406")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("500")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("501")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}else if (jsonResponse.getStatus().getCode().contains("502")) {
					//return Response.status(Status.ACCEPTED).entity(jsonResponse).build();
				}
				
				return jsonResponse;
			}
		}
		return null;	
	}


}
