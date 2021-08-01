package com.bankmanagement.client;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.bankmanagement.bankmanagement.Customer;
import com.bankmanagement.dao.CustomerDAOImp;

public class customertest {
	CustomerDAOImp e=new CustomerDAOImp();

	@Test
	public void test() {
		Customer cu=new Customer();
		//cu.getCustomerAccountNumber();
		Assert.assertEquals(0,e.newCustomer(cu));
	}
	

}
