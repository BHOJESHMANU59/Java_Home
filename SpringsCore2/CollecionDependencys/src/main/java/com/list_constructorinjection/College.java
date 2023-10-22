package com.list_constructorinjection;

import java.util.List;

public class College 
{
	private int id;
	private String name;
	private List<String> stds;
	public College(int id, String name, List<String> stds) {
		super();
		this.id = id;
		this.name = name;
		this.stds = stds;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", stds=" + stds + "]";
	}
	

}
