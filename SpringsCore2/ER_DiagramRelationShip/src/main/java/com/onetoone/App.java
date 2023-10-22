package com.onetoone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/onetoone/spring.xml");
    	College c =(College) ac.getBean("clg");
    	System.out.println(c);
    	
    	System.out.println("--------------------------------------------------");
    	
    	Branch b =(Branch) ac.getBean("branch1");
    	System.out.println(b);
    	
      	System.out.println("--------------------------------------------------");
    	
    	Student s =(Student) ac.getBean("std1");
    	System.out.println(s);
    }
}
