package com.bankmanagement.bankmanagement;

public class CustomerTransaction {
	private long CustomerAccountNumber;
	private double CreditedAmount;
	private double DebitedAmount;
	private double Amount;
	public CustomerTransaction() {
		super();
	}
		public CustomerTransaction(long CustomerAccountNumber,double CreditedAmount,double DebitedAmount,double Amount) {
			super();
			this.CustomerAccountNumber = CustomerAccountNumber;	
			this.CreditedAmount=CreditedAmount;
			this.DebitedAmount=DebitedAmount;
			this.Amount=Amount;
		}
		public long getCustomerAccountNumber() {
			return CustomerAccountNumber;
		}
		public void setCustomerAccountNumber(long  CustomerAccountNumber) {
			// TODO Auto-generated method stub
			this.CustomerAccountNumber = CustomerAccountNumber;
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
		public double getAmount() {
			// TODO Auto-generated method stub
			return Amount;
		}
		public void setAmount(double Amount) {
			// TODO Auto-generated method stub
			this.Amount = Amount;
		}
	
}
