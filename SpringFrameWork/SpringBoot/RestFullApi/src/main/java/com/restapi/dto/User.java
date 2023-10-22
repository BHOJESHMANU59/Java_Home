package com.restapi.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class User 
{
	@Id
	private int id;
	private String name;
	private String Email;
	private String pwd;
	private long phno;
	

}
