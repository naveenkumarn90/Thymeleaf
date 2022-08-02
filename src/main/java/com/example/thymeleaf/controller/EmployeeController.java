package com.example.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.thymeleaf.entity.Employee;
import com.example.thymeleaf.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@GetMapping("/empList")
	public String findAll(Model model){
		List<Employee> emp=  empService.findAll();
		model.addAttribute("EMPLOYEE",emp);
		
		return "empUI/employees.html";
	}
	
	@GetMapping("/addEmp")
	public String empForm(Model model) {
		model.addAttribute("EMPLOYEE",new Employee());
		return "empUI/employeeForm.html";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("Employee ")Employee emp) {
		empService.save(emp);
		
		return "redirect:/employee/empList";
	}
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("empId") Integer id, Model model) {
		Employee emp = empService.findById(id);
		model.addAttribute("EMPLOYEE",emp);
		return "empUI/employeeForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("empId") Integer id) {
		empService.deleteById(id);
		
		return "redirect:/employee/empList";
	}

	

}
