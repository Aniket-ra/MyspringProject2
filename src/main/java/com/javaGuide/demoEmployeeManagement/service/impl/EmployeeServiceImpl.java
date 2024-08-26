package com.javaGuide.demoEmployeeManagement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaGuide.demoEmployeeManagement.dto.EmployeeDto;
import com.javaGuide.demoEmployeeManagement.entity.Employee;
import com.javaGuide.demoEmployeeManagement.exception.ResourceNotFountException;
import com.javaGuide.demoEmployeeManagement.mapper.EmployeeMapper;
import com.javaGuide.demoEmployeeManagement.repository.EmployeeRepository;
import com.javaGuide.demoEmployeeManagement.service.EmployeeService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto){
		// TODO Auto-generated method stub
		
		Employee employee=EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee=employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}
	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		
		
		Employee employee=employeeRepository.findById(employeeId)
		.orElseThrow(()-> new ResourceNotFountException("Employee is not exist with given Id"));
		
		return EmployeeMapper.mapToEmployeeDto(employee);
	}
	@Override
	public List<EmployeeDto> getAllEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> employees=employeeRepository.findAll();
		return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());
	}
	@Override
	public EmployeeDto updateEmployee(Long Id, EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(Id)
				.orElseThrow(()-> new ResourceNotFountException("Employee is not exist with given Id  "+Id));
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEmailId(employeeDto.getEmailId());
		
		Employee updatedEmployee=employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
	}
	@Override
	
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findById(employeeId)
				.orElseThrow(()-> new ResourceNotFountException("Employee is not exist with given Id  "+employeeId));
		employeeRepository.deleteById(employeeId);
		
	}
	

}
