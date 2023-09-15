package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Vehicle {
	@Id
	private int vId;
	private String vName;
	private double vPrize;
	@ManyToOne()
	private Person per;


}
