package com.set_constructorinjecion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/set_constructorinjecion/spring.xml");
		
		Country c1 =(Country) ac.getBean("con");
		System.out.println(c1);
		
		Country c2 =(Country) ac.getBean("con1");
		System.out.println(c2);
		
		Country c3 =(Country) ac.getBean("con2");
		System.out.println(c3);
	}

}
