package com.Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MobileValidation {
	
	public boolean isValidMobile(String Mobile) {
	System.out.println("Validation is Started!!");
	Pattern p=Pattern.compile("[6-9] [0-9] {9}");
	Matcher m=p.matcher(Mobile);
	System.out.println("validation done");
	return m.matches();
	
	
	}
}