package com.referencetype_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext c1 = new ClassPathXmlApplicationContext("com/referencetype_constructor/spring.xml");
		Employee e = (Employee) c1.getBean("emp");
		System.out.println(e);
		
		Employee e1 = (Employee) c1.getBean("emp1");
		System.out.println(e1);

	}
}
