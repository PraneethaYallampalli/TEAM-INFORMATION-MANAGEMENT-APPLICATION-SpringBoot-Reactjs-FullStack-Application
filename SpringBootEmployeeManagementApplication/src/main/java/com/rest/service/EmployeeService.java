package com.rest.service;

import java.util.List;

import com.rest.model.Employee;

public interface EmployeeService {
	//add employee details
	public Employee saveEmployee(Employee employee);
	// display employee details
	public List<Employee> getAllEmployee();
	//update employee details
	public Employee updateEmployee(Long id,Employee employee);
	//getone Record
	public Employee getOneEmployee(Long id);
	//delete Record
	public void deleteOneEmployee(Long id);
	

}
