package com.vinodh.now.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Data")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class Data
{
    private String sTag;

    private AddlParams addlParams;

    private String dataCos;

    private String cTag;

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

    public String getDataCos ()
    {
        return dataCos;
    }

    public void setDataCos (String dataCos)
    {
        this.dataCos = dataCos;
    }

    public String getCTag ()
    {
        return cTag;
    }

    public void setCTag (String cTag)
    {
        this.cTag = cTag;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sTag = "+sTag+", addlParams = "+addlParams+", dataCos = "+dataCos+", cTag = "+cTag+"]";
    }
}
