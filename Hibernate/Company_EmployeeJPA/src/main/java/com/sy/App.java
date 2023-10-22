package com.sy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manu");
       EntityManager entityManager = entityManagerFactory.createEntityManager();
       EntityTransaction tc = entityManager.getTransaction();
       
       Employee e1=new Employee();
       e1.setEName("Divay");
       e1.setSal(50000.00);
      
       
       Employee e2=new Employee();
       e2.setEName("Kavya");
       e2.setSal(45000.00);
       
       Employee e3=new Employee();
       e3.setEName("Ramya");
       e3.setSal(60000.00);
       
       Company c=new Company();
       c.setCName("Wipro");
       c.setAddress("Bangalore");
       c.getEmp().add(e1);
       c.getEmp().add(e2);
       c.getEmp().add(e3);
       
       e1.setCom(c);
       e2.setCom(c);
       e3.setCom(c);
       
       tc.begin();
       entityManager.persist(c);
       entityManager.persist(e1);
       entityManager.persist(e2);
       entityManager.persist(e3);
       
       tc.commit();
       
    }
}
