package com.signup.serviceimpl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.signup.dto.UserResponse;
import com.signup.entity.User;
import com.signup.exceptions.UserNotFoundException;
import com.signup.repository.UserEntityRep;
import com.signup.response.ResponseStructure;
import com.signup.service.ServiceUser;

@Service
public class UserServiceIMPL implements ServiceUser {
	@Autowired
	private UserEntityRep repo;

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(User u)
	{
		User user = repo.save(u);
		
		UserResponse response=new UserResponse();
		response.setId(user.getId());
		response.setName(user.getName());
		ResponseStructure<UserResponse> responseStructure=new ResponseStructure<UserResponse>();
		responseStructure.setData(response);
		responseStructure.setHttpStatus(HttpStatus.CREATED);
		responseStructure.setMessage("User Data Inserted Successfully");
		return new ResponseEntity<ResponseStructure<UserResponse>>(responseStructure,responseStructure.getHttpStatus());
	}

	@Override
	public ResponseEntity<?> getallUser() 
	{
		List<User> findAll = repo.findAll();
		if(findAll!=null)
		{
			ResponseStructure<List<User>> responseStructure=new ResponseStructure<>();
			responseStructure.setData(findAll);
			responseStructure.setHttpStatus(HttpStatus.FOUND);
			responseStructure.setMessage("User Data Retrived Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		}
		throw new UserNotFoundException("User Data Not Found...!!");
	}

	@Override
	public ResponseEntity<?> getbyId(int id) {
		
		Optional<User> findById = repo.findById(id);
		if(findById.isPresent())
		{
			ResponseStructure<Optional<User>> responseStructure=new ResponseStructure<>();
			responseStructure.setData(findById);
			responseStructure.setHttpStatus(HttpStatus.FOUND);
			responseStructure.setMessage("User Data Retrived Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
			
		}
		throw new UserNotFoundException("User Data Not Found...!!");
	}

	@Override
	public ResponseEntity<?> getByEmail(String email) 
	{
		User findByEmail = repo.findByEmail(email);
		if(findByEmail!=null)
		{
			ResponseStructure<User>responseStructure=new ResponseStructure<>();
			responseStructure.setData(findByEmail);
			responseStructure.setHttpStatus(HttpStatus.FOUND);
			responseStructure.setMessage("User Data Retrived Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		}
		throw new UserNotFoundException("User Email Id Not Found...!!");
	}

	@Override
	public ResponseEntity<?> updateUser(User u)
	{
		if(u!=null)
		{
			User update = repo.save(u);
			ResponseStructure<User>responseStructure=new ResponseStructure<>();
			responseStructure.setData(update);
			responseStructure.setHttpStatus(HttpStatus.OK);
			responseStructure.setMessage("User Data Updated Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		}
		throw new UserNotFoundException("User Data  Not Found...!!");
	}

	@Override
	public ResponseEntity<?> updateName(int id, String name) 
	{
		Optional<User> findById = repo.findById(id);
		if(findById.isPresent())
		{
			User u = findById.get();
			u.setName(name);
			User update = repo.save(u);
			ResponseStructure<User> responseStructure=new ResponseStructure<>();
			responseStructure.setData(update);
			responseStructure.setHttpStatus(HttpStatus.OK);
			responseStructure.setMessage("User Name Updated Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
			
	
		}
		throw new UserNotFoundException("User Data  Not Found...!!");
	}

	@Override
	public ResponseEntity<?> deleteById(int id) 
	{
		Optional<User> findById = repo.findById(id);
		if(findById.isPresent())
		{
			repo.deleteById(id);
			User u = findById.get();  
			ResponseStructure<User> responseStructure=new ResponseStructure<>();
			responseStructure.setData(u);
			responseStructure.setHttpStatus(HttpStatus.OK);
			responseStructure.setMessage("User Data Deleted Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
			
	
		}
		throw new UserNotFoundException("User Data  Not Found...!!");
	}

	@Override
	public ResponseEntity<?> fetchByName(String name)
	{
		User findByName = repo.findByName(name);
		if(findByName.getName()!=null)
		{
			ResponseStructure<User> responseStructure=new ResponseStructure<>();
			responseStructure.setData(findByName);
			responseStructure.setHttpStatus(HttpStatus.OK);
			responseStructure.setMessage("User Data Deleted Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		}
		throw new UserNotFoundException("User Data  Not Found...!!");
		
	}

	@Override
	public ResponseEntity<?> fetchPwdbyEmail(String email) 
	{
		String findPwd = repo.findPwdByEmail(email);
		if(findPwd!=null)
		{
			ResponseStructure<String> responseStructure=new ResponseStructure<>();
			responseStructure.setData(findPwd);
			responseStructure.setHttpStatus(HttpStatus.OK);
			responseStructure.setMessage("User Password  Found  Successfully...!");
			return new ResponseEntity<>(responseStructure,responseStructure.getHttpStatus());
		}
		throw new UserNotFoundException("User Data  Not Found...!!");
		
	}

	@Override
	public ResponseEntity<ResponseStructure<List<UserResponse>>> extractDataFromExcel(MultipartFile file) throws IOException 
	{
		XSSFWorkbook workbook=new XSSFWorkbook(file.getInputStream());
		List<UserResponse> l=new ArrayList<UserResponse>();
		ResponseStructure<List<UserResponse>> response=new ResponseStructure<List<UserResponse>>();

		for (Sheet sheet : workbook)
		{
			for (Row row : sheet) 
			{
				if(row.getRowNum()>0)
				{
					String name=row.getCell(0).getStringCellValue();
					String email=row.getCell(1).getStringCellValue();
					long phno=(long)row.getCell(2).getNumericCellValue();
					String grade=row.getCell(3).getStringCellValue();
					String pwd=row.getCell(4).getStringCellValue();
					
					System.out.println(name +"    "+email +"     "+phno+"     "+grade+"     "+pwd);
					User u=new User();
					u.setName(name);
					u.setEmail(email);
					u.setPhno(phno);
					u.setPwd(pwd);
					u.setConfirmpwd(pwd);
					u.setUserid(email);
					u.setId(111);
					User save = repo.save(u);
					
					UserResponse resp=new UserResponse();
					resp.setId(save.getId());
					resp.setName(save.getName());
					l.add(resp);
					
					
					
					
					
				}
			}
			response.setData(l);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Data Inserted Successfully");
			workbook.close();
			
		}
		return new ResponseEntity<ResponseStructure<List<UserResponse>>>(response,response.getHttpStatus());
		
	}

}
