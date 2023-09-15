package com.sy.SpringFirstProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.SpringFirstProject.entity.Student;
import com.sy.SpringFirstProject.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student insert() {
		return repo.save();
	}
	
	public Student fetchbyId(int id) 
	{
		return repo.fetchById(id);
	}

	public Student updateData(int id) {
		return repo.update(id);
	}

	public Student delete(int id) {
		return repo.delete(id);
	}
	
	
	

}
