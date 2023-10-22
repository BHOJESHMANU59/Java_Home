package com.sy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;


@Entity
@Cacheable()
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Producer
{
	@Id
	private int pId;
	private String pName;
	private double price;
	private long phno;
	@OneToMany(mappedBy = "pro")
	private List<Consumer> cons=new ArrayList<Consumer>();
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public List<Consumer> getCons() {
		return cons;
	}
	public void setCons(List<Consumer> cons) {
		this.cons = cons;
	}
	
	public void display()
	{
		System.out.println("Producer [pId=" + pId + ", pName=" + pName + ", price=" + price + ", phno=" + phno + ", cons=" + cons
				+ "]");
	}

}
