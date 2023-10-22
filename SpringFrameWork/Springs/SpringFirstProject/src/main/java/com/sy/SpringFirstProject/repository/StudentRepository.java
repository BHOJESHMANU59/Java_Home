package com.sy.SpringFirstProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sy.SpringFirstProject.entity.Student;

@Repository
public class StudentRepository {
	@Autowired
	private Student s;
	
	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tc = session.beginTransaction();

	public Student save() {
		
		s.setSId(4);
		s.setSName("Dhanush");
		s.setMarks(90.99);
		s.setPhno(8095929730l);

		session.save(s);
		tc.commit();

		return s;
	}

	public Student fetchById(int id) {


		Student s1 = session.get(Student.class, id);
		System.out.println(s1.getSId() + " " + s1.getSName() + "  " + s1.getMarks() + "  " + s1.getPhno());
		return s1;
	}

	public Student update(int id) 
	{
		
		                       
		Student s2 = session.get(Student.class, id);
		s2.setSName("Raghu");
		s2.setPhno(8861144789l);
		
		session.save(s2);
		tc.commit();
		return s2;
	}

	public Student delete(int id) {
		
	
		Student s3 = session.get(Student.class, id);
		
		session.delete(s3);
		tc.commit();
		
		
		
		return null;
	}

}
