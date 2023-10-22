package com.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	
    	// Scope="prototype"
    	Employee e = (Employee) ac.getBean("emp");
    	System.out.println(e);
    	
    	Employee e1 = (Employee) ac.getBean("emp");
    	System.out.println(e1);
    	
    	Employee e4 = (Employee) ac.getBean("emp");
    	System.out.println(e4);
    	
    	System.out.println("-----------------------------------------------------");
    	
    	//Scope="singleton
    	
    	Employee e2 = (Employee) ac.getBean("emp1");
    	System.out.println(e2);
    	
    	Employee e3 = (Employee) ac.getBean("emp1");
    	System.out.println(e3);
    	
    }
}
