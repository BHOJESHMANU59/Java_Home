package com.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        Vehicle v = (Vehicle) ac.getBean("car");
        v.findTopSpeed();
        System.out.println("----------------------------------------");
        Vehicle v1 = (Vehicle) ac.getBean("bike");
        v1.findTopSpeed();
    }
}
