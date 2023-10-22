package com.students.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) 
	{
		List<ObjectError> allErrors=ex.getAllErrors();
		Map<String, String> errors=new HashMap<String, String>();
		for (ObjectError error : allErrors) 
		{
			FieldError fieldError=(FieldError)error;
			String message = fieldError.getDefaultMessage();
			String field = fieldError.getField();
			errors.put(field, message);
			
		}
		//return super.handleMethodArgumentNotValid(ex, headers, status, request);
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST) ;
	}

	@ExceptionHandler(StudentDataNotFoundException.class)
	public ResponseEntity<?> handlerStudentNotFoundException(StudentDataNotFoundException ex,HttpServletRequest req)
	{
		ApiError error=new ApiError();
		error.setEndpoint(req.getRequestURI());
		error.setMessage(ex.getMessage());
	    error.setLocalDateTime(LocalDateTime.now());
	    error.setHttpStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(error, error.getHttpStatus());
		
	}
	
	@ExceptionHandler(StudentIdNotFoundException.class)
	public ResponseEntity<?> handlerStudentIdNotFoundException(StudentIdNotFoundException ex,HttpServletRequest req)
	{
		ApiError error=new ApiError();
		error.setEndpoint(req.getRequestURI());
		error.setMessage(ex.getMessage());
	    error.setLocalDateTime(LocalDateTime.now());
	    error.setHttpStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(error, error.getHttpStatus());
		
	}
	
	@ExceptionHandler(StudentDetailsNotFoundException.class)
	public ResponseEntity<?> handlerStudentDetailsNotFoundException(StudentDetailsNotFoundException ex,HttpServletRequest req)
	{
		ApiError error=new ApiError();
		error.setEndpoint(req.getRequestURI());
		error.setMessage(ex.getMessage());
	    error.setLocalDateTime(LocalDateTime.now());
	    error.setHttpStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(error, error.getHttpStatus());
		
	}

}
