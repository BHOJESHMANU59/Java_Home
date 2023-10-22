package com.sy;
import java.util.List;


public class Products {

	private int pid;
	private String pname;
	private double price;

	private Consumer con;

	private List<Producer> prolist;
	

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

	public Consumer getCon() {
		return con;
	}

	public void setCon(Consumer con) {
		this.con = con;
	}

	public List<Producer> getProlist() {
		return prolist;
	}

	public void setProlist(List<Producer> prolist) {
		this.prolist = prolist;
	}

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";

	}

	public void check() {
		System.out.println("The Product is assigned to : " + getCon().getCid() + " " + getCon().getCname());
	}

	public void manufacture() {
		for (Producer prod : prolist) {
			System.out.println("The Product is Manufactured by : " + prod.getId() + "  " + prod.getName());

		}
	}
	
	
	
	
	



}
