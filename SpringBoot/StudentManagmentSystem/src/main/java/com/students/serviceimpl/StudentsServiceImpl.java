package com.students.serviceimpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.students.dto.MessageData;
import com.students.dto.StudentResponse;
import com.students.dto.Students;
import com.students.exceptions.StudentDataNotFoundException;
import com.students.exceptions.StudentDetailsNotFoundException;
import com.students.exceptions.StudentIdNotFoundException;
import com.students.repository.StudentsRepository;
import com.students.response.ResponseStructure;
import com.students.service.StudentsService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class StudentsServiceImpl implements StudentsService {
	@Autowired
	private StudentsRepository repo;

	@Autowired
	private JavaMailSender javaMailSender;
	
	
	@Override
	public ResponseStructure<?> savedata(Students std)
	{
		Students s=repo.save(std);
		
		StudentResponse sr=new StudentResponse();
		sr.setSid(s.getSid());
		sr.setSname(s.getSname());
		sr.setMarks(s.getMarks());
		sr.setBranch(s.getBranch());
		sr.setGrade(s.getGrade());
		sr.setEmail(s.getEmail());
		sr.setPhno(s.getPhno());
		ResponseStructure<StudentResponse> responseStructure=new ResponseStructure<>();
		responseStructure.setData(sr);
		responseStructure.setHttpStatus(HttpStatus.CREATED);
		responseStructure.setMessage("Student Data Saved Successfully!!!!");		
		return responseStructure;
	}

	@Override
	public ResponseStructure<?> fetchAll() 
	{
		List<Students> findAll = repo.findAll();
		ResponseStructure<List<StudentResponse>> responseStructure=new ResponseStructure<>();
		List<StudentResponse> l=new ArrayList<StudentResponse>();

		if(!findAll.isEmpty())
		{
			
			for (Students s : findAll)
			{
				StudentResponse sr=new StudentResponse();
				sr.setSid(s.getSid());
				sr.setSname(s.getSname());
				sr.setMarks(s.getMarks());
				sr.setBranch(s.getBranch());
				sr.setGrade(s.getGrade());
				sr.setEmail(s.getEmail());
				sr.setPhno(s.getPhno());
				l.add(sr);
			}
			
			responseStructure.setData(l);
			responseStructure.setHttpStatus(HttpStatus.FOUND);
			responseStructure.setMessage("Student Data Retrived Successfully!!!!");		
			return responseStructure;
		}
		throw new StudentDataNotFoundException("Students Data Not Found");
	}

	@Override
	public ResponseStructure<?> findbyId(int id)
	{
		Optional<Students> findById = repo.findById(id);
		StudentResponse s=new StudentResponse();
		ResponseStructure<StudentResponse> resp=new ResponseStructure<StudentResponse>();
		if(findById.isPresent())
		{
			s.setSid(findById.get().getSid());
			s.setSname(findById.get().getSname());
			s.setMarks(findById.get().getMarks());
			s.setBranch(findById.get().getBranch());
			s.setGrade(findById.get().getGrade());
			s.setEmail(findById.get().getEmail());
			s.setPhno(findById.get().getPhno());
			
			resp.setData(s);
			resp.setHttpStatus(HttpStatus.FOUND);
			resp.setMessage("Student data Retrived by id Successfully!!!");
			return resp;	
		}
		throw new StudentIdNotFoundException("Student Id Not Found");
		
		
	}

	@Override
	public ResponseStructure<?> findbyName(String name) {
		Students findBySname = repo.findBySname(name);
		StudentResponse s=new StudentResponse();
		ResponseStructure<StudentResponse> resp=new ResponseStructure<StudentResponse>();
		if(findBySname!=null)
		{
			s.setSid(findBySname.getSid());
			s.setSname(findBySname.getSname());
			s.setMarks(findBySname.getMarks());
			s.setBranch(findBySname.getBranch());
			s.setGrade(findBySname.getGrade());
			s.setEmail(findBySname.getEmail());
			s.setPhno(findBySname.getPhno());
			
			resp.setData(s);
			resp.setHttpStatus(HttpStatus.FOUND);
			resp.setMessage("Student data Retrived by Name Successfully!!!");
			return resp;
		}
		throw new StudentDetailsNotFoundException("Student Details Not Found");
	}

	@Override
	public ResponseStructure<?> findByPhno(long phno) 
	{
		Students findByPhno = repo.findByPhno(phno);
		StudentResponse sr=new StudentResponse();
		ResponseStructure<StudentResponse> resp=new ResponseStructure<StudentResponse>();
		
		if(findByPhno!=null)
		{
			sr.setSid(findByPhno.getSid());
			sr.setSname(findByPhno.getSname());
			sr.setMarks(findByPhno.getMarks());
			sr.setBranch(findByPhno.getBranch());
			sr.setGrade(findByPhno.getGrade());
			sr.setEmail(findByPhno.getEmail());
			sr.setPhno(findByPhno.getPhno());
			resp.setData(sr);
			resp.setHttpStatus(HttpStatus.OK);
			resp.setMessage("Student data Retrived by Name Successfully!!!");
			return resp;
			
		}
		throw new StudentDetailsNotFoundException("Student Details Not Found");
	}

	@Override
	public ResponseStructure<List<String>> findEmailByGrade(String grade) {
		List<String> allEmailsByGrade = repo.getAllEmailsByGrade(grade);
		if(!allEmailsByGrade.isEmpty())
		{
			ResponseStructure<List<String>> responseStructure=new ResponseStructure<List<String>>();
			responseStructure.setData(allEmailsByGrade);
			responseStructure.setHttpStatus(HttpStatus.FOUND);
			responseStructure.setMessage("Student Emails Retrived Successfully");
			return responseStructure;
		}
		throw new StudentDetailsNotFoundException("Student data Not Found!!!!!!");
	}
	
	@Override
	public ResponseStructure<StudentResponse> update(Students std) 
	{
		Students s = repo.save(std);
		
		StudentResponse sr=new StudentResponse();
		
		ResponseStructure<StudentResponse> response=new  ResponseStructure<StudentResponse>();
		
		if(s!=null)
		{
			sr.setSid(s.getSid());
			sr.setSname(s.getSname());
			sr.setMarks(s.getMarks());
			sr.setBranch(s.getBranch());
			sr.setGrade(s.getGrade());
			sr.setEmail(s.getEmail());
			sr.setPhno(s.getPhno());
			response.setData(sr);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Student Updated Suessfully");
			return response;

		}
		throw new StudentDataNotFoundException("Student Data Not Updated");
	}
	
	@Override
	public ResponseStructure<StudentResponse> updateName(int id, String name) 
	{
		Optional<Students> findById = repo.findById(id);
		if(findById.isPresent())
		{
			Students std = findById.get();
			std.setSname(name);
			repo.save(std);
			
			StudentResponse sr=new StudentResponse();
			
			sr.setSid(std.getSid());
			sr.setSname(std.getSname());
			sr.setMarks(std.getMarks());
			sr.setBranch(std.getBranch());
			sr.setGrade(std.getGrade());
			sr.setEmail(std.getEmail());
			sr.setPhno(std.getPhno());
			
			ResponseStructure<StudentResponse> response=new  ResponseStructure<StudentResponse>();
			
			response.setData(sr);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Student Name Updated Suessfully");
			return response;
		}
		
		throw new StudentIdNotFoundException("Student Details Not Found");
	}
	
	@Override
	public ResponseStructure<StudentResponse> updatePhno(String name, long phno)
	{
		 Students findBySname = repo.findBySname(name);
		if(findBySname!=null)
		{
		    int updatePhno = repo.updatePhno(name,phno);
		    
		    StudentResponse sr=new StudentResponse();
		    
			Students std = repo.findBySname(name);
			sr.setSid(std.getSid());
			sr.setSname(std.getSname());
			sr.setMarks(std.getMarks());
			sr.setBranch(std.getBranch());
			sr.setGrade(std.getGrade());
			sr.setEmail(std.getEmail());
			sr.setPhno(std.getPhno());
			
			ResponseStructure<StudentResponse> response=new  ResponseStructure<StudentResponse>();
			
			response.setData(sr);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Student Phnoe Number Updated Suessfully "+updatePhno);
			return response;
			
			
		}
		throw new StudentDetailsNotFoundException("Student Details Not Found");
	}

	@Override
	public ResponseStructure<StudentResponse> updateEmailByPhno(long phno, String email)
	{
		Students findByPhno = repo.findByPhno(phno);
		if(findByPhno!=null)
		{
			findByPhno.setEmail(email);
			Students std = repo.save(findByPhno);
			
          StudentResponse sr=new StudentResponse();
			
			sr.setSid(std.getSid());
			sr.setSname(std.getSname());
			sr.setMarks(std.getMarks());
			sr.setBranch(std.getBranch());
			sr.setGrade(std.getGrade());
			sr.setEmail(std.getEmail());
			sr.setPhno(std.getPhno());
			
			ResponseStructure<StudentResponse> response=new  ResponseStructure<StudentResponse>();
			
			response.setData(sr);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Student Email Updated using Phone Number  Successfully!!!!");
			return response;
			
		}
		throw new StudentDataNotFoundException("Student Phnoe Number Is Incorrect Or Not Found");
	}
	
	@Override
	public ResponseStructure<StudentResponse> deleteById(int id)
	{
		Optional<Students> findById = repo.findById(id);
		if(findById.isPresent())
		{
			Students std = findById.get();
			repo.deleteById(id);
			
			 StudentResponse sr=new StudentResponse();
			 
				
				sr.setSid(std.getSid());
				sr.setSname(std.getSname());
				sr.setMarks(std.getMarks());
				sr.setBranch(std.getBranch());
				sr.setGrade(std.getGrade());
				sr.setEmail(std.getEmail());
				sr.setPhno(std.getPhno());
				
				ResponseStructure<StudentResponse> response=new  ResponseStructure<StudentResponse>();
				
				response.setData(sr);
				response.setHttpStatus(HttpStatus.OK);
				response.setMessage("Student Data Deleted Successfully!!!!");
				return response;
		}
		throw new StudentIdNotFoundException("Student Id Not Found Or Incorrect Student Id");
	}
	
	@Override
	public ResponseStructure<List<StudentResponse>> deleteAll() 
	{
		List<Students> findAll = repo.findAll();
		List<StudentResponse> std=new ArrayList<StudentResponse>();
		if(!findAll.isEmpty())
		{
			for (Students s : findAll)
			{
				StudentResponse sr=new  StudentResponse();
				sr.setSid(s.getSid());
				sr.setSname(s.getSname());
				sr.setMarks(s.getMarks());
				sr.setBranch(s.getBranch());
				sr.setGrade(s.getGrade());
				sr.setEmail(s.getEmail());
				sr.setPhno(s.getPhno());
				std.add(sr);
				
			}
			repo.deleteAll();
			ResponseStructure<List<StudentResponse>> response=new  ResponseStructure<List<StudentResponse>>();
			
			response.setData(std);
			response.setHttpStatus(HttpStatus.OK);
			response.setMessage("Student Data Deleted Successfully!!!!");
			return response;
		}
		
		
		throw new StudentDataNotFoundException("Student Data Deleted Successfully @@!!");
	}
	
	
	
	
	
	@Override
	public ResponseStructure<List<StudentResponse>> extractDataFromExcel(MultipartFile file) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook(file.getInputStream());
		List<StudentResponse> ls=new ArrayList<StudentResponse>();
		
		ResponseStructure<List<StudentResponse>> resp=new ResponseStructure<List<StudentResponse>>();
		
		for (Sheet sheet : workbook) 
		{
			for(Row row:sheet)
			{
				if(row.getRowNum()>0)
				{
					String name=row.getCell(0).getStringCellValue();
					String branch=row.getCell(1).getStringCellValue();
					String email=row.getCell(2).getStringCellValue();
					long phno=(long)row.getCell(3).getNumericCellValue();
					double marks=(double)row.getCell(4).getNumericCellValue();
					String grade=row.getCell(5).getStringCellValue();
					String pwd=row.getCell(6).getStringCellValue();
					
					System.out.println("Name :"+name +"\nBranch :"+branch +" \nEmil: "+email+"\nPhno: "+phno+"\nMarks: "+marks+"\nGrade : "+grade+"\nPwd :"+pwd);
				Students s=new Students();
				s.setSname(name);
				s.setBranch(branch);
				s.setEmail(email);
				s.setPhno(phno);
				s.setMarks(marks);
				s.setGrade(grade);
				s.setPwd(pwd);
				
				Students s1 = repo.save(s);
				
				StudentResponse sr=new StudentResponse();
				sr.setSid(s1.getSid());
				sr.setSname(s1.getSname());
				sr.setBranch(s1.getBranch());
				sr.setEmail(s1.getEmail());
				sr.setPhno(s1.getPhno());
				sr.setMarks(s1.getMarks());
				sr.setGrade(s1.getGrade());
				
				ls.add(sr);
				
				
				}
			}
			resp.setData(ls);
			resp.setHttpStatus(HttpStatus.OK);
			resp.setMessage("Data Inserted Successfully");
			workbook.close();
			
			
		}
		return resp;
	}
		
	
	@Override
	public String toString() {
		return "StudentsServiceImpl [repo=" + repo + "]";
	}

	@Override
	public ResponseStructure<String> writeToExcel(String filepath) throws IOException
	{
		List<Students> std=repo.findAll();
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		
		Row row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("SId");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Branch");
		row.createCell(3).setCellValue("Email");
		row.createCell(4).setCellValue("Phno");
		row.createCell(5).setCellValue("Marks");
		row.createCell(6).setCellValue("Grade");
		row.createCell(7).setCellValue("Password");
		
		int rowNum=1;
		for (Students s : std) 
		{
			Row rows = sheet.createRow(rowNum++);
			rows.createCell(0).setCellValue(s.getSid());
			rows.createCell(1).setCellValue(s.getSname());
			rows.createCell(2).setCellValue(s.getBranch());
			rows.createCell(3).setCellValue(s.getEmail());
			rows.createCell(4).setCellValue(s.getPhno());
			rows.createCell(5).setCellValue(s.getMarks());
			rows.createCell(6).setCellValue(s.getGrade());
			rows.createCell(7).setCellValue(s.getPwd());
			
		}
		
		FileOutputStream outputStream=new FileOutputStream(filepath);
		workbook.write(outputStream);
		
		workbook.close();
		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
		responseStructure.setData(filepath);
		responseStructure.setHttpStatus(HttpStatus.OK);
		responseStructure.setMessage("Data Transfered to Excel Sheet!!!");
		
		return responseStructure;
	}

	@Override
	public ResponseEntity<String> sendMail(MessageData messageData) 
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(messageData.getTo());
		message.setSubject(messageData.getSubject());
		message.setText(messageData.getText()+
				        "\n\nThanks & Regards"+
			           	"\n"+messageData.getSenderName()+
			           	"\n"+messageData.getSenderAddress());
		message.setSentDate(new Date());
		
		
		javaMailSender.send(message);
		
		return new ResponseEntity<String>("Mail Sent Successfully!!",HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<?> sendMimeMessage(MessageData data) throws MessagingException
	{
		MimeMessage mime=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mime,true);
		helper.setTo(data.getTo());
		helper.setSubject(data.getSubject());
		
		helper.setSentDate(new Date());
		FileSystemResource file=new FileSystemResource(new File("C:\\Users\\LENOVO\\Pictures\\Saved Pictures\\Lion.jpg"));
		
		helper.addAttachment("Lion.jpg", file);
		
		String body = data.getText()
		+"<br><br><h4>Thanks & Regards"
		+data.getSenderName()+"<br>"
		+data.getSenderAddress()+"</h4>"
		
		+"<img src=\"https://www.jspiders.com/_nuxt/img/logo_jspiders.3b552d0.png\" width=\"250\" />";
		
		helper.setText(body, true);
		
		
		
		javaMailSender.send(mime);
		
		
		return new ResponseEntity<String>("Mail Sent Successfully!!",HttpStatus.OK);
		
	}

	

	

	

	

}
