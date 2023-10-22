package com.jspider.product_ann;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.product_ann.config.AppConfig;
import com.jspider.product_ann.dto.IdCard;
import com.jspider.product_ann.dto.Person;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
