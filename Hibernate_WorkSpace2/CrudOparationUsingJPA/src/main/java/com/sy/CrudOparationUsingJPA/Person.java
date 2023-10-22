package com.sy.CrudOparationUsingJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String gender;
	private long phno;

}
