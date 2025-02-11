package com.ibm.dcobankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.dcobankapp.entity.UserProfileEntity;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfileEntity, Long> {

	public UserProfileEntity findByEmail(String email);
	
	public UserProfileEntity findByPhone(String phone);
	
	public UserProfileEntity findByPanCard(String panCard);
}
