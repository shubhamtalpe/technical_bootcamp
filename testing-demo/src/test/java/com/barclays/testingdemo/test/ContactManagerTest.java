package com.barclays.testingdemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.barclays.testingdemo.ContactManager;

public class ContactManagerTest {

	public static ContactManager contactManager;

	@BeforeAll
	public static void setupAll() {
		System.out.println("Instantiating Contact Manager before the Test Execution");
		contactManager = new ContactManager();
	}

	@BeforeEach
	public void setup() {
		contactManager = new ContactManager();
	}

	@Test
	@DisplayName("Should create a contact")
	public void shouldCreateContact() {

		//		ContactManager contactManager = new ContactManager();

		contactManager.addContact("John", "Doe", "0123456789");
		assertFalse(contactManager.getAllContacts().isEmpty());
		assertEquals(1,	contactManager.getAllContacts().size());

		//assertEquals(1, 1);
	}

	@Test
	@DisplayName("Should Not Create Contact When First Name is Null")
	public void shouldThrowRuntimeExceptionWhenFirstNameIsNull() {
		//		ContactManager contactManager = new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			contactManager.addContact(null, "Doe", "0123456789");
		});
	}

	@Test
	@DisplayName("Should Not Create Contact When Last Name is Null")
	public void shouldThrowRuntimeExceptionWhenLastNameIsNull() {
		//		ContactManager contactManager = new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			contactManager.addContact("John", null, "0123456789");
		});
	}

	@RepeatedTest(5)
	@DisplayName("Should Not Create Contact When Phone Number is Null")
	public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull() {
		//		ContactManager contactManager = new ContactManager();
		Assertions.assertThrows(RuntimeException.class, () -> {
			contactManager.addContact("John", "Doe", null);
		});
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Should Execute After Each Test");
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("Should be executed at the end of the Test");
	}
}
