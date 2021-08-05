package com.vinodh.now.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Video")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class Video
{
    private String sTag;

    private AddlParams addlParams;

    private String cTag;

    private String videoCos;

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

    public String getCTag ()
    {
        return cTag;
    }

    public void setCTag (String cTag)
    {
        this.cTag = cTag;
    }

    public String getVideoCos ()
    {
        return videoCos;
    }

    public void setVideoCos (String videoCos)
    {
        this.videoCos = videoCos;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sTag = "+sTag+", addlParams = "+addlParams+", cTag = "+cTag+", videoCos = "+videoCos+"]";
    }
}