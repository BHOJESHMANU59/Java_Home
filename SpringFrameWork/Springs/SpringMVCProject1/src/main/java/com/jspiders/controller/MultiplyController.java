package com.jspiders.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiplyController {
	@RequestMapping("/multiply")
	public ModelAndView multiply(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("A"));
		int b=Integer.parseInt(req.getParameter("B"));
		int c=a*b;
		
		System.out.println("The Product of A and B is : "+c);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("product", c);
		return mav;
		
	}
	@RequestMapping("/addition")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		int a=Integer.parseInt(req.getParameter("A"));
		int b=Integer.parseInt(req.getParameter("B"));
		int c=a+b;
		
		System.out.println("The Product of A and B is : "+c);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("add", c);
		return mav;
		
	}

}
