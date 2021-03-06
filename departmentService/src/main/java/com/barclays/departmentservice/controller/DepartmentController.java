package com.barclays.departmentservice.controller;

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

import com.barclays.departmentservice.model.Department;
import com.barclays.departmentservice.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/{deptId}")
	public ResponseEntity<?> getDepartmentById(@PathVariable("deptId") long deptId){
		Optional<Department> optional = departmentService.getDepartmentById(deptId);
	
		return optional.isPresent() ?
				ResponseEntity.status(200).body(optional.get()) :
					ResponseEntity.status(404).body("Record not found");
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAllDepts(){
		List<Department> departments = departmentService.getDepartments();
		
		return (departments.isEmpty()) ?
				ResponseEntity.status(404).body("No records") :
					ResponseEntity.status(200).body(departments);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> insertDepartment(@RequestBody Department department){
		return ResponseEntity.status(201).body(
				departmentService.addDepartment(department)
			);
	}

	@PostMapping("/addMultiple")
	public ResponseEntity<?> insertEmployees(@RequestBody List<Department> departments){
		for(Department department : departments) {
			departmentService.addDepartment(department);
		}
		return ResponseEntity.status(201).body("All records added");
	}
	
	@DeleteMapping("/")
	public ResponseEntity<?> deleteDepartment() {
		departmentService.deleteDepartments();
		return ResponseEntity.status(200).body("All records deleted");
	}
	
	@DeleteMapping("/{deptId}")
	public ResponseEntity<?> deleteDepartmentById(@PathVariable("deptId") long deptId) {
		departmentService.deleteDepartmentById(deptId);
		return ResponseEntity.status(200).body(String.format("Record with id = %d deleted", deptId));
	}
	
}
