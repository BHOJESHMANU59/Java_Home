package com.students.controller;

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

import com.students.dto.MessageData;
import com.students.dto.StudentResponse;
import com.students.dto.Students;
import com.students.response.ResponseStructure;
import com.students.service.StudentsService;

import jakarta.mail.MessagingException;

@RestController
public class StudentsController
{
	@Autowired
	private StudentsService service;
	
	@PostMapping(path="/saveStd")
	public ResponseEntity<?> saveStd(@RequestBody Students std)
	{
		ResponseStructure<?> responseStructure=service.savedata(std);
		
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@GetMapping(path="/fetchAll")
	public ResponseEntity<?> fetchAll()
	{
		ResponseStructure<?> responseStructure=service.fetchAll();
		
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@GetMapping(path="/fetchbyId/{id}")
	public ResponseEntity<?> findById(@PathVariable int id)
	{
		ResponseStructure<?> responseStructure=service.findbyId(id);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@GetMapping(path="/fetchbyName/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name)
	{
		ResponseStructure<?> responseStructure=service.findbyName(name);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@GetMapping(path="/findbyPhno")
	public ResponseEntity<?> findbyPhno(@RequestParam long phno)
	{
		ResponseStructure<?> responseStructure=service.findByPhno(phno);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@GetMapping(path="/findemail/{grade}")
	public ResponseEntity<ResponseStructure<List<String>>> findEmailByGrade(@PathVariable String grade)
	{
		ResponseStructure<List<String>> responseStructure=service.findEmailByGrade(grade);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<ResponseStructure<StudentResponse>> update(@RequestBody Students std)
	{
		ResponseStructure<StudentResponse> responseStructure = service.update(std);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@PatchMapping("/updateName/{id}/{name}")
	public ResponseEntity<?> updateName(@PathVariable int id,@PathVariable String name)
	{
		ResponseStructure<StudentResponse> responseStructure=service.updateName(id,name);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		
	}
	@PatchMapping("/updatephno/{name}/{phno}")
	public ResponseEntity<?> updatePhoneNo(@PathVariable String name,@PathVariable long phno)
	{
		ResponseStructure<StudentResponse> responseStructure=service.updatePhno(name,phno);
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		
	}
	
	@PatchMapping("/updateemail/{phno}/{email}")
	public ResponseEntity<ResponseStructure<StudentResponse>> updateEmailByPhno(@PathVariable long phno,@PathVariable String email)
	{
		ResponseStructure<StudentResponse> responseStructure=service.updateEmailByPhno(phno,email);
		return new ResponseEntity<ResponseStructure<StudentResponse>>(responseStructure,responseStructure.getHttpStatus());
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id)
	{
		ResponseStructure<StudentResponse> responseStructure =service.deleteById(id);
		return new ResponseEntity<ResponseStructure<StudentResponse>>(responseStructure,responseStructure.getHttpStatus());
	}
	@DeleteMapping("/DeleteAll")
	public ResponseEntity<?> deleteAll()
	{
		ResponseStructure<List<StudentResponse>> responseStructure=service.deleteAll();
		return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
	}
	
	
	@PostMapping("/extract")
	public ResponseEntity<ResponseStructure<List<StudentResponse>>> extractDataFromExcel(@RequestParam MultipartFile file) throws IOException
	{
		ResponseStructure<List<StudentResponse>> responseStructure=service.extractDataFromExcel(file);
		return new ResponseEntity<ResponseStructure<List<StudentResponse>>>(responseStructure,responseStructure.getHttpStatus());
	}
	
	
	@PostMapping("/writeToExcel")
	public ResponseEntity<?> writeToExcel(@RequestParam String filepath) throws IOException 
	{
		 ResponseStructure<String> writeToExcel = service.writeToExcel(filepath);
		 
		 return new ResponseEntity<>(writeToExcel,writeToExcel.getHttpStatus());
	}
	
	@PostMapping("/mail")
	public ResponseEntity<?> sendMail(@RequestBody MessageData data)
	{
		return service.sendMail(data);
	}
	@PostMapping("/sendMail")
	@CrossOrigin
	public ResponseEntity<?> sendMimeMessage(@RequestBody MessageData data) throws MessagingException
	{
		return service.sendMimeMessage(data);
		
	}

}
