package com.javaGuide.demoEmployeeManagement.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Getter
@Setter

@Entity
@Table(name="employeesNew")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long Id;
	
	@Column(name = "firstName")
private String firstName;
	@Column(name = "lastName")
private String lastName;
	@Column(name = "emailId",nullable = false, unique = true)
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
	// Default constructor
    public Employee() {
    }
	
	public Employee(long id2, String firstName2, String lastName2, String emailId2) {
		// TODO Auto-generated constructor stub
		this.Id=id2;
		this.firstName=firstName2;
		this.lastName=lastName2;
		this.emailId=emailId2;
	}
}
