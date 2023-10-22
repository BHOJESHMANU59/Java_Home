package com.referencetype_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/referencetype_setter/spring.xml");
		College c =(College) ac.getBean("col");
		System.out.println(c);
		
		System.out.println(c.getStds().getClass());
		
		College c1 =(College) ac.getBean("col1");
		System.out.println(c1);
	}

}
