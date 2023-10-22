package com.sy.Products_CustomersInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ac=new ClassPathXmlApplicationContext("springs.xml");
         Products pr=(Products) ac.getBean("pro");
         System.out.println(pr);
         
    }
}
