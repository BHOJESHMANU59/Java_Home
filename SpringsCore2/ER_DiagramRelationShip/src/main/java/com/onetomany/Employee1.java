package com.onetomany;

public class Employee1 
{
	private int empId;
	private String empName;
	private double sal;
	
	private Company comp;

	public Employee1(int empId, String empName, double sal, Company comp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", comp=" + comp + "]";
	}
	
	
	
	

}
