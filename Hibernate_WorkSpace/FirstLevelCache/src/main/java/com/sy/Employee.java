package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double sal;

}
