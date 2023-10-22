package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserInfo 
{
	@Id
	private int id;
	private String name;
	private String pwd;

}
