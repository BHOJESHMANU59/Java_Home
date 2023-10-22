package com.sy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Company {
	@Id
	private int cId;
	private String cName;
	private String address;
	@OneToMany(mappedBy = "comp")
	private List<Emplyoee> emp=new ArrayList<Emplyoee>();

}
