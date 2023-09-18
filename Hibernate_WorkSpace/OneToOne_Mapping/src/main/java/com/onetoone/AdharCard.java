package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AdharCard 
{
	@Id
	private int id;
	private long adharNo;
	private String address;

}
