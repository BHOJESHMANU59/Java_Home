package com.sy.SpringFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sy.SpringFirstProject.controller.StudentController;

public class App 
{
	
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        StudentController s = ac.getBean(StudentController.class);
        s.getDetails(1);
        s.getDetails(4);
        System.out.println("----------------------");
        
        s.updateData(4);
        
        System.out.println("-----------------------");
        
        s.getDetails(4);
        
        System.out.println("-----------------------");
        
        s.deleteData(4);
        
        
        
        
//        s.insertData();
        
        
    }
}
