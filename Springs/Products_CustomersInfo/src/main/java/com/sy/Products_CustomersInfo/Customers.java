package com.sy.Products_CustomersInfo;

public class Customers {
	private int cid;
	private String cname;
	public Customers(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
		
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + "]";
	}
	

}
