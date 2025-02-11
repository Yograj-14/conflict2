package com.ibm.dcobankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.dcobankapp.entity.UserProfileEntity;
import com.ibm.dcobankapp.service.UserProfileService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserProfileService userProfileService;

	@PostMapping("/verify-user")
	public String verifyAndSaveCustData(@RequestBody UserProfileEntity userProfileData) {
		return userProfileService.verifyAndSaveCustData(userProfileData);
	}
	
	@PostMapping("/validate-token")
	public ResponseEntity<String> validateOtp(@RequestParam int token, @RequestParam String identityData,@RequestParam String tokenType ){
		boolean isValid = userProfileService.validateUserToken(token, identityData,tokenType);
		if(isValid) {
			return ResponseEntity.ok("OTP Validate Successfully");
		}
		else {
			return ResponseEntity.badRequest().body("Invalid OTP");
		}
		
	}
	
	
	
	
	
}
