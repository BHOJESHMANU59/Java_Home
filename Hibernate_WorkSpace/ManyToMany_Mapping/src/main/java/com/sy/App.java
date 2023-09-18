package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Products p1=new Products();
    	p1.setPId(1);
    	p1.setPName("Shirt");
    	p1.setPrice(599.00);
    	
    	Products p2=new Products();
    	p2.setPId(2);
    	p2.setPName("Pant");
    	p2.setPrice(899.00);
    	
    	Products p3=new Products();
    	p3.setPId(1);
    	p3.setPName("Shoes");
    	p3.setPrice(999.00);
    	
    	Products p4=new Products();
    	p4.setPId(1);
    	p4.setPName("Laptop");
    	p4.setPrice(59999.00);
    	
    	Customers c1=new Customers();
    	c1.setCId(101);
    	c1.setCName("Yogesh");
    	c1.setPhno(9740443341l);
    	
    	Customers c2=new Customers();
    	c2.setCId(101);
    	c2.setCName("Yogesh");
    	c2.setPhno(9740443341l);
    	
    	
    	p1.getCust().add(c1);
    	p3.getCust().add(c1);
    	
    	p2.getCust().add(c2);
    	p2.getCust().add(c2);
    	
 
    	
    	
    	Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Products.class);
        cfg.addAnnotatedClass(Customers.class);
        
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tc = session.beginTransaction();
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(p4);
        session.save(c1);
        session.save(c2);
        
        tc.commit();
        
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
     
    }
}
