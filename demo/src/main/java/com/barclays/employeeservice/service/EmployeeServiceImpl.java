package com.barclays.employeeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.employeeservice.model.Employee;
import com.barclays.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return (employeeRepository.save(employee) != null) ? 
				"success" : 
					"fail";
	}

	@Override
	public String updateEmployee(long id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public void deleteEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
	}

	@Override
	public List<Employee> findBySalaryAndAddress(float salary, String address) {
		// TODO Auto-generated method stub
		return employeeRepository.findBySalaryAndAddress(salary, address);
	}

}
