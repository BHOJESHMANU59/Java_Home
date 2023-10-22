package com.subject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/subject/spring.xml");
		Subject s =(Subject) ac.getBean("sub");
		System.out.println(s);
		
		Subject s1 =(Subject) ac.getBean("sub1");
		System.out.println(s1);
	}

}
