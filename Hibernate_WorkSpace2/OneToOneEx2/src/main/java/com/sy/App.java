package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    			cfg.configure();
    	cfg.addAnnotatedClass(Person1.class);
    	cfg.addAnnotatedClass(PassPort.class);
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tc = session.beginTransaction();
    	
    	
    	
    	PassPort ps=new PassPort();
    	ps.setPassId(1);
    	ps.setPassName("King");
    	ps.setPassCountry("India");
    	
    	Person1 p=new Person1();
    	p.setId(1);
    	p.setPName("Srinath");
    	p.setPhno(9740443341l);
   
    	p.setPassport(ps);
    	
    	session.save(p);
    	session.save(ps);
    	tc.commit();
       
    }
}
