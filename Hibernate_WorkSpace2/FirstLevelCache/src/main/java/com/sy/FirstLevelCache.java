package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure()
				                               .addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();

		Session session1 = factory.openSession();
		Transaction tc1 = session1.beginTransaction();
		Employee emp1 = session1.get(Employee.class, 11);
		System.out.println(emp1);
		
		Session session2 = factory.openSession();
		Transaction tc2 = session2.beginTransaction();
		Employee emp2 = session2.get(Employee.class, 11);
		System.out.println(emp2);
	}

}
