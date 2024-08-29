package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}



	public List<Employee> getList() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	
	



	@Override
	public String deleteEmployee(int id) {
		empRepo.deleteById(id);
		return id+"Record deleted";
	}

	public Employee updateTester(Employee employee, int id) {
		// TODO Auto-generated method stub
		Employee existingEmployeee=empRepo.findById(id).orElse(null);
		
		if(existingEmployeee!=null) {
			existingEmployeee.setName(employee.getName());
			existingEmployeee.setPosirion(employee.getPosirion());
			existingEmployeee.setSalary(employee.getSalary());
		}
		else {
			System.out.println("Record is Null.");
		}
		
		return empRepo.save(existingEmployeee);

}
}
