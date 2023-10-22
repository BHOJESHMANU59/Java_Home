package com.sy.CrudOparationUsingJPA;
// Create a helper class to bootstrap a JPA EntityManagerFactory.

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUnit 
{
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() 
	{
		if(entityManagerFactory==null)
		{
			entityManagerFactory=Persistence.createEntityManagerFactory("manu");
		}
		return entityManagerFactory;
	}
	
	public static void close()
	{
		if(entityManagerFactory!=null)
		{
			entityManagerFactory.close();
		}
	}

	

}
