package com.sy;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaRead {
	
	public void insert() {
		Student std = new Student();
		std.setSId(101);
		std.setSname("Srinath");
		std.setMarks(80.32);

		Student std1 = new Student();
		std1.setSId(102);
		std1.setSname("Yogesh");
		std1.setMarks(85.35);

		Student std2 = new Student();
		std2.setSId(103);
		std2.setSname("Manoj");
		std2.setMarks(90.19);

		Student std3 = new Student();
		std3.setSId(104);
		std3.setSname("Yogesh");
		std3.setMarks(93.79);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();

		session.save(std);
		session.save(std1);
		session.save(std2);
		session.save(std3);

		tc.commit();
	}

	public void criteriaget() {
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		
	    Criteria cr=session.createCriteria(Student.class);
	    List<Student> st=cr.list();
	    for(Student s:st)
	    {
	    	System.out.println(s);
	    }
	    tc.commit();

	}
	
	public void restrictionsget()
	{
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		Criteria cr=session.createCriteria(Student.class);
		cr.add(Restrictions.gt("sId", 101));
		List<Student> st=cr.list();
	    for(Student s:st)
	    {
	    	System.out.println(s);
	    }
	    tc.commit();
		
	}
	
	public void projectionsget()
	{
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		Criteria cr=session.createCriteria(Student.class);
		cr.setProjection(Projections.max("sId"));
		List<Integer> st=cr.list();
	    for(Integer s:st)
	    {
	    	System.out.println(s);
	    }
	    tc.commit();
		
	}

}
