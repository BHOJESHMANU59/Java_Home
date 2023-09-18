package com.sy.StudentInfo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student_Data 
{
	@Id
	private int sid;
	private String sName;
	private double Marks;

}
