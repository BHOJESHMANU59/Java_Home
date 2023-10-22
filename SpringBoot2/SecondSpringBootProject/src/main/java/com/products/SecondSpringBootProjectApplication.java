package com.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.products.entity.Products;

@SpringBootApplication
public class SecondSpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SecondSpringBootProjectApplication.class, args);
		Products p = context.getBean(Products.class);
		System.out.println(p);
	}

}
