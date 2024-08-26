package com.javaGuide.demoEmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaGuide.demoEmployeeManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
