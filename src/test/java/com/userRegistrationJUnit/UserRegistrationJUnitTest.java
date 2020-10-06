package com.userRegistrationJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationJUnitTest {
	private static UserRegistrationJUnit userRegistrationJUnit;
	
	@BeforeAll
	static void initiate() {
		userRegistrationJUnit = new UserRegistrationJUnit();
	}

	//Test methods for first name
	@ParameterizedTest
	@ValueSource(strings = {"Rohan", "Rohit", "Abhishek", "Rushikesh"})
	public void firstName_ifValid_shouldReturnValid(String validFirstNames) {
		try {
			assertEquals("valid", userRegistrationJUnit.validateFirstName.validate(validFirstNames));
		}
		catch(InvalidUserDetailsException exception) {
			System.out.println(exception);
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"rohan", "R5ohit", "A@bhishek", "Rushi.kesh"})
	public void firstName_ifInvalid_shouldReturnInvalid(String invalidFirstNames) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistrationJUnit.validateFirstName.validate(invalidFirstNames);
		});
		System.out.println(exception);
	}
	
	//Test methods for last name
	@ParameterizedTest
	@ValueSource(strings = {"Patil", "Jadhav", "Sawant", "Deshmukh"})
	public void lastName_ifValid_shouldReturnValid(String validLastNames) {
		try {
			assertEquals("valid", userRegistrationJUnit.validateLastName.validate(validLastNames));
		}
		catch(InvalidUserDetailsException exception) {
			System.out.println(exception);
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Pa_til", "Ja1dhav", "Sawant*", "De"})
	public void lastName_ifInvalid_shouldReturnInvalid(String invalidLastNames) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistrationJUnit.validateLastName.validate(invalidLastNames);
		});
		System.out.println(exception);
	}
	
	//Test methods for mobile
	@ParameterizedTest
	@ValueSource(strings = {"91 9865326598", "789 5487541254", "0000 0000000000"})
	public void mobile_ifValid_shouldReturnValid(String validMobile) {
		try {
			assertEquals("valid", userRegistrationJUnit.validateMobile.validate(validMobile));
		}
		catch(InvalidUserDetailsException exception) {
			System.out.println(exception);
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {"919865326598", "91 986532659898"})
	public void mobile_ifInvalid_shouldReturnInvalid(String invalidMobile) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistrationJUnit.validateMobile.validate(invalidMobile);
		});
		System.out.println(exception);
	}
	
	
	//Test methods for password
	@ParameterizedTest
	@ValueSource(strings = {"abcNn@1234", "ABcn_xyz5"})
	public void password_ifValid_shouldReturnValid(String validPasswords) {
		try {
			assertEquals("valid", userRegistrationJUnit.validatePassword.validate(validPasswords));
		}
		catch(InvalidUserDetailsException e) {
			System.out.println(e);
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {"Abc@12", "ab-abab254"})
	public void password_ifInvalid_shouldReturnInvalid(String invalidPasswords) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistrationJUnit.validatePassword.validate(invalidPasswords);
		});
		System.out.println(exception);
	}
	
	//Test methods for email
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void email_ifValid_shouldReturnValid(String validEmails) {
		try {
			assertEquals("valid", userRegistrationJUnit.validateEmail.validate(validEmails));
		}
		catch(InvalidUserDetailsException e) {
			System.out.println(e);
		}
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void email_ifInvalid_shouldReturnInvalid(String invalidEmails) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistrationJUnit.validateEmail.validate(invalidEmails);
		});
		System.out.println(exception);
	}
		
}
