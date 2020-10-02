package com.userRegistrationJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationJUnitTest {
	//Test methods for first name
	@Test
	public void firstName_ifValid_shouldReturnValid() {
		UserRegistrationJUnit userRegistrationJUnit = new UserRegistrationJUnit();
		assertEquals("valid", userRegistrationJUnit.validateFirstName("Rohan"));
	}
	
	@Test
	public void firstName_ifInvalid_shouldReturnInvalid() {
		UserRegistrationJUnit userRegistrationJUnit = new UserRegistrationJUnit();
		assertEquals("invalid", userRegistrationJUnit.validateFirstName("rohan"));
	}
	
}
