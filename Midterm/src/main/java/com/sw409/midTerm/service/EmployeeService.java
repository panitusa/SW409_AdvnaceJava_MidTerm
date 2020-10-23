package com.sw409.midTerm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sw409.midTerm.models.Employee;
import com.sw409.midTerm.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//create 
	
	public Employee createEmployee(Employee employee)
	{
		employeeRepository.save(employee);
		return employee;
	}
	
	//read
	public List<Employee> findAllEmployee()
	{
		return (List<Employee>)employeeRepository.findAll();
	}
	
	//update
	public void updateEmployee (Integer id, Employee emp)
	{
		employeeRepository.save(emp);
	}
	
	//delete
	public void deleteEmployee(Integer id, Employee emp) {
		
		employeeRepository.deleteById(id);	
		
	}

}
