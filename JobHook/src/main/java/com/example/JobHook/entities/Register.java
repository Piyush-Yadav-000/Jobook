package com.example.JobHook.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
	
	@Id
	private String email;
	@Column
	private String firstname;
	@Column
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Column
	private String mobile_no;
	@Column
	private String password;
	
	
	public Register() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Register(String email, String firstname, String lastname, String mobile_no, String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile_no = mobile_no;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Register [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", mobile_no="
				+ mobile_no + ", password=" + password + "]";
	}
	
	
	
}
