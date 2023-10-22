package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure()
        		                             .addAnnotatedClass(Employee.class);
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tc = session.beginTransaction();
        
        Employee e1=new Employee();
        e1.setEmpId(11);
        e1.setEmpName("Manoj");
        e1.setSal(50000);
        
        session.save(e1);
        tc.commit();
        
        
    }
}
