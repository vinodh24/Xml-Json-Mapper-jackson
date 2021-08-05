package com.vinodh.now.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "JsonResponse")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class JsonResponse
{
	@JacksonXmlProperty(localName = "assignedTech")
    private String assignedTech;

	@JacksonXmlProperty(localName = "voice")
    private Voice voice;

	@JacksonXmlProperty(localName = "scp")
    private List<String> scp;

	@JacksonXmlProperty(localName = "deviceIP")
    private String deviceIP;

	@JacksonXmlProperty(localName = "telephoneNumber")
    private String telephoneNumber;

	@JacksonXmlProperty(localName = "data")
    private Data data;

	@JacksonXmlProperty(localName = "cos")
    private String cos;

	@JacksonXmlProperty(isAttribute = true,localName ="ontPort")
    private String ontPort;

    @JacksonXmlProperty(isAttribute = true,localName ="clli")
    private String clli;

    private Video video;

    private String message;

    private Pon pon;

    @JacksonXmlProperty(isAttribute = true,localName ="vendor")
    private String vendor;

    @JacksonXmlProperty(isAttribute = true,localName ="model")
    private String model;

    @JacksonXmlProperty(isAttribute = true,localName ="ontId")
    private String ontId;

    private Status status;

    public String getAssignedTech ()
    {
        return assignedTech;
    }

    public void setAssignedTech (String assignedTech)
    {
        this.assignedTech = assignedTech;
    }

    public Voice getVoice ()
    {
        return voice;
    }

    public void setVoice (Voice voice)
    {
        this.voice = voice;
    }

    public List<String> getScp ()
    {
        return scp;
    }

    public void setScp (List<String> scp)
    {
        this.scp = scp;
    }

    public String getDeviceIP ()
    {
        return deviceIP;
    }

    public void setDeviceIP (String deviceIP)
    {
        this.deviceIP = deviceIP;
    }

    public String getTelephoneNumber ()
    {
        return telephoneNumber;
    }

    public void setTelephoneNumber (String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getCos ()
    {
        return cos;
    }

    public void setCos (String cos)
    {
        this.cos = cos;
    }

    public String getOntPort ()
    {
        return ontPort;
    }

    public void setOntPort (String ontPort)
    {
        this.ontPort = ontPort;
    }

    public String getClli ()
    {
        return clli;
    }

    public void setClli (String clli)
    {
        this.clli = clli;
    }

    public Video getVideo ()
    {
        return video;
    }

    public void setVideo (Video video)
    {
        this.video = video;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public Pon getPon ()
    {
        return pon;
    }

    public void setPon (Pon pon)
    {
        this.pon = pon;
    }

    public String getVendor ()
    {
        return vendor;
    }

    public void setVendor (String vendor)
    {
        this.vendor = vendor;
    }

    public String getModel ()
    {
        return model;
    }

    public void setModel (String model)
    {
        this.model = model;
    }

    public String getOntId ()
    {
        return ontId;
    }

    public void setOntId (String ontId)
    {
        this.ontId = ontId;
    }

    public Status getStatus ()
    {
        return status;
    }

    public void setStatus (Status status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [assignedTech = "+assignedTech+", voice = "+voice+", scp = "+scp+", deviceIP = "+deviceIP+", telephoneNumber = "+telephoneNumber+", data = "+data+", cos = "+cos+", ontPort = "+ontPort+", clli = "+clli+", video = "+video+", message = "+message+", pon = "+pon+", vendor = "+vendor+", model = "+model+", ontId = "+ontId+", status = "+status+"]";
    }
}