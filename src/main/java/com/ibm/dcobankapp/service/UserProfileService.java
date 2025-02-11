package com.ibm.dcobankapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.dcobankapp.entity.UserProfileEntity;

@Service
public interface UserProfileService {

	public String verifyAndSaveCustData(UserProfileEntity userProfileData);
	
	public boolean validateUserToken( int token,String identityData,String tokenType) ;
}
