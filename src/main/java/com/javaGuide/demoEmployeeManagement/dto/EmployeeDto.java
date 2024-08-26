package com.javaGuide.demoEmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
private long Id;
private String firstName;
private String lastName;
private String emailId;


public String getEmailId() {
	return emailId;
}
public String getFirstName() {
	return firstName;
}public String getLastName() {
	return lastName;
}
public long getId() {
	return Id;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setId(long id) {
	Id = id;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public EmployeeDto(long id2, String firstName2, String lastName2, String emailId2) {
	// TODO Auto-generated constructor stub
	this.Id=id2;
	this.firstName=firstName2;
	this.lastName=lastName2;
	this.emailId=emailId2;
}
}
