package com.jspider.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.product.dto.Products;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("META-INF/beans.xml");
        Products products = applicationContext.getBean(Products.class);
        
        System.out.println(products);
        products.setCompanyName("Nokia");
        System.out.println(products);
    }
}
