package com.sy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Products {
	@Id
	private int pId;
	private String pName;
	private double price;
	@ManyToMany
	List<Customers> cust=new ArrayList<Customers>();

}
