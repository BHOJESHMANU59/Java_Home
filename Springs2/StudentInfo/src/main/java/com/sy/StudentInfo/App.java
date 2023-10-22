package com.sy.StudentInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        Student_Data st = (Student_Data) ac.getBean("std");
        System.out.println(st);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student_Data.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tc = session.beginTransaction();
        
        session.save(st);
        tc.commit();
        
        
    }
}
