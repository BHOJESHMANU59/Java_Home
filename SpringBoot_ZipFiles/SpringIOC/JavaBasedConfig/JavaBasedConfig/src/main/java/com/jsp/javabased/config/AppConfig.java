package com.jsp.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jsp.javabased.dto.Address;
import com.jsp.javabased.dto.User;

@Configuration
public class AppConfig {

	@Bean
	public User getUser()
	{
		return new User();
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address();
	}
}
