package com.userRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJUnit {
	
	// GLOBAL CONSTANTS
	private static String NAME_REGEX = "^([A-Z]{1}[A-Za-z]{2,})$";
	private static String MOBILE_REGEX = "^([0-9]{1,4}[ ][0-9]{10})$";
	private static String EMAIL_REGEX = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	private static String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	
		
	//Validating first name
	public String validateFirstName(String firstName) throws InvalidUserDetailsException{
		if(matchingWithPattern(firstName, NAME_REGEX))
			return "valid";
		else
			throw new InvalidUserDetailsException("Invalid first name");
	}
	
	//Validating last name
	public String validateLastName(String lastName) throws InvalidUserDetailsException{
		if(matchingWithPattern(lastName, NAME_REGEX))
			return "valid";
		else
			throw new InvalidUserDetailsException("Invalid last name");
	}
	
	
	//validating email
	public String validateEmail(String email) throws InvalidUserDetailsException{
		if(matchingWithPattern(email, EMAIL_REGEX))
				return "valid";
		else
			throw new InvalidUserDetailsException("Invalid email");
	}
	
	
	//validating mobile
	public String validateMobile(String mobile) throws InvalidUserDetailsException{
		if(matchingWithPattern(mobile, MOBILE_REGEX))
			return "valid";
		else
			throw new InvalidUserDetailsException("Invalid mobile number");
	}
	
	//validating password
	public String validatePassword(String password) throws InvalidUserDetailsException{
		if(matchingWithPattern(password, PASSWORD_REGEX))
			return "valid";
		else
			throw new InvalidUserDetailsException("Invalid password");
	}
	
	
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
