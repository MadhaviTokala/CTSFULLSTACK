package com.hcl.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.model.LoginTo;
@Component
public class LoginValidator1 implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginTo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
	
		
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required.userId", "Field user Id is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required.userName", "Field user name is required");
		 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password", "Field password is required");
		
				
		 
		
		
	}

}
