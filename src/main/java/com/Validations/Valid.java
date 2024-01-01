package com.Validations;

public class Valid {
	
	
	public static void main(String[] args) {
		
		MobileValidation mb = new MobileValidation();
		boolean mobile = mb.isValidMobile("9695554");
		System.out.println( mobile);
		
	}

}
