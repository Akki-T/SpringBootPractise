package com.SpringBoot.demo.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.demo.model.Employee;

@RestController
public class Controller {

	@RequestMapping(value = "/employee/1", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("name1");
		emp.setDesignation("manager");
		emp.setEmpId(1);
		

		return emp;
	}
	@RequestMapping(value = "/employee/2", method = RequestMethod.GET)
	public Employee secondPage() {

		Employee emp2 = new Employee(2,"Name2","CEO");
		return emp2;
	}
	

}



