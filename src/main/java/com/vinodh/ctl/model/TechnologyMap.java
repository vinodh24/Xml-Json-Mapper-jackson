package com.vinodh.ctl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TechnologyMap {
	public String assignedTech;
	
    @JsonProperty("data.isData") 
    public boolean dataIsData;

	@JsonProperty("data.isVideo") 
    public boolean dataIsVideo;
    
    @JsonProperty("data.isVoice") 
    public boolean dataIsVoice;
    
    @JsonProperty("data.addlParams.crossConnects") 
    public String dataAddlParamsCrossConnects;
    
    public String technology;
    
    @JsonProperty("data.atm") 
    public boolean dataAtm;
    
    @Override
	public String toString() {
		return "TechnologyMap [assignedTech=" + assignedTech + ", dataIsData=" + dataIsData + ", dataIsVideo="
				+ dataIsVideo + ", dataIsVoice=" + dataIsVoice + ", dataAddlParamsCrossConnects="
				+ dataAddlParamsCrossConnects + ", technology=" + technology + ", dataAtm=" + dataAtm + "]";
	}

	public String getAssignedTech() {
		return assignedTech;
	}

	public void setAssignedTech(String assignedTech) {
		this.assignedTech = assignedTech;
	}

	public boolean isDataIsData() {
		return dataIsData;
	}

	public void setDataIsData(boolean dataIsData) {
		this.dataIsData = dataIsData;
	}

	public boolean isDataIsVideo() {
		return dataIsVideo;
	}

	public void setDataIsVideo(boolean dataIsVideo) {
		this.dataIsVideo = dataIsVideo;
	}

	public boolean isDataIsVoice() {
		return dataIsVoice;
	}

	public void setDataIsVoice(boolean dataIsVoice) {
		this.dataIsVoice = dataIsVoice;
	}

	public String getDataAddlParamsCrossConnects() {
		return dataAddlParamsCrossConnects;
	}

	public void setDataAddlParamsCrossConnects(String dataAddlParamsCrossConnects) {
		this.dataAddlParamsCrossConnects = dataAddlParamsCrossConnects;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public boolean isDataAtm() {
		return dataAtm;
	}

	public void setDataAtm(boolean dataAtm) {
		this.dataAtm = dataAtm;
	}
    
}
