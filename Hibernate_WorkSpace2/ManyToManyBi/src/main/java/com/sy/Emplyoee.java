package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Emplyoee {
	@Id
	private int eId;
	private String eName;
	private long phno;
	@ManyToOne
	private Company comp;

}
