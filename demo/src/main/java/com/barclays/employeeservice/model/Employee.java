package com.barclays.employeeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeeTBL")
public class Employee {
	
	@Id
	private long empId;
	private String firstName;
	private String lastName;
	private float salary;
	private String address;
	
}
