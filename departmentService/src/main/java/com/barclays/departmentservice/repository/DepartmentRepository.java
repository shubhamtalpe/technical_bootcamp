package com.barclays.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.departmentservice.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
