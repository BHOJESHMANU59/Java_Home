package com.signup.controller;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.signup.dto.UserResponse;
import com.signup.entity.User;
import com.signup.response.ResponseStructure;
import com.signup.service.ServiceUser;

import jakarta.validation.Valid;

@RestController
public class SignUpController {
	@Autowired
	private ServiceUser service;
	
	@PostMapping(path="/save")
	public ResponseEntity<?> saveUser(@RequestBody @Valid User u)
	{
		return 	service.saveUser(u);
	}
	
	
	@GetMapping(path="/FindAll")
	@CrossOrigin
	public ResponseEntity<?> findById()
	{
		 
		return service.getallUser();
	}
	
	@GetMapping(path="GetbyId/{id}")
	public ResponseEntity<?> findById(@PathVariable int id)
	{
		 
		return service.getbyId(id);
	}
	
	
	@GetMapping(path="/GetByEmail")
	public ResponseEntity<?> findByEmail(@RequestParam String email)
	{
		return service.getByEmail(email);
	}
	
	@PutMapping(path="/Update")
	public ResponseEntity<?> updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	
	@PatchMapping(path="/UpdatebyId")
	public ResponseEntity<?> updateName(@RequestParam int id,@RequestParam String name)
	{
		return service.updateName(id, name);
	}
	
	@DeleteMapping(path="/DeleteById")
	public ResponseEntity<?> deleteById(@RequestParam int id)
	{
		return service.deleteById(id);
	}
	@GetMapping(path="getByName/{name}")
	public ResponseEntity<?> fetchByName(@PathVariable String name)
	{
		return service.fetchByName(name);
	}
	
	@GetMapping(path="/FindPwdByEmail/{email}")
	public ResponseEntity<?> fechPwdByEmail(@PathVariable String email)
	{
		return service.fetchPwdbyEmail(email);
	}
	
	@PostMapping(path="/extract")
	public ResponseEntity<ResponseStructure<List<UserResponse>>> ExtractDataFromExcel(@RequestParam MultipartFile file) throws IOException
	{
		return service.extractDataFromExcel(file);
	}

}
