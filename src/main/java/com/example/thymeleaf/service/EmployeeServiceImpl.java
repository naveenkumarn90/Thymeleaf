package com.example.thymeleaf.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymeleaf.entity.Employee;
import com.example.thymeleaf.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	
	public void save(Employee e) {
		repository.save(e);
		
	}
public Employee findById(Integer id) {
		
		Optional<Employee> p =  repository.findById(id) ;
		Employee emp = null;
		
		if(p.isPresent())
			emp = p.get();
		
		return emp;
	}


	
	public void deleteById(Integer id) {
		repository.deleteById(id);
		
	}

	

}


