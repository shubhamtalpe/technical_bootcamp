package com.barclays.employeeservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.employeeservice.model.Employee;
import com.barclays.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long id) {
		Optional<Employee> optional = employeeService.getEmployeeById(id); 
		
		return optional.isPresent() ? 
				ResponseEntity.status(200).body(optional.get()) :
					ResponseEntity.status(404).body("Record not found");
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllEmps(){
		List<Employee> employees = employeeService.getEmployees();
		
		return (employees.isEmpty()) ?
				ResponseEntity.status(404).body("No records") :
					ResponseEntity.status(200).body(employees);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> insertEmployees(@RequestBody Employee employee){
		return ResponseEntity.status(201).body(
					employeeService.addEmployee(employee)
				);
	}
	
	@PostMapping("/addMultiple")
	public ResponseEntity<?> insertEmployees(@RequestBody List<Employee> employees){
		for(Employee employee : employees) {
			employeeService.addEmployee(employee);
		}
		return ResponseEntity.status(201).body("All records added");
	}
	
	@GetMapping("/{salary}/{address}")
	public ResponseEntity<?> findBySalaryAndAddress(@PathVariable("salary") float salary, @PathVariable("address") String address){
		List<Employee> employees = employeeService.findBySalaryAndAddress(salary, address);
		
		return employees.isEmpty() ?
				ResponseEntity.status(404).body("No matching records found") :
					ResponseEntity.status(200).body(employees);
	}
	
	@DeleteMapping("/")
	public ResponseEntity<?> deleteEmployees() {
		employeeService.deleteEmployees();
		return ResponseEntity.status(200).body("All records deleted");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") long id) {
		employeeService.deleteEmployeeById(id);
		return ResponseEntity.status(200).body(String.format("Record with id = %d deleted", id));
	}
	
}
