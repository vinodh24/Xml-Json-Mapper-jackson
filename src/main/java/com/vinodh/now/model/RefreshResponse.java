package com.vinodh.now.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "RefreshResponse")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class RefreshResponse
{
	@JacksonXmlProperty(localName = "jsonResponse")
    private List<JsonResponse> jsonResponse;

    public List<JsonResponse> getJsonResponse ()
    {
        return jsonResponse;
    }

    public void setJsonResponse (List<JsonResponse> jsonResponse)
    {
        this.jsonResponse = jsonResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [jsonResponse = "+jsonResponse+"]";
    }
}