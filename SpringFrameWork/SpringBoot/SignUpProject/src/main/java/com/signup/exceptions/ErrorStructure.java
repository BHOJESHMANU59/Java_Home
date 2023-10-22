package com.signup.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class ErrorStructure {
	private String message;
	private LocalDateTime localDateTime;
	private String endpoint;
	private HttpStatus httpStatus;
	

}
