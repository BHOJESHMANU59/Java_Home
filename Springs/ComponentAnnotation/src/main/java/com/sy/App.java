package com.sy;

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
       User u = (User) ac.getBean(User.class);
       
       System.out.println(u);
       u.prod();
       
//       Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Products.class);
//       SessionFactory factory = cfg.buildSessionFactory();
//       Session session = factory.openSession();
//       Transaction tc = session.beginTransaction();
//       session.save(u);
//       session.save(u.getPro());
//       tc.commit();
       
       
    }
}
