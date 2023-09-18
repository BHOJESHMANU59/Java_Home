package com.jspiders.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.javabased.config.AppConfig;
import com.jspiders.javabased.dto.Address;
import com.jspiders.javabased.dto.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        Address address = applicationContext.getBean(Address.class);
        address.setBuildingName("Qspider");
        address.setBuildingNo(125);
        address.setCity("Mysuru");
        address.setPincode(560003);
        address.setState("karnataka");
        address.setStreetName("MG Road");
        
        User user = applicationContext.getBean(User.class);
        user.setAddress(address);
        user.setEmailId("basaveshpadashetty@gmail.com");
        user.setPhno(7022356101l);
        user.setUserId(201);
        user.setUsername("Basavesh");
       
        System.out.println(user);
    }
}
