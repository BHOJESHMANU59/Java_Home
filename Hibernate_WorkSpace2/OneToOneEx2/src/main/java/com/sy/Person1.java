package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Person1 
{
	@Id
	private int id;
	private String pName;
	private long phno;
	@OneToOne
	private PassPort passport;

}
