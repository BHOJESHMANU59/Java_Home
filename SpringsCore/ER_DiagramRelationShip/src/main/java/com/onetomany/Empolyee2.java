package com.onetomany;

public class Empolyee2 
{
	private int empId;
	private String empName;
	private double sal;
	
	private Company comp;

	public Empolyee2(int empId, String empName, double sal, Company comp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Empolyee2 [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", comp=" + comp + "]";
	}

}
