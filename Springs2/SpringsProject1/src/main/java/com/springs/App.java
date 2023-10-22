package com.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
        Shape bean = (Shape) ap.getBean("sh");
        System.out.println(bean);
        
        Area area = (Area) ap.getBean("area1");
        System.out.println(area);
        
        System.out.println("The value of x is "+area.getX());
        System.out.println("The value of y is "+area.getY());
   
     
    }
}
