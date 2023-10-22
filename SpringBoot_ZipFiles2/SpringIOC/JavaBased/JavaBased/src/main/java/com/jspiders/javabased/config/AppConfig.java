package com.jspiders.javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspiders.javabased.dto.Address;
import com.jspiders.javabased.dto.User;

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
