package com.barclays.employeeservice.service;

import java.util.List;
import java.util.Optional;

import com.barclays.employeeservice.model.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public String updateEmployee(long id, Employee employee);
	public Optional<Employee> getEmployeeById(long id);
	public List<Employee> getEmployees();
	public void deleteEmployeeById(long id);
	public void deleteEmployees();
	public List<Employee> findBySalaryAndAddress(float salary, String address);
}
