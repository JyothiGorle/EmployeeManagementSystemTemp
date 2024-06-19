package com.ems.dao;

import org.springframework.data.repository.CrudRepository;

import com.ems.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
