package com.referencetype_setter;

import java.util.List;

public class College 
{
	private int cid;
	private String cname;
	private List<Students> stds;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Students> getStds() {
		return stds;
	}
	public void setStds(List<Students> stds) {
		this.stds = stds;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", stds=" + stds + "]";
	}

}
