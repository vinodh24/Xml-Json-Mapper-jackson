package com.vinodh.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

public class XmlMapperUtil {
	
	public static <T> T mapFromXml(String xml, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		xmlMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		xmlMapper.setDefaultUseWrapper(false);
		return xmlMapper.readValue(xml, clazz);
	}
	
	public static <T> String mapToXml(T obj) throws JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.setDefaultUseWrapper(false);
		xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true );
		xmlMapper.configure(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY,false);
		return xmlMapper.writeValueAsString(obj);
    }
	
	public void JacksonXmlSerializer(XmlMapper xmlMappe) {
		xmlMappe.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		xmlMappe.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		xmlMappe.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
		xmlMappe.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
		xmlMappe.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}
	
}
