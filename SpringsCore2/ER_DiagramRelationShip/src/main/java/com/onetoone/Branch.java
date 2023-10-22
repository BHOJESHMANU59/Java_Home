package com.onetoone;

import java.util.List;

public class Branch 
{
	private int bid;
	private String bname;
	private List<Student> stds;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Student> getStds() {
		return stds;
	}
	public void setStds(List<Student> stds) {
		this.stds = stds;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", stds=" + stds + "]";
	}
	
	

}
