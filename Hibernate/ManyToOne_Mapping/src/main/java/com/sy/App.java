package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Person p=new Person();
        p.setId(1);
        p.setPName("Vinay");
        p.setPhno(9740443341l);
        
        
        Person p1=new Person();
        p1.setId(2);
        p1.setPName("Ravi");
        p1.setPhno(8861144690l);
    	
    	
    	
    	Vehicle v1=new Vehicle();
        v1.setVId(1001);
        v1.setVName("Royel Enfield");
        v1.setVPrize(150000.00);
        v1.setPer(p);
        
       Vehicle v2=new Vehicle();
       v2.setVId(1002);
       v2.setVName("Benz");
       v2.setVPrize(550000.00);
       v2.setPer(p);
       
       Vehicle v3=new Vehicle();
       v3.setVId(1003);
       v3.setVName("BMW");
       v3.setVPrize(450000.00);
       v3.setPer(p1);
       
       Vehicle v4=new Vehicle();
       v4.setVId(1004);
       v4.setVName("RX100");
       v4.setVPrize(250000.00);
       v4.setPer(p1);
       
       
       Configuration cfg=new Configuration();
       cfg.configure();
       cfg.addAnnotatedClass(Person.class);
       cfg.addAnnotatedClass(Vehicle.class);
       
       
       SessionFactory factory = cfg.buildSessionFactory();
       
       Session session = factory.openSession();
       
       Transaction tc = session.beginTransaction();
       
       
       session.save(v1);
       session.save(v2);
       session.save(v3);
       session.save(v4);
       session.save(p);
       session.save(p1);
       
       tc.commit();
    }
}
