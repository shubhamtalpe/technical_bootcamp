package com.barclays.departmentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.departmentservice.model.Department;
import com.barclays.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public String addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department) != null ? 
				"success" : 
					"fail";
	}

	@Override
	public String updateDepartment(long deptId, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDepartmentById(long deptId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(deptId);
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public void deleteDepartmentById(long deptId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(deptId);
	}

	@Override
	public void deleteDepartments() {
		// TODO Auto-generated method stub
		departmentRepository.deleteAll();
	}

}
