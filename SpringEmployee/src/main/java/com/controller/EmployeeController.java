package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empService;
	
	@PostMapping("/addEmp")
	public Employee addEmp(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	@GetMapping("/getEmps")
	public List<Employee>getEmpls(){
		return empService.getList();
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id) {
		return empService.deleteEmployee(id);
	}
	
	@PutMapping("/updateEmp/{id}")
		public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
			return empService.updateEmployee(employee, id);
		} 
	}

