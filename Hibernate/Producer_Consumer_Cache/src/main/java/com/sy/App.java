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
        		                             .addAnnotatedClass(Producer.class)
        		                             .addAnnotatedClass(Consumer.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tc = session.beginTransaction();
        
        Producer p1=new Producer();
        p1.setpId(101);
        p1.setpName("Vinay");
        p1.setPrice(99.00);
        p1.setPhno(9740443341l);
        
        Producer p2=new Producer();
        p2.setpId(102);
        p2.setpName("Ravi");
        p2.setPrice(199.00);
        p2.setPhno(8861144690l);
        
        
        Consumer c1=new Consumer();
        c1.setcId(11);
        c1.setcName("Manoj");
        c1.setPhno(8095929730l);
        c1.setPro(p1);
        
        Consumer c2=new Consumer();
        c2.setcId(12);
        c2.setcName("Srinath");
        c2.setPhno(886974010l);
        c2.setPro(p1); 
        
        Consumer c3=new Consumer();
        c3.setcId(13);
        c3.setcName("Yogesh");
        c3.setPhno(9535929730l);
        c3.setPro(p2);
        
        Consumer c4=new Consumer();
        c4.setcId(14);
        c4.setcName("Rohith");
        c4.setPhno(8543159120l);
        c4.setPro(p2);
        
        
        
        p1.getCons().add(c1);
        p1.getCons().add(c2);
        
        p2.getCons().add(c4);
        p2.getCons().add(c3);
        
        
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        session.save(p1);
        session.save(p2);
        
        tc.commit();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
