package com.set_setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/set_setterinjection/spring.xml");
		Mobile m1 =(Mobile) ac.getBean("mob");
		System.out.println(m1);
		
		Mobile m2 =(Mobile) ac.getBean("mob1");
		System.out.println(m2);
		
		Mobile m3 =(Mobile) ac.getBean("mob2");
		System.out.println(m3);
	}

}
