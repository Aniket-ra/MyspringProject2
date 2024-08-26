package com.javaGuide.demoEmployeeManagement.service;

import java.util.List;

import com.javaGuide.demoEmployeeManagement.dto.EmployeeDto;

public interface EmployeeService {
EmployeeDto createEmployee(EmployeeDto employeeDto);
EmployeeDto getEmployeeById(Long employeeId);
List<EmployeeDto> getAllEmployee();
EmployeeDto updateEmployee(Long Id, EmployeeDto employeeDto);
void deleteEmployee(Long employeeId);
}
