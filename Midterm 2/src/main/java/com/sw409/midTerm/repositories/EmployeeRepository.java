package com.sw409.midTerm.repositories;

import org.springframework.data.repository.CrudRepository;
import com.sw409.midTerm.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
