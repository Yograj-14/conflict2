package com.ibm.dcobankapp.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "user_profile")
public class UserProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private Date dob;
	private String email;
	private String phone;
	private String panCard;
	private boolean emailVerified;
	private boolean phoneVerified;
	private boolean panCardVerified;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserEntity user;


	@OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL)
	private List<VerificationTokenEntity> verificatiomTokens = new ArrayList<>();


	public UserProfileEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserProfileEntity(Long id, String firstName, String middleName, String lastName, String gender, Date dob,
			String email, String phone, String panCard, boolean emailVerified, boolean phoneVerified,
			boolean panCardVerified, UserEntity user, List<VerificationTokenEntity> verificatiomTokens) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.panCard = panCard;
		this.emailVerified = emailVerified;
		this.phoneVerified = phoneVerified;
		this.panCardVerified = panCardVerified;
		this.user = user;
		this.verificatiomTokens = verificatiomTokens;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPanCard() {
		return panCard;
	}


	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}


	public boolean isEmailVerified() {
		return emailVerified;
	}


	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}


	public boolean isPhoneVerified() {
		return phoneVerified;
	}


	public void setPhoneVerified(boolean phoneVerified) {
		this.phoneVerified = phoneVerified;
	}


	public boolean isPanCardVerified() {
		return panCardVerified;
	}


	public void setPanCardVerified(boolean panCardVerified) {
		this.panCardVerified = panCardVerified;
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}


	public List<VerificationTokenEntity> getVerificatiomTokens() {
		return verificatiomTokens;
	}


	public void setVerificatiomTokens(List<VerificationTokenEntity> verificatiomTokens) {
		this.verificatiomTokens = verificatiomTokens;
	}
	
	

}
