package com.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.products.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	// to read the data from appication.property file(2nd way)
	@Autowired
	private Environment env;
	
	// To fetch or read the data From application.proporty file (1st way)
	@Value("${my.Project.Name}")
	private String Name;
	
	@RequestMapping("product")
	public ModelAndView post(HttpServletResponse resp,HttpServletRequest req)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		double price=Double.parseDouble(req.getParameter("price"));
		
		System.out.println(id+"  "+name+"   "+price);
		
		String msg=service.display(id,name,price);
		System.out.println("Project Name : "+Name);
		System.out.println("Project ClassName : "+env.getProperty("myProjectClassName"));
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("pro", msg);
		
		return mav;
		
	}
	

}
