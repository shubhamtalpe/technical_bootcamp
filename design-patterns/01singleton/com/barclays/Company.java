package com.barclays;

public class Company {
	private Company() {
		System.out.println("Object created - Company");
	}
	
	public static Company getInstance(Company company) {
		return company == null ? new Company() : company;
	}
}
