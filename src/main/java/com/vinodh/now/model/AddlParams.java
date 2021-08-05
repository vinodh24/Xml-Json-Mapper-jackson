package com.vinodh.now.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "AddlParams")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
public class AddlParams
{
    private String videoVlanXlateId;

    private String videoSlanXlateId;

    private String rtraid;

    private String voiceVlanXlateId;

	private String aor;

    private String slotVoice;

    private String voiceSlanXlateId;

    private String interfaceGroupName;
    
    public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}


	private Integer registrationId;
    
    public String getVideoVlanXlateId ()
    {
        return videoVlanXlateId;
    }

    public void setVideoVlanXlateId (String videoVlanXlateId)
    {
        this.videoVlanXlateId = videoVlanXlateId;
    }

    public String getVideoSlanXlateId ()
    {
        return videoSlanXlateId;
    }

    public void setVideoSlanXlateId (String videoSlanXlateId)
    {
        this.videoSlanXlateId = videoSlanXlateId;
    }

    public String getRtraid ()
    {
        return rtraid;
    }

    public void setRtraid (String rtraid)
    {
        this.rtraid = rtraid;
    }
    public String getVoiceVlanXlateId() {
		return voiceVlanXlateId;
	}

	public void setVoiceVlanXlateId(String voiceVlanXlateId) {
		this.voiceVlanXlateId = voiceVlanXlateId;
	}

	public String getAor() {
		return aor;
	}

	public void setAor(String aor) {
		this.aor = aor;
	}

	public String getSlotVoice() {
		return slotVoice;
	}

	public void setSlotVoice(String slotVoice) {
		this.slotVoice = slotVoice;
	}

	public String getVoiceSlanXlateId() {
		return voiceSlanXlateId;
	}

	public void setVoiceSlanXlateId(String voiceSlanXlateId) {
		this.voiceSlanXlateId = voiceSlanXlateId;
	}

	public String getInterfaceGroupName() {
		return interfaceGroupName;
	}

	public void setInterfaceGroupName(String interfaceGroupName) {
		this.interfaceGroupName = interfaceGroupName;
	}


    @Override
	public String toString() {
		return "AddlParams [videoVlanXlateId=" + videoVlanXlateId + ", videoSlanXlateId=" + videoSlanXlateId
				+ ", rtraid=" + rtraid + ", voiceVlanXlateId=" + voiceVlanXlateId + ", aor=" + aor + ", slotVoice="
				+ slotVoice + ", voiceSlanXlateId=" + voiceSlanXlateId + ", interfaceGroupName=" + interfaceGroupName
				+ ", registrationId=" + registrationId + "]";
	}
}
