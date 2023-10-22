package com.onetoone;

import java.util.List;

public class College 
{
	private int cid;
	private String cname;
	private List<Branch> branch;
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
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", branch=" + branch + "]";
	}

	
}
