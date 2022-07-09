package com.example.demo.employee.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.employee.Employee;
import com.example.demo.employee.servicce.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmpolyeeService employeeService;
	
	@PostMapping("/add-employee")
	public ReponseEntity<?> createEmployee(@RequestBody Employee employee) {
		try {
			employeeService.saveOrUpdate(employee);
		}catch (Exception exception) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Object>("New Employee Created : "+employee.getId(), HttpStatus.CREATED);
	}
}
