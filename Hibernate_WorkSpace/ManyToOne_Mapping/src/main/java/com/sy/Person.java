package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Person {
	@Id
	private int Id;
	private String PName;
	private long  phno;
	

}
