package com.refactoring.study.classmove_3;

public class TelephoneNumber {
	
	private String officeAreaCode;
	private String officeNumber;
	
	public String getOfficeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ")" + officeNumber);
	}
}