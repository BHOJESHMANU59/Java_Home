package com.sy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Customers {
	@Id
	private int cId;
	private String cName;
	private long phno;
	@ManyToMany(mappedBy = "cust")
	List<Products> pro=new ArrayList<Products>();

}
