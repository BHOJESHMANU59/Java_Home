package com.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
       Products pr=(Products) ac.getBean("pro");
       

      pr.check();
       
    }
}
