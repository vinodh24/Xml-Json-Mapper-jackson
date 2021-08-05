package com.vinodh.now.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Voice")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class Voice
{
    private String sTag;

    private AddlParams addlParams;

    private String crv;

    private String type;

    public String getSTag ()
    {
        return sTag;
    }

    public void setSTag (String sTag)
    {
        this.sTag = sTag;
    }

    public AddlParams getAddlParams ()
    {
        return addlParams;
    }

    public void setAddlParams (AddlParams addlParams)
    {
        this.addlParams = addlParams;
    }

    public String getCrv ()
    {
        return crv;
    }

    public void setCrv (String crv)
    {
        this.crv = crv;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sTag = "+sTag+", addlParams = "+addlParams+", crv = "+crv+", type = "+type+"]";
    }
}

