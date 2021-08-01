package com.bankmanagement.dao;

import java.util.List;

import com.bankmanagement.bankmanagement.Customer;
import com.bankmanagement.bankmanagement.CustomerTransaction;

public interface CustomerDAO {
	public int newCustomer(Customer cust);
	public List<Customer> existingCustomer(long customerAccountNumber);
	public int depoist(long customerAccountNumber, double currentAmount, double creditedAmount);
	public int withdraw(long customerAccountNumber, double currentAmount, double debitedAmount);
	public List<CustomerTransaction> customerTransaction(long customerAccountNumber);
}
