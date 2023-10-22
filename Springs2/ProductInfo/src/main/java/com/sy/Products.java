package com.sy;

public class Products 
{
	private int pid;
	private String pname;
	private double price;
	
	private Customer4 cust;
	

	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Customer4 getCust() {
		return cust;
	}


	public void setCust(Customer4 cust) {
		this.cust = cust;
	}


	@Override
	public String toString() {
		return "Products [cust=" + cust + ", pid=" + pid + ", pname=" + pname + ", price=" + price + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void check()
	{
		System.out.println("The value Assigned is :"+cust.getCid()+"  "+cust.getCname());
	}
	
}
