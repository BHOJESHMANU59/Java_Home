package com.map_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test 
{
	public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("com/map_constructorinjection/spring.xml");
		
		Employee e1 =(Employee) ac.getBean("emp");
		System.out.println(e1);
		
		Employee e2 =(Employee) ac.getBean("emp1");
		System.out.println(e2);
		
		Employee e3 =(Employee) ac.getBean("emp2");
		System.out.println(e3);
	}

}
