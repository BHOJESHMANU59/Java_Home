package com.constructor_ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("com/constructor_ambiguity/spring.xml");
    	
//    	Sample s4 =(Sample) ac.getBean("samp3");
//    	System.out.println(s4);
    	
    	Sample s1 =(Sample) ac.getBean("samp");
    	System.out.println(s1);
    	
//    	Sample s2 =(Sample) ac.getBean("samp1");
//    	System.out.println(s2);
//    	
//    	Sample s3 =(Sample) ac.getBean("samp2");
//    	System.out.println(s3);
    }
}
