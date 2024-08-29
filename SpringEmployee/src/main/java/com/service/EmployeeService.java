package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	 Employee addEmployee(Employee employee); 
	 List<Employee> getList();
	 String deleteEmployee(int id);
}
