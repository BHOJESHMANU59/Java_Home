package com.sy.MyFirstSpringBootProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestingController {
	
	@RequestMapping("mul")
	public ModelAndView multipy(HttpServletRequest req,HttpServletResponse resp)
	{
		System.out.println("**************Tesing******************");
		
		
		int a=Integer.parseInt(req.getParameter("A"));
	    int b=Integer.parseInt(req.getParameter("B"));
	    int pro=a*b;
	    System.out.println("The Product of A and B :"+pro);
	    
	    ModelAndView mav=new ModelAndView();
	    mav.setViewName("out.jsp");
	    mav.addObject("p",pro);
		return mav;
		
		
	}

}
