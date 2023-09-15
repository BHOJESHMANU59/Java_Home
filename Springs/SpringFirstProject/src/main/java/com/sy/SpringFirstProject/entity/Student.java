package com.sy.SpringFirstProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.sy.SpringFirstProject.service.StudentService;

import lombok.Data;

@Component
@Entity
@Data
public class Student {
	@Id
	private int sId;
	private String sName;
	private double Marks;
	private long phno;
	
	

}
