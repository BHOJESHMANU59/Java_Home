package com.sy.Products_CustomersInfo;

public class Products {
	
	private int pid;
	private String pname;
	private double price;
	private Customers cust;
	public Products(int pid, String pname, double price, Customers cust) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", cust=" + cust + "]";
	}
	
	
	
	

}
