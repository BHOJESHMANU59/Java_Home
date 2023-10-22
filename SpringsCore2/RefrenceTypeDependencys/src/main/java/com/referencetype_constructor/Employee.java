package com.referencetype_constructor;

public class Employee {
	private int empid;
	private String empname;
	private double salary;
	
	private Project project;

	public Employee(int empid, String empname, double salary, Project project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", project=" + project
				+ "]";
	}

}
