package com.userRegistrationJUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationJUnit {
	
	//Validating first name
	public String validateFirstName(String firstName) {
		String firstNameRegex = "^([A-Z]{1}[A-Za-z]{2,})$";
		return matchingWithPattern(firstName, firstNameRegex);
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
