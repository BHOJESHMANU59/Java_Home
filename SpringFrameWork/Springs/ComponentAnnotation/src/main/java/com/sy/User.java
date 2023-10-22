package com.sy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Entity
public class User {
	@Id
	@Value("420")
	private int id;
	@Value("Srinath")
	private String name;
	
	@Autowired
	@OneToOne
	private Products pro;
	
	public Products getPro() {
		return pro;
	}
	public void setPro(Products pro) {
		this.pro = pro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void prod()
	{
		System.out.println("The Product details are : "+pro.getPid()+"  "+pro.getName()+"  "+pro.getPrice());
	}
	

}
