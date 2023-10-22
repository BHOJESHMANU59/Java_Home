package com.signup.exceptions;

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
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler
{
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) 
	{
		List<ObjectError> allErrors = ex.getAllErrors();
		
		Map<String,String> errors=new HashMap<String, String>();
		
		for (ObjectError error : allErrors) 
		{
		   FieldError fieldError=(FieldError)error;
		   String defaultMessage = fieldError.getDefaultMessage();
		   String field = fieldError.getField();
		   errors.put(defaultMessage, field);
			
		}
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException exception,HttpServletRequest request)
	{
		ErrorStructure error = new ErrorStructure();
		error.setMessage(exception.getMessage());;
		error.setLocalDateTime(LocalDateTime.now());
		error.setEndpoint(request.getRequestURI());
		error.setHttpStatus(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(error, error.getHttpStatus());
	}

}
