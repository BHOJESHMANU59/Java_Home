package com.sy.MyFirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sy.MyFirstSpringBootProject.Controller.TestingController;
import com.sy.MyFirstSpringBootProject.Entity.Student;

import ch.qos.logback.core.Context;


@SpringBootApplication
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
//		Student s = context.getBean(Student.class);
//		System.out.println(s);
		
		TestingController test = context.getBean(TestingController.class);
		System.out.println(test);
		
		
	}

}
