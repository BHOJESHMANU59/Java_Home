package com.signup.service;


import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.signup.dto.UserResponse;
import com.signup.entity.User;
import com.signup.response.ResponseStructure;

@Service
public interface ServiceUser {
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(User u);

	public ResponseEntity<?> getallUser();

	public ResponseEntity<?> getbyId(int id);

	public ResponseEntity<?> getByEmail(String email);
	
	public ResponseEntity<?> updateUser(User u);
	
	public ResponseEntity<?> updateName(int id, String name);
	
	public ResponseEntity<?> deleteById(int id);

	public ResponseEntity<?> fetchByName(String name);

	public ResponseEntity<?> fetchPwdbyEmail(String email);
	
	ResponseEntity<ResponseStructure<List<UserResponse>>> extractDataFromExcel(MultipartFile file) throws IOException; 

}
