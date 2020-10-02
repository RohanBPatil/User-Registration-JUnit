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
	/*
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
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc@yahoo.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc-100@yahoo.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc.100@yahoo.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc111@abc.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc-100@abc.net"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc.100@abc.com.au"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc@1.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc@gmail.com.com"));
		assertEquals("valid", userRegistrationJUnit.validateEmail("abc+100@gmail.com"));
	}
	
	@Test
	public void email_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc@.com.my"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc123@gmail.a"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc123@.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc123@.com.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail(".abc@abc.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc()*.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc@%*.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc..2002@gmail.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc.@gmail.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc@abc@gmail.com"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc@gmail.com.1a"));
		assertEquals("invalid", userRegistrationJUnit.validateEmail("abc@gmail.com.aa.au"));
	}
	
	//Test methods for mobile
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
		assertEquals("valid", userRegistrationJUnit.validatePassword("abcNn@1234"));
		assertEquals("valid", userRegistrationJUnit.validatePassword("ABcn_xyz5"));
	}
	
	@Test
	public void password_ifInvalid_shouldReturnInvalid() {
		assertEquals("invalid", userRegistrationJUnit.validatePassword("Abc@12"));
		assertEquals("invalid", userRegistrationJUnit.validatePassword("ab-abab254"));
	}
	*/
	
	@Test
	public void userEntry_ifValid_shouldReturnHappy() {
		String firstName = "Rohan";
		String lastName = "Patil";
		String mobile = "91 9865326598";
		String email = "abc-100@yahoo.com";
		String password = "abcNn@1234";
		assertEquals("happy", userRegistrationJUnit.validateUserEntry(firstName, lastName, mobile, email, password));
	}
	
	@Test
	public void userEntry_ifInvalid_shouldReturnSad() {
		String firstName = "rohan";
		String lastName = "patil";
		String mobile = "919865326598";
		String email = "abc-100@yahoo.com.1";
		String password = "abcNn1234";
		assertEquals("sad", userRegistrationJUnit.validateUserEntry(firstName, lastName, mobile, email, password));
	}
	
}
