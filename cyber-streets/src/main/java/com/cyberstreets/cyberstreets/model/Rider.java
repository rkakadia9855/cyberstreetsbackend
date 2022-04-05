package com.cyberstreets.cyberstreets.model;

import java.util.Objects;

public class Rider {
	public Rider(String firstname, String lastname, String email, String password, int phoneNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	private int riderID;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private int phoneNumber;
	public int getRiderID() {
		return riderID;
	}
	public void setRiderID(int riderID) {
		this.riderID = riderID;
	}
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
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, firstname, lastname, password, phoneNumber, riderID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rider other = (Rider) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(password, other.password)
				&& phoneNumber == other.phoneNumber && riderID == other.riderID;
	}
}
