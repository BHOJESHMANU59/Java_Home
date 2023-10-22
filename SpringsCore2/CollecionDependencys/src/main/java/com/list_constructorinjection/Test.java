package com.list_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/list_constructorinjection/spring.xml");
		College c1 =(College) ac.getBean("col");
		System.out.println(c1);
		
		College c2 =(College) ac.getBean("col1");
		System.out.println(c2);
		
		College c3 =(College) ac.getBean("col2");
		System.out.println(c3);
	}

}
