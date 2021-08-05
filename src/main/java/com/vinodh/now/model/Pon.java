package com.vinodh.now.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Pon")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class Pon
{
    private AddlParams addlParams;

    private String ontPort;

    private String ontId;

    public AddlParams getAddlParams ()
    {
        return addlParams;
    }

    public void setAddlParams (AddlParams addlParams)
    {
        this.addlParams = addlParams;
    }

    public String getOntPort ()
    {
        return ontPort;
    }

    public void setOntPort (String ontPort)
    {
        this.ontPort = ontPort;
    }

    public String getOntId ()
    {
        return ontId;
    }

    public void setOntId (String ontId)
    {
        this.ontId = ontId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [addlParams = "+addlParams+", ontPort = "+ontPort+", ontId = "+ontId+"]";
    }
}

