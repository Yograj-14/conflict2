package com.ibm.dcobankapp.serviceimpl;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.dcobankapp.entity.UserProfileEntity;
import com.ibm.dcobankapp.entity.VerificationTokenEntity;
import com.ibm.dcobankapp.repository.UserProfileRepository;
import com.ibm.dcobankapp.repository.VerificationTokenRepository;
import com.ibm.dcobankapp.service.UserProfileService;

@Component
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepo;

	@Autowired
	private VerificationTokenRepository verificationTokenRepo;

	@Override
	public String verifyAndSaveCustData(UserProfileEntity userProfileData) {

		UserProfileEntity userEmail = userProfileRepo.findByEmail(userProfileData.getEmail());
		UserProfileEntity userPhone = userProfileRepo.findByPhone(userProfileData.getPhone());
		UserProfileEntity userPanCard = userProfileRepo.findByPanCard(userProfileData.getPanCard());

		if (userEmail == null && userPhone == null && userPanCard == null) {

			UserProfileEntity userSavedData = userProfileRepo.save(userProfileData);

			String generatedOtp = generateOtp();
			System.out.println("Otp for mobile no " + userProfileData.getPhone() + " is :" + generatedOtp);

			VerificationTokenEntity vrificationToken = new VerificationTokenEntity();
			//vrificationToken.setExpiryDate(Date);
			vrificationToken.setStatus(true);
			vrificationToken.setToken(generatedOtp);
			vrificationToken.setUserProfile(userSavedData);
			vrificationToken.setType("mobile");

			verificationTokenRepo.save(vrificationToken);

		} else {
			StringBuffer str = new StringBuffer("Data alredy exists for :");
			if (userEmail != null) {
				str.append(" Email");
			}
			if (userPhone != null) {
				str.append(" Phone");
			}
			if (userPanCard != null) {
				str.append(" Pan Card");
			}
			return str.toString();
		}

		return "Data Saved Successfully";
	}

	public String generateOtp() {
		String otp = new DecimalFormat("000000").format(new Random().nextInt(999999));
		return otp;
	}

	@Override
	public boolean validateUserToken(int token, String identityData, String tokenType) {
		//get user id from profile table
		UserProfileEntity userData = new  UserProfileEntity();	
		if(tokenType.equalsIgnoreCase("mobile")) {
			userData = userProfileRepo.findByPhone(identityData);
		}
		if(tokenType.equalsIgnoreCase("email")) {
			userData =userProfileRepo.findByEmail(identityData);
		}
	
		
		//by using id i can find token against that id
		VerificationTokenEntity tokenData =verificationTokenRepo.findTokenByTypeStatusAndUserId(userData.getId(),tokenType);
		
		if(Integer.parseInt(tokenData.getToken()) == token) {
			
			if(tokenType.equalsIgnoreCase("mobile")) {
				userData.setPhoneVerified(true);
			}else {
				userData.setEmailVerified(true);
			}
			
			userProfileRepo.save(userData);
			
			tokenData.setStatus(false);
			verificationTokenRepo.save(tokenData);
			
			if(tokenType.equalsIgnoreCase("mobile")) {
				
				String emailToken =generateOtp();
				//send token to email id
				System.out.println("Token generate for email :"+userData.getEmail()+" is :"+emailToken);
				
				VerificationTokenEntity emailTokenData = new VerificationTokenEntity();
				//save token to token table 
				emailTokenData.setToken(emailToken);
				emailTokenData.setType("email");
				emailTokenData.setStatus(true);
				emailTokenData.setUserProfile(userData);
				verificationTokenRepo.save(emailTokenData);
				
			}
			
			return true;
		}else {
			return false;
		}
		
	}

}
