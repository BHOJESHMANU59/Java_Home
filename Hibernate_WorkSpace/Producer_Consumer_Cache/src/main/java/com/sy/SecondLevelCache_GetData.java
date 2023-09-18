package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondLevelCache_GetData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure()
				                               .addAnnotatedClass(Producer.class)
				                               .addAnnotatedClass(Consumer.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		
		Consumer con = session.get(Consumer.class, 12);
		System.out.println(con);
		tc.commit();
		System.out.println("-------------------------------");
		
		Session session1 = factory.openSession();
		Transaction tc1 = session1.beginTransaction();
		
		Consumer con1 = session1.get(Consumer.class, 12);
		System.out.println(con1);
		tc1.commit();
		
		System.out.println("-------------------------------");
		
		Session session2 = factory.openSession();
		Transaction tc2 = session2.beginTransaction();
		
		Consumer con2 = session2.get(Consumer.class, 12);
		System.out.println(con2);
		tc2.commit();
		
		System.out.println("-------------------------------");
		
		Session session3 = factory.openSession();
		Transaction tc3 = session3.beginTransaction();
		
		Producer load = session3.load(Producer.class, 102);
		load.display();
		tc3.commit();
		
		System.out.println("-------------------------------------");
		
		Session session4 = factory.openSession();
		Transaction tc4 = session4.beginTransaction();
		
		Producer load1 = session4.load(Producer.class, 102);
		load1.display();
		tc4.commit();
	}
	

}
