package com.barclays.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext = */SpringApplication.run(DemoApplication.class, args);
		
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//		
//		Employee employee = new Employee(1, "Shubham", "Talpe", 123.0f, "Pune");
//		
//		System.out.println(employeeService.addEmployee(employee));
//		
//		System.out.println(employeeService.getEmployeeById(1));
//		
//		System.out.println(employeeService.addEmployee(new Employee(2, "Shubham", "Talpe", 123.0f, "Pune")));
//		
//		employeeService.deleteEmployeeById(2);
//
//		System.out.println(employeeService.getEmployeeById(2));
//		
//		employeeService.deleteEmployees();
//		
//		System.out.println(employeeService.findBySalaryAndAddress(120, "Silicon Valley"));
		
	}

}
