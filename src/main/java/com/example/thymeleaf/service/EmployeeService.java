package com.example.thymeleaf.service;

import java.util.List;

import com.example.thymeleaf.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	public void save(Employee e);
	public Employee findById(Integer id);
	public void deleteById(Integer id);
	

	


}
