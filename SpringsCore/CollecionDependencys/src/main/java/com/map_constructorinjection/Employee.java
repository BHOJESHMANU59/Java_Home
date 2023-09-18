package com.map_constructorinjection;

import java.util.Map;

public class Employee 
{
	private Map<Integer, String> name;
	private double sal;
	public Employee(Map<Integer, String> name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [Id and Name=" + name + ", sal=" + sal + "]";
	}
	

}
