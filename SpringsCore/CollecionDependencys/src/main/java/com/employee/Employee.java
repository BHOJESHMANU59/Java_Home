package com.employee;

import java.util.List;
import java.util.Set;

public class Employee
{
	private int eid;
	private String ename;
	private double sal;
	private List<Long> phno;
	private Set<String> project;
	public Employee(int eid, String ename, double sal, List<Long> phno, Set<String> project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.phno = phno;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", phno=" + phno + ", project=" + project
				+ "]";
	}
	
	

}
