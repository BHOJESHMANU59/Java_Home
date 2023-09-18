package com.sy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Company
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cName;
	private String address;
	@OneToMany(mappedBy = "com")
	private List<Employee> emp=new ArrayList<Employee>();

}
