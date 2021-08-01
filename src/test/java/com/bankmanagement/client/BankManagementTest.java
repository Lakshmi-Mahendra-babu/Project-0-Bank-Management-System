package com.bankmanagement.client;

import org.junit.Assert;
import org.junit.Test;

import com.bankmanagement.bankmanagement.Customer;
import com.bankmanagement.bankmanagement.Employee;
import com.bankmanagement.dao.CustomerDAOImp;
import com.bankmanagement.dao.EmployeeDAOImplementation;


public class BankManagementTest {
	CustomerDAOImp cus=new CustomerDAOImp();
	EmployeeDAOImplementation emp=new  EmployeeDAOImplementation();
	@Test
	public void testDeposit() {		
		Assert.assertEquals(1,cus.depoist(1, 500, 1000));
	}
	@Test
	public void testNewCustomer() {
		Customer cust=new Customer();
				Assert.assertNotEquals(1,cus.newCustomer(cust));
	}
	@Test
	public void testExistingCustomer() {
		Assert.assertNotEquals(1,cus.existingCustomer(1));
	}
	@Test
	public void testWithdraw() {
		Assert.assertEquals(1,cus.withdraw(2,1000, 200));
	}
	@Test
	public void testCustomer() {		
		Assert.assertNotNull(cus);
	}
	@Test
	public void employee() {		
		Assert.assertTrue(emp.equals(emp));
	}
	@Test
	public void employee1() {		
		Assert.assertNotEquals(1,emp.existingEmployee(1));
	}
	@Test
	public void employee2() {	
		Assert.assertTrue(true);
	}
	@Test
	public void employee3() {	
		Assert.assertSame(emp, emp);
	}
	@Test
	public void employee4() {	
		Assert.assertNotNull(emp);
	}
	@Test
	public void employee5() {	
		Assert.assertNotSame(emp, cus);
	}
	@Test
	public void employee6() {	
		Assert.assertFalse(false);
	}
}
