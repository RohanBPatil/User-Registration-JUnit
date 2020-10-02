package com.userRegistrationJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserRegistrationJUnitTest {
	private static UserRegistrationJUnit userRegistrationJUnit;
	
	@BeforeAll
	static void initiate() {
		userRegistrationJUnit = new UserRegistrationJUnit();
	}
	
	//Test methods for first name
	@Test
	public void firstName_ifValid_shouldReturnValid() {
		assertEquals("valid", userRegistrationJUnit.validateFirstName("Rohan"));
		assertEquals("valid", userRegistrationJUnit.validateFirstName("Ram"));
	}
	
	@Test
	public void firstName_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validateFirstName("rohan"));
		assertEquals("invalid", userRegistrationJUnit.validateFirstName("Rohan20"));
	}
	
	//Test methods for last name
	@Test
	public void lastName_ifValid_shouldReturnValid() {
		assertEquals("valid", userRegistrationJUnit.validateLastName("Patil"));
		assertEquals("valid", userRegistrationJUnit.validateLastName("Jadhav"));
	}
	
	@Test
	public void lastName_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validateLastName("patil"));
		assertEquals("invalid", userRegistrationJUnit.validateLastName("Patil@"));
	}
	
	//Test methods for email
	@Test
	public void email_ifValid_shouldReturnValid() {
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc.xyz@bl.co.in"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc.rohan@bl.co.uk"));
	}
	
	@Test
	public void email_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validateEmail("ab.xyz@@bl.co.in"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc.xyz@bll.co.in"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("ab.xyz@bl.com.in"));
	}
	
	//Test methods for last name
	@Test
	public void mobile_ifValid_shouldReturnValid() {
		assertEquals("valid", userRegistrationJUnit.validateMobile("91 9865326598"));
		assertEquals("valid", userRegistrationJUnit.validateMobile("975 5487215487"));
	}
	
	@Test
	public void mobile_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validateMobile("919865326598"));
		assertEquals("invalid", userRegistrationJUnit.validateMobile("91 986532659898"));
	}
	
	//Test methods for password
	@Test
	public void password_ifValid_shouldReturnValid() {
		assertEquals("valid", userRegistrationJUnit.validatePassword("Abc@1234"));
		assertEquals("valid", userRegistrationJUnit.validatePassword("ABc@#xyz5"));
	}
	
	@Test
	public void password_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validatePassword("Abc@12"));
		assertEquals("invalid", userRegistrationJUnit.validatePassword("ab-abab254"));
	}
}
