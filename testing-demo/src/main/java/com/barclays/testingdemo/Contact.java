package com.barclays.testingdemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public void validateFirstName() {
		if (this.firstName == null)
			throw new RuntimeException("First Name Cannot be null");
	}

	public void validateLastName() {
		if (this.lastName == null)
			throw new RuntimeException("Last Name Cannot be null");
	}

	public void validatePhoneNumber() {
		if (this.phoneNumber.length() != 10) {
			throw new RuntimeException("Phone Number Should be 10 Digits Long");
		}
		if (!this.phoneNumber.matches("\\d+")) {
			throw new RuntimeException("Phone Number Contain only digits");
		}
		if (!this.phoneNumber.startsWith("0")) {
			throw new RuntimeException("Phone Number Should Start with 0");
		}
	}
}
