package com.SpringBoot.demo.controller;
//This class acts as controller to handle request mappings


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{

		@RequestMapping("/welcome")
		public ModelAndView firstPage() 
		{
			return new ModelAndView("welcome");
		}

		
	
	
}
