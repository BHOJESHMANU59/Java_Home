package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tc = session.beginTransaction();
		
		Student std=session.get(Student.class, 101);
		System.out.println(std);
		tc.commit();
		
		System.out.println("-----------------------------");
		
		Session session1 = factory.openSession();

		Transaction tc1 = session1.beginTransaction();
		
		Student std1=session1.get(Student.class, 101);
		System.out.println(std1);
		
		tc1.commit();
		System.out.println("-----------------------------");
		
		Session session2 = factory.openSession();

		Transaction tc2 = session.beginTransaction();
		
		Student std2=session2.get(Student.class, 101);
		System.out.println(std2);
	
		tc2.commit();

	}
}
