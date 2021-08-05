package com.vinodh.ctl.model;

import java.util.List;

public class AccessMaxData {
	
	public List<Param> params;
	public List<TechnologyMap> technologyMap;

	public List<Param> getParams() {
		return params;
	}
	public void setParams(List<Param> params) {
		this.params = params;
	}
	public List<TechnologyMap> getTechnologyMap() {
		return technologyMap;
	}
	public void setTechnologyMap(List<TechnologyMap> technologyMap) {
		this.technologyMap = technologyMap;
	}
	
	@Override
	public String toString() {
		return "AccessMaxData [params=" + params + ", technologyMap=" + technologyMap + "]";
	}
}
