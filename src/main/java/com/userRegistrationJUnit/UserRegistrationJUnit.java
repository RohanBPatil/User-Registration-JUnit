package com.userRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJUnit {
	
	//Validating first name
	public String validateFirstName(String firstName) {
		String firstNameRegex = "^([A-Z]{1}[A-Za-z]{2,})$";
		return matchingWithPattern(firstName, firstNameRegex);
	}
	
	//Validating last name
	public String validateLastName(String lastName) {
		String lastNameRegex = "^([A-Z]{1}[A-Za-z]{2,})$";
		return matchingWithPattern(lastName, lastNameRegex);
	}
	
	//validating email
	public String validateEmail(String email) {
		String emailRegex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$";
		return matchingWithPattern(email, emailRegex);
	}
	
	//validating mobile
	public String validateMobile(String mobile) {
		String mobileRegex = "^([0-9]{1,4}[ ][0-9]{10})$";
		return matchingWithPattern(mobile, mobileRegex);
	}
	
	//validating password
	public String validatePassword(String password) {
		String passwordRegex = "^([A-Za-z0-9@#$%^&*]{8,})$";
		return matchingWithPattern(password, passwordRegex);
	}
	
	//matching patterns and returning valid or invalid
	public String matchingWithPattern(String check, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if (matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
}
