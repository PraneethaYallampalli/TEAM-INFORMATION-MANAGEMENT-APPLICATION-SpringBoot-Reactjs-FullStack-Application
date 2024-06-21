package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Employee;


@Repository
public interface EmployeeDataRepo extends JpaRepository<Employee,Long> {



}
