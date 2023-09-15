package com.map_setterinjection;

import java.util.Map;

public class Student {
	private int id;
	private String name;
	private Map<String, Double> sub;
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
	public Map<String, Double> getSub() {
		return sub;
	}
	public void setSub(Map<String, Double> sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}
	
	
}
