package com.sy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Products p = (Products) ac.getBean("pro");
		System.out.println(p);
		p.check();
		p.manufacture();
		
		
		System.out.println("-------------------");
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productsdb","root","manu");
		
		PreparedStatement pstmt = con.prepareStatement("insert into products values(?,?,?");
		
		int id=p.getPid();
		String name=p.getPname();
		double price=p.getPrice();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3,price);
		
		 boolean b = pstmt.execute();
		System.out.println(b);
		
		pstmt.close();
		con.close();
		
	
        
        
        
	}
}
