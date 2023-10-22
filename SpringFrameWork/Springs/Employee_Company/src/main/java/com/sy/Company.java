package com.sy;

public class Company {
	private int cId;
	private String Cname;
	private String address;
	
	private Employee emp;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}
	

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", Cname=" + Cname + ", address=" + address + ", emp=" + emp + "]";
	}
	
	public void employee()
	{
		System.out.println("Employee Details are : "+emp.getEmpId()+"   "+emp.geteName()+"  "+emp.getSal());
	}

}
