package com.students.dto;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class StudentResponse {
	
	private int sid;
	@Column(name="Name")
	private String sname;
	private String branch;
	private double marks;
	private String grade;
	@Column(unique = true)
	private String email;
	@Column(length = 10)
	private long phno;

}
