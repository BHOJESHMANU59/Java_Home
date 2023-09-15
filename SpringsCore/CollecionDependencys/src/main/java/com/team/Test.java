package com.team;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) {
ApplicationContext c1=new ClassPathXmlApplicationContext("com/team/configuration.xml");
		
		Team t=(Team)c1.getBean("team");
		System.out.println(t);
	}

}
