package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PassPort {
	@Id
	private int passId;
	private String PassName;
	private String passCountry;

}
