package com.barclays;

public class CompanyImpl {
	public static void main(String[] args) {
		Company company = null;
		company = Company.getInstance(company);
		
		Company c2 = null;
		c2 = Company.getInstance(c2);
	}
	
}
