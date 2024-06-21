package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Employee;
import com.rest.repo.EmployeeDataRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
	@Autowired
	private EmployeeDataRepo employeeDataRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee data=employeeDataRepo.save(employee);
		return data;
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee>get =employeeDataRepo.findAll();
		return get;
	}
	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee update=employeeDataRepo.findById(id).get();
		update.setName(employee.getName());
		update.setEmail(employee.getEmail());
		update.setGender(employee.getGender());
		update.setDeptno(employee.getDeptno());
		return employeeDataRepo.save(update);
	}
	@Override
	public Employee getOneEmployee(Long id) {
		// TODO Auto-generated method stub
		Employee getemp=employeeDataRepo.findById(id).get();
		return getemp;
	}
	@Override
	public void deleteOneEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeDataRepo.deleteById(id);
		
	}

}
