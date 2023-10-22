package com.sy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Recipient {

	@Id
	private int id;
	private String name;
	private Double amt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Recipient [id=" + id + ", name=" + name + ", amt=" + amt + "]";
	}
}
