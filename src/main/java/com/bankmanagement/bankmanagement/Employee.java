package com.bankmanagement.bankmanagement;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private String Password;
	private String MailId;
	private long MobileNumber;
	
	public Employee(){
		super();
	}
	public Employee(int EmployeeId, String EmployeeName, String Password, String MailId,long MobileNumber) {
		super();
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Password = Password;
		this.MailId = MailId;
		this.MobileNumber = MobileNumber;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		 this.Password = Password;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String MailId) {
		this.MailId = MailId;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long MobileNumber) {
		this.MobileNumber = MobileNumber;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Password=" + Password
				+ ", MailId=" + MailId + ", MobileNumber=" + MobileNumber + "]";
	}

}
