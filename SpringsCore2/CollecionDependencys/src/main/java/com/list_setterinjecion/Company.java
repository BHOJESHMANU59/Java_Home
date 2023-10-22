package com.list_setterinjecion;

import java.util.List;

public class Company 
{
	private int compId;
	private String comName;
	private List<String> empnames;
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public List<String> getEmpnames() {
		return empnames;
	}
	public void setEmpnames(List<String> empnames) {
		this.empnames = empnames;
	}
	
	@Override
	public String toString() {
		return "Company [compId=" + compId + ", comName=" + comName + ", empnames=" + empnames + "]";
	}
	
	

}
