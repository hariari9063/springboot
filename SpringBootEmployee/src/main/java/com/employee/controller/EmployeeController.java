package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.model.Employeemodel;
@Controller
public class EmployeeController
{

	@GetMapping("/employee")
	  public String getform(){
		 return "employee";
	 }
	 @PostMapping ("/saveemployee") 
	 public String saveemployee(Employeemodel employeemodel) {
		 System.out.println(employeemodel);
		 return "success";
	 }
}
