package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/employee/spring.xml");
		Employee e =(Employee) ac.getBean("emp");
		System.out.println(e);
	}

}
