package com.cyberstreets.cyberstreets.model;

import java.util.Objects;

public class Driver {
	public Driver(String firstname, String lastname, String email, String password, int phoneNumber, String carMake, String carMakeYear, String carMakeModel, String licenseNumber, String licensePlateNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.carMake = carMake;
		this.carMakeYear = carMakeYear;
		this.carMakeModel = carMakeModel;
		this.licenseNumber = licenseNumber;
		this.licensePlateNumber = licensePlateNumber;
	}
	private int driverID;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private int phoneNumber;
	private String carMake; private String carMakeYear; private String carMakeModel; private String licenseNumber; private String licensePlateNumber;
	
	
	public int getDriverID() {
		return driverID;
	}
	public void setDriverID(int driverID) {
		this.driverID = driverID;
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
		return Objects.hash(email, firstname, lastname, password, phoneNumber, driverID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(password, other.password)
				&& phoneNumber == other.phoneNumber && driverID == other.driverID;
	}
}
