package com.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		
		Person p=new Person();
		p.setId(1);
		p.setName("Srinath");
		p.setPhno(4204204200l);
		
		session.save(p);
		tc.commit();
		
	
	}
}
