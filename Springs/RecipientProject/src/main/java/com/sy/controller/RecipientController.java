package com.sy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sy.entity.Recipient;
import com.sy.service.RecipientService;

@Controller
public class RecipientController 
{
	@Autowired
	private RecipientService service;
	
	@RequestMapping("/recipient")
	public ModelAndView sendMoney(HttpServletRequest req, HttpServletResponse resp)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		double amt =Double.parseDouble(req.getParameter("amt"));
		
		String CreditStatus=service.sendAmount(id,name,amt);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		mav.addObject("CreditStatus",CreditStatus);
		
		
		return mav;
		
	}
	 @RequestMapping("/update")
	 public ModelAndView updateName(HttpServletRequest req, HttpServletResponse resp)
	 {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		
		String UpdateStatus=service.updateName(id,name);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update.jsp");
		mav.addObject("UpdateStatus",UpdateStatus);

		return mav;
		
	}
	 @RequestMapping("/delete")
	 public ModelAndView delete(HttpServletRequest req, HttpServletResponse resp)
	 {
			int id=Integer.parseInt(req.getParameter("id"));
			
			String Delete=service.delete(id);
			
			ModelAndView mav=new ModelAndView();
			mav.setViewName("delete.jsp");
			mav.addObject("Delete",Delete);

			return mav;
		 
	 }
	 @RequestMapping("/fetch")
	 public ModelAndView fetch(HttpServletRequest req, HttpServletResponse resp)
	 {	
			List<Recipient> fetch=service.fetch();
			
			ModelAndView mav=new ModelAndView();
			mav.setViewName("fetch.jsp");
			mav.addObject("Fetch",fetch);

			return mav;
		 
	 }


}
