package com.userRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJUnit {
	/*
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
		String emailRegex = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
		return matchingWithPattern(email, emailRegex);
	}
	
	//validating mobile
	public String validateMobile(String mobile) {
		String mobileRegex = "^([0-9]{1,4}[ ][0-9]{10})$";
		return matchingWithPattern(mobile, mobileRegex);
	}
	
	//validating password
	public String validatePassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
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
	*/
	
	// GLOBAL CONSTANTS
	private static String NAME_REGEX = "^([A-Z]{1}[A-Za-z]{2,})$";
	private static String MOBILE_REGEX = "^([0-9]{1,4}[ ][0-9]{10})$";
	private static String EMAIL_REGEX = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	private static String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	
	public String validateUserEntry(String firstName, String lastName, String mobile, String email, String password) {
		if(matchingWithPattern(firstName, NAME_REGEX) && matchingWithPattern(lastName, NAME_REGEX) && matchingWithPattern(mobile, MOBILE_REGEX)
				&& matchingWithPattern(email, EMAIL_REGEX) && matchingWithPattern(password, PASSWORD_REGEX)) {
			return "happy";
		}
		return "sad";
	}
	
	public boolean matchingWithPattern(String check, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if (matcher.find()) {
			return true;
		}
		return false;
	}
}
