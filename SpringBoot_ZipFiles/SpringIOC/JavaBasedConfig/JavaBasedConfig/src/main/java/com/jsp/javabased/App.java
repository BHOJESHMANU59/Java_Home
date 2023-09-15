package com.jsp.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.javabased.config.AppConfig;
import com.jsp.javabased.dto.Address;
import com.jsp.javabased.dto.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        User user =applicationContext.getBean(User.class);
        Address address =applicationContext.getBean(Address.class);
        
        System.out.println(user);
        System.out.println(address);
    }
}
