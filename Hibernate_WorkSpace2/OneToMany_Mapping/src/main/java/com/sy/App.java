package com.sy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Vehicle v1=new Vehicle();
       v1.setVId(101);
       v1.setVName("Royel Enfield");
       v1.setVPrize(150000.00);
       
      Vehicle v2=new Vehicle();
      v2.setVId(102);
      v2.setVName("Benz");
      v2.setVPrize(5500000.00);
      
      Vehicle v3=new Vehicle();
      v3.setVId(103);
      v3.setVName("BMW");
      v3.setVPrize(450000.00);
      
      Vehicle v4=new Vehicle();
      v4.setVId(104);
      v4.setVName("RX100");
      v4.setVPrize(250000.00);
      
      List<Vehicle> ve=new ArrayList<Vehicle>();
      ve.add(v1);
      ve.add(v2);
      
      
      List<Vehicle> ve1=new ArrayList<Vehicle>();
      ve1.add(v3);
      ve1.add(v4);
      
      
      Person p=new Person();
      p.setId(1);
      p.setPName("Srinath");
      p.setPhno(9740443341l);
      p.setVehicle(ve);
      
      Person p1=new Person();
      p1.setId(2);
      p1.setPName("Manoj");
      p1.setPhno(8861144690l);
      p1.setVehicle(ve1);
      
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
