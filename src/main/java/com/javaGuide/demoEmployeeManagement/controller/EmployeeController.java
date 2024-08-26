package com.javaGuide.demoEmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaGuide.demoEmployeeManagement.dto.EmployeeDto;
import com.javaGuide.demoEmployeeManagement.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired
private EmployeeService employeeservice;

@PostMapping

public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
	//Build add employee Rest api
	
	EmployeeDto savedEmployee=employeeservice.createEmployee(employeeDto);
	return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
}

//Build get Emplouyee Rest Api
@GetMapping("{id}")

public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
EmployeeDto employeeDto=employeeservice.getEmployeeById(employeeId);
return ResponseEntity.ok(employeeDto);
}


//Build gett al the employees

@GetMapping
public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
	List<EmployeeDto> employees=employeeservice.getAllEmployee();
	return ResponseEntity.ok(employees);
}


//Build update requested employee
@PutMapping("{id}")
public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id")Long employeeId, 
		@RequestBody EmployeeDto employeeDto){
	
	EmployeeDto updatedEmployee=employeeservice.updateEmployee(employeeId, employeeDto);
	
	return ResponseEntity.ok(updatedEmployee);
}

@DeleteMapping("{id}")
public  ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
	
	employeeservice.deleteEmployee(employeeId);
	return ResponseEntity.ok("employee deleted successfully");
}


}
