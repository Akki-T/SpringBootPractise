package com.SpringBoot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {
	
	
	@RequestMapping("/user")
	public String mainpage()
	{
		return "user login succesfull";
	}
	
	@RequestMapping("/admin")
	public String adminMainPage()
	{
		return "admin login succesfull";
	}

}
