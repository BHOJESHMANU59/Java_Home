package com.onetoone;

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
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tc = session.beginTransaction();
    	
    	Person p=new Person();
    	p.setP_id(2);
    	p.setPName("Srinath");
    	p.setAge(25);
    	p.setGender("Male");
    	p.setPhno(8861144690l);
    	
    	AdharCard c=new AdharCard();
    	c.setId(102);
    	c.setAdharNo(86067096089l);
    	c.setAddress("Kolar");
    	
    	p.setCard(c);
    	
    	session.save(p);
    	session.save(c);
    	tc.commit();
    }
}
