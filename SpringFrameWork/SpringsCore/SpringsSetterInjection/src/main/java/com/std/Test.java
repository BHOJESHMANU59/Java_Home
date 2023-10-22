package com.std;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/std/Spring.xml");
		
		Student s1 =(Student) ac.getBean("std");
		System.out.println(s1);
		
		Student s2 =(Student) ac.getBean("std1");
		System.out.println(s2);
		
		Student s3 =(Student) ac.getBean("std2");
		System.out.println(s3);
		
	}

}
