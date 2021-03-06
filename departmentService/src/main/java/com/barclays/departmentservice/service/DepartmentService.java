package com.barclays.departmentservice.service;

import java.util.List;
import java.util.Optional;

import com.barclays.departmentservice.model.Department;


public interface DepartmentService {
	public String addDepartment(Department department);
	public String updateDepartment(long deptId, Department department);
	public Optional<Department> getDepartmentById(long deptId);
	public List<Department> getDepartments();
	public void deleteDepartmentById(long deptId);
	public void deleteDepartments();
}
