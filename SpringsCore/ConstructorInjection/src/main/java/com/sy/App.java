package com.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/sy/spring.xml");
    	Person p1 = (Person) ac.getBean("per");
    	System.out.println(p1);
    	
    	Person p2 = (Person) ac.getBean("per1");
    	System.out.println(p2);
    	
    	Person p3 = (Person) ac.getBean("per2");
    	System.out.println(p3);
    }
}
