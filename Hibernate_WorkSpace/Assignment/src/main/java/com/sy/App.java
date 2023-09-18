package com.sy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 UserInfo u1=new UserInfo();
         u1.setId(1);
         u1.setName("Manoj");
         u1.setPwd("Manu@123");
         
         String s1=u1.getPwd();
         String s2="";
         for(int i=0;i<s1.length();i++)
         {
         	if(i==0 && s1.charAt(i)>=65 && s1.charAt(i)<=90)
         	{
         		s2=s2+(char)(s1.charAt(i)+32);
         	}
         	else
         	{
         		s2=s2+s1.charAt(i);
         	}
         		
         	
         }
         
         System.out.println(s2);
         u1.setPwd(s2);
    	
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(UserInfo.class);
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tc = session.beginTransaction();
        
       
        
        session.save(u1);
        tc.commit();
        
    }
}
