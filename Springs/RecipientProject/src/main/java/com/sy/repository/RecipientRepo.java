package com.sy.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sy.entity.Recipient;


@Repository
public class RecipientRepo {

	@Autowired
	private Recipient recipient;
	public String creditAmount(int id, String name, double amt) {
	
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Recipient.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		recipient.setId(id);
		recipient.setName(name);
		recipient.setAmt(amt);
		session.save(recipient);
		tc.commit();
		
		
		return "Amount credited Successfully!!!";
	}
	public String updateName(int id, String name) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Recipient.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		Recipient re = session.get(Recipient.class, id);
		re.setName(name);
		session.update(re);
		tc.commit();
		return "Updated Successfully";
		
	}
	public String delete(int id) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Recipient.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
	    Recipient del = session.find(Recipient.class, id);
	    session.delete(del);
	    tc.commit();

		return "Data Deleted Successfully";
	}

	public List<Recipient> fetch() {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Recipient.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tc = session.beginTransaction();
		
		Query query = session.createQuery("From Recipient");
		List<Recipient> l1 = query.list();
		return l1;
	}

}
