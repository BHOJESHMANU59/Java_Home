package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.dto.Address;
import com.jsp.dto.User;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext  applicationContext= new ClassPathXmlApplicationContext("META-INF/beans.xml");
      
      User user =applicationContext.getBean(User.class);
      System.out.println(user);
     Address address   = applicationContext.getBean(Address.class);
     System.out.println(address);
     
     
     
    }
}
