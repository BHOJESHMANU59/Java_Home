package com.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/sy/springs.xml");
    	Employee em =(Employee)ac.getBean("emp");
    	System.out.println(em);
    	
    	Employee em1 =(Employee)ac.getBean("emp1");
    	System.out.println(em1);
    	
    	Employee em2 =(Employee)ac.getBean("emp2");
    	System.out.println(em2);
    	
    	
    }
}
