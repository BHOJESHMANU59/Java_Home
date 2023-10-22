package com.onetomany;

public class Company 
{
	private String compId;
	private String compName;
	private String compLocation;
	public Company(String compId, String compName, String compLocation) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.compLocation = compLocation;
	}
	@Override
	public String toString() {
		return "Company [compId=" + compId + ", compName=" + compName + ", compLocation=" + compLocation + "]";
	}
	

}
