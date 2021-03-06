package com.barclays.impl;

import com.barclays.builder.EmployeeBuilder;
import com.barclays.entity.Employee;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee(1001, "Shubham", "shubham@exmpl.com", 12345);
		
		Employee emp2 = new EmployeeBuilder()
				.setEmpId(1001)
				.setEmpName("Shubham")
				.setEmpEmail("shubham@exmpl.com")
				.setEmpSal(12345)
				.build();
	}
}
