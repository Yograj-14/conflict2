package com.ibm.dcobankapp.entity;

import jakarta.persistence.Entity;

import java.sql.Date;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "verification_token")
public class VerificationTokenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String token;
	private Date expiryDate;
	private String type;
	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "user_profile_id", referencedColumnName = "id")
	private UserProfileEntity userProfile;

	public VerificationTokenEntity() {

	}

	public VerificationTokenEntity(Long id, String token, Date expiryDate, String type, Boolean status,
			UserProfileEntity userProfile) {
		super();
		this.id = id;
		this.token = token;
		this.expiryDate = expiryDate;
		this.type = type;
		this.status = status;
		this.userProfile = userProfile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public UserProfileEntity getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfileEntity userProfile) {
		this.userProfile = userProfile;
	}

	
	

}
