package com.sy;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class GetDataUsingHQL
{
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure()
				                             .addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		
		List<Employee> qlist = query.list();
		
		for (Employee e : qlist)
		{
			System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getSal());
			
		}
	}

}
