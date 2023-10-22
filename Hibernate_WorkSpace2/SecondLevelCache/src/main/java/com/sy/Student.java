package com.sy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Cacheable()
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student 
{
	@Id
	private int Id;
	private String stdName;
	private double marks;


}
