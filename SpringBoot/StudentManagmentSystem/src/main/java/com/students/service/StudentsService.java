package com.students.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.students.dto.MessageData;
import com.students.dto.StudentResponse;
import com.students.dto.Students;
import com.students.response.ResponseStructure;

import jakarta.mail.MessagingException;
@Service
public interface StudentsService {

	public ResponseStructure<?> savedata(Students std);

	public ResponseStructure<?> fetchAll();

	public ResponseStructure<?> findbyId(int id);

	public ResponseStructure<?> findbyName(String name);

	public ResponseStructure<?> findByPhno(long phno);

	public ResponseStructure<List<String>> findEmailByGrade(String grade);

	public ResponseStructure<StudentResponse> update(Students std);

	public ResponseStructure<StudentResponse> updateName(int id, String name);

	public ResponseStructure<StudentResponse> updatePhno(String name, long phno);

	public ResponseStructure<StudentResponse> updateEmailByPhno(long phno, String email);
	
	public ResponseStructure<StudentResponse> deleteById(int id);

	public ResponseStructure<List<StudentResponse>> deleteAll();
	
	
	public ResponseStructure<List<StudentResponse>> extractDataFromExcel(MultipartFile file) throws IOException;
	
	public ResponseStructure<String> writeToExcel(String filepath) throws IOException;
	
	public ResponseEntity<String> sendMail(MessageData messageData);

	public ResponseEntity<?> sendMimeMessage(MessageData data) throws MessagingException;

	
	
	

}
