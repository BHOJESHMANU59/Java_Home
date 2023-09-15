package com.jsp.sprcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.sprcore.appconfig.AppConfig;
import com.jsp.sprcore.dto.Address;
import com.jsp.sprcore.dto.User;

/**
 * Hello world!
 *
 */
public class App 
{
    private static User user;

    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    	Address address = applicationContext.getBean(Address.class);


    	address.setBuildingName("jspider");
    	address.setBuildingNo(1541);
    	address.setCity("Bengaluru");
    	address.setPincode(560002);
    	address.setState("karnataka");
    	address.setStreetName("Lalbagh road");

    	User user = applicationContext.getBean(User.class);

    	user.setAddress(address);
    	user.setEmailId("amarkumbar@gmail.com");
    	user.setPhno(7022561003l);
    	user.setUserId(101);
    	user.setUsername("Amar");

    	System.out.println(user);



    }
}
