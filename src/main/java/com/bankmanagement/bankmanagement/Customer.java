package com.bankmanagement.bankmanagement;

public class Customer {
	private long CustomerAccountNumber;
	private String CustomerName;
	private String MailId;
	private long MobileNumber;
	private String Address;
	private double CurrentAmount;
	private double CreditedAmount;
	private double DebitedAmount;
	public Customer() {
		super();
	}
	public Customer(long CustomerAccountNumber,String CustomerName,String MailId,long MobileNumber,String Address,double CurrentAmount,double CreditedAmount,double DebitedAmount) {
		super();
		this.CustomerAccountNumber = CustomerAccountNumber;
		this.CustomerName = CustomerName;
		this.MailId = MailId;
		this.MobileNumber = MobileNumber;
		this.Address = Address;
		this.CurrentAmount=CurrentAmount;	
		this.CreditedAmount=CreditedAmount;
		this.DebitedAmount=DebitedAmount;
	}
	public long getCustomerAccountNumber() {
		return CustomerAccountNumber;
	}
	public void setCustomerAccountNumber(long  CustomerAccountNumber) {
		// TODO Auto-generated method stub
		this.CustomerAccountNumber = CustomerAccountNumber;
	}
	
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return CustomerName;
	}
	public void setCustomerName(String CustomerName) {
		// TODO Auto-generated method stub
		this.CustomerName = CustomerName;
	}

	public String getMailId() {
		// TODO Auto-generated method stub
		return MailId;
	} 
	
	public void setMailId(String MailId) {
		// TODO Auto-generated method stub
		this.MailId = MailId;
	}

	public long getMobileNumber() {
		// TODO Auto-generated method stub
		return MobileNumber;
	}
	public void setMobileNumber(long MobileNumber) {
		// TODO Auto-generated method stub
		this.MobileNumber = MobileNumber;
	}
	
	public String getAddress() {
		// TODO Auto-generated method stub
		return Address;
	}
	
	public void setAddress(String Address) {
		// TODO Auto-generated method stub
		this.Address = Address;
	}
	
	public double getCurrentAmount() {
		// TODO Auto-generated method stub
		return CurrentAmount;
	}
	public void setCurrentAmount(double CurrentAmount) {
		// TODO Auto-generated method stub
		this.CurrentAmount = CurrentAmount;
	}
	public double getCreditedAmount() {
		// TODO Auto-generated method stub
		return CreditedAmount;
	}
	public void setCreditedAmount(double CreditedAmount) {
		// TODO Auto-generated method stub
		this.CreditedAmount=CreditedAmount;
	}	

	public double getDebitedAmount() {
		// TODO Auto-generated method stub
		return DebitedAmount;
	}
	public void setDebitedAmount(double DebitedAmount) {
		// TODO Auto-generated method stub
		this.DebitedAmount=DebitedAmount;
	}
	@Override
	public String toString() {
		return "Customer [CustomerAccountNumber=" + CustomerAccountNumber + ", CustomerName=" + CustomerName
				+ ", MailId=" + MailId + ", MobileNumber=" + MobileNumber + ", Address=" + Address + ", CurrentAmount="
				+ CurrentAmount + ", CreditedAmount=" + CreditedAmount + ", DebitedAmount=" + DebitedAmount + "]";
	}
	

}
