package com.sy.SpringFirstProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sy.SpringFirstProject.entity.Student;
import com.sy.SpringFirstProject.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	public Student insertData()
	{
		return service.insert();
	}
	
	public Student getDetails(int id)
	{
		return service.fetchbyId(id);
	}
	
	public Student updateData(int id)
	{
		return service.updateData(id);
	}
	
	public Student deleteData(int id)
	{
		return service.delete(id);
	}


}
