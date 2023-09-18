package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Emplyoee e1=new Emplyoee();
    	e1.setEId(101);
    	e1.setEName("Srinath");
    	e1.setPhno(9740443341l);
    	
    	
    	Emplyoee e2=new Emplyoee();
    	e2.setEId(102);
    	e2.setEName("Yogesh");
    	e2.setPhno(8861144690l);
    	
    	Company com=new Company();
    	com.setCId(1);
    	com.setCName("Wipro");
    	com.setAddress("Bangalore");
    	com.getEmp().add(e1);
    	com.getEmp().add(e2);
    	
    	e1.setComp(com);
    	e2.setComp(com);
    	
    	Configuration cfg=new Configuration().configure()
    			                             .addAnnotatedClass(Emplyoee.class)
    			                             .addAnnotatedClass(Company.class);
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Transaction tc = session.beginTransaction();
    			                               
    	session.save(e1);
    	session.save(e2);
    	session.save(com);
    	
    	
    	tc.commit();
        
    }
}
