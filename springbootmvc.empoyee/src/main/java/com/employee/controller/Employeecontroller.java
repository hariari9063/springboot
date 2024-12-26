package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.details.Employee;

@Controller
public class Employeecontroller {	 
 @GetMapping("/employee")
  public String getform(){
	 return "employeeform";
 }
 @PostMapping ("/saveemployee") 
 public String saveemployee(Employee employee) {
	 System.out.println(employee);
	 return "success";
 }
}