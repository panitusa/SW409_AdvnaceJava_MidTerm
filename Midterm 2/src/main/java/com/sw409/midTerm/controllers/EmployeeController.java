package com.sw409.midTerm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.midTerm.models.Employee;
import com.sw409.midTerm.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService; 
	
	//create
	@PostMapping("/api/v1/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	//read 
	@GetMapping("/api/v1/employees")
	public List<Employee> findAllEmployee()
	{
		return employeeService.findAllEmployee();
	}
	
	//update
	@PutMapping("/api/v1/employees/{employeeid}")
	public void updateEmployee(@PathVariable("employeeid") Integer id, @RequestBody Employee employee) 
	{
		employeeService.updateEmployee(id, employee);
	}
	
	//delete
	@DeleteMapping("/api/v1/employees/{employeeid}")
	public void deleteEmployee(@PathVariable("employeeid") Integer id, @RequestBody Employee employee)
	{
		employeeService.deleteEmployee(id, employee);
	}

}
