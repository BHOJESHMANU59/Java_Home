package com.sy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	private int Id;
	private String PName;
	private long  phno;
	@OneToMany
	private List<Vehicle> vehicle;

}
