package com.onetomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/onetomany/spring.xml");
		System.out.println(ac.getBean("comp"));
		
		System.out.println("------------------------------------------------");
		
		System.out.println(ac.getBean("emp1"));
		
		System.out.println("------------------------------------------------");
		
		System.out.println(ac.getBean("emp2"));
	}

}
