package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Employee;
import com.rest.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins= {"http://localhost:5173/"})
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee emp=employeeServiceImpl.saveEmployee(employee);
		return emp;
	}
	@GetMapping("/emp")
	public List<Employee>allEmployeeDetails()
	{
		List<Employee>get= employeeServiceImpl.getAllEmployee();
		return get;
	}
	@PutMapping("/emp/{id}")
	public Employee updateoneRecord(@PathVariable Long id, @RequestBody Employee employee) {
		Employee updated=employeeServiceImpl.updateEmployee(id,employee);
		return updated; 
	}
	@GetMapping("/emp/{id}")
	public Employee getRecord(@PathVariable Long id)
	{
		Employee onerecord=employeeServiceImpl.getOneEmployee(id);
		return onerecord;
	}
	@DeleteMapping("/emp/{id}")
	public void deleteRecord(@PathVariable Long id) {
		employeeServiceImpl.deleteOneEmployee(id);
		
		
	}

}
