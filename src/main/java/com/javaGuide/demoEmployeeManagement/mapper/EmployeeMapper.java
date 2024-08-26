package com.javaGuide.demoEmployeeManagement.mapper;

import com.javaGuide.demoEmployeeManagement.dto.EmployeeDto;
import com.javaGuide.demoEmployeeManagement.entity.Employee;

public class EmployeeMapper {
public static EmployeeDto mapToEmployeeDto(Employee employee) {
	return new EmployeeDto(
			employee.getId(),
			employee.getFirstName(),
			employee.getLastName(),
			employee.getEmailId()
			
			);
}


public static Employee mapToEmployee(EmployeeDto employee) {
	return new Employee(
			employee.getId(),
			employee.getFirstName(),
			employee.getLastName(),
			employee.getEmailId()
			
			);
}
}
