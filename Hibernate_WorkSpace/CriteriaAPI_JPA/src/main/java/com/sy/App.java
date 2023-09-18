package com.sy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("manu");
        EntityManager em = emf.createEntityManager();
       
        
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Student> cq=cb.createQuery(Student.class);
        Root<Student> std=cq.from(Student.class);
        CriteriaQuery<Student> select=cq.select(std);
        TypedQuery<Student> query=em.createQuery(select);
        List<Student> rs=query.getResultList();
        for(Student s:rs)
        {
        	System.out.println(s);
        }
    }
}
