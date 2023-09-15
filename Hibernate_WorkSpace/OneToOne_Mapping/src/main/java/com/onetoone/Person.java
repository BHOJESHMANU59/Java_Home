package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import lombok.Data;

@Data
@Entity
public class Person
{
	@Id
	private int p_id;
	private String pName;
	private int age;
	private String gender;
	private long phno;
	@OneToOne
	AdharCard card;
	

}
