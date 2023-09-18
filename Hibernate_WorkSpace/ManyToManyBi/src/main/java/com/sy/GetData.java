package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure()
				                               .addAnnotatedClass(Emplyoee.class)
				                               .addAnnotatedClass(Company.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tc = session.beginTransaction();
		
		Company com = session.get(Company.class, 1);
		
		if(com!=null)
		{
			System.out.println(com.getCId()+"\n"+com.getCName()+"\n"+com.getAddress());
		}
		else
		{
			System.out.println("Data Not Found");
		}
		
	}

}
