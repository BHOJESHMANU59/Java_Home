package com.sy.CrudOparationUsingJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CrudOparationsJPA 
{
	public void insertEntity()
	{
		EntityManager entityManager=JPAUnit.getEntityManagerFactory().createEntityManager();
		EntityTransaction tc = entityManager.getTransaction();
		
		Person p=new Person();
		p.setId(1);
		p.setName("Srinath");
		p.setGender("Male");
		p.setPhno(9740443341l);
		
		Person p1=new Person();
		p1.setId(2);
		p1.setName("Vinay");
		p1.setGender("Male");
		p1.setPhno(8861144690l);
		
		Person p2=new Person();
		p2.setId(3);
		p2.setName("Yogesh");
		p2.setGender("Male");
		p2.setPhno(8090798349l);
		
		Person p3=new Person();
		p3.setId(4);
		p3.setName("Ravi");
		p3.setGender("Male");
		p3.setPhno(8867799123l);
		
		tc.begin();
		entityManager.persist(p);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		tc.commit();
		
		if(entityManager!=null)
		{
			entityManager.close();
		}
		JPAUnit.close();
	}
	
	public void findEntity()
	{
		EntityManager entityManager=JPAUnit.getEntityManagerFactory().createEntityManager();
		EntityTransaction tc = entityManager.getTransaction();
		
		tc.begin();
		Person p=entityManager.find(Person.class, 2);
		System.out.println(p.getId()+"   "+p.getName()+"  "+p.getGender()+"  "+p.getPhno());
		tc.commit();
		
		if(entityManager!=null)
		{
			entityManager.close();
		}
		
		
	}
	
	public void updateEntity()
	{
		EntityManager entityManager=JPAUnit.getEntityManagerFactory().createEntityManager();
		EntityTransaction tc = entityManager.getTransaction();
		
		tc.begin();
		Person p=entityManager.find(Person.class, 3);
		
		p.setName("Ramya");
		p.setGender("female");
		
		System.out.println(p.getId()+"   "+p.getName()+"  "+p.getGender()+"  "+p.getPhno());

		tc.commit();
		
		if(entityManager!=null)
		{
			entityManager.close();
		}
		
	}
	public void removeEntity()
	{
		EntityManager entityManager=JPAUnit.getEntityManagerFactory().createEntityManager();
		EntityTransaction tc = entityManager.getTransaction();
		
	
		Person p=entityManager.find(Person.class, 3);
		tc.begin();
		entityManager.remove(p);
		tc.commit();
		if(entityManager!=null)
		{
			entityManager.close();
		}
		
		

		
	}

}
