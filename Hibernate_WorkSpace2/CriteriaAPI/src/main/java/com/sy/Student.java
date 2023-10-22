package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student 
{
	@Id
	private int sId;
	private String sname;
	private double Marks;

}
