package com.bankmanagement.client;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bankmanagement.bankmanagement.Customer;
import com.bankmanagement.bankmanagement.CustomerTransaction;
import com.bankmanagement.bo.CustomerBO;
import com.bankmanagement.bo.CustomerBOImplementation;

public class CustomerMain {
	private static Logger log = Logger.getLogger(EmplyoeeMain.class);
	static Scanner sc=new Scanner(System.in);
	public static void newCustomer() {
		log.info("Dear Customer please enter your details for Registration:");
		System.out.println("Enter your Name:");
		String cname=sc.nextLine();
		System.out.println("Enter your Mail Id:");
		String cmail=sc.nextLine();
		System.out.println("Enter your Mobile Number:");
		long cmobile=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your Address:");
		String caddress=sc.nextLine();
		System.out.println("Enter your Deposit Amount(Minimum Amount should be 500):");
		double cbalance=sc.nextDouble();
		Customer cust=new Customer();
		cust.setCustomerName(cname);
		cust.setMailId(cmail);
		cust.setMobileNumber(cmobile);
		cust.setAddress(caddress);
		cust.setCurrentAmount(cbalance);
		CustomerBO cbo=new CustomerBOImplementation();
		int state=cbo.newCustomer(cust);
			if(state!=0) {
				log.info("Account Successfully Created!");	
			}
			else {
				log.warn("Account Not Created. Please Check Entered details!");
			}
	}
	public static void existingCustomer() {
		while(true) {
		System.out.println("1. Account Details");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Transfer Amount");
		System.out.println("5. Checking Transaction Details");
		System.out.println("6. Logout");
		System.out.println("Please enter your choice");
		int cdetails=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account Number:");
		long caccount = sc.nextLong();
		Customer cust=new Customer();
		cust.setCustomerAccountNumber(caccount);
		CustomerBO cbo=new CustomerBOImplementation();
		List<Customer> lc=cbo.existingCustomer(caccount);
		for(Customer c:lc) {
			String cname=c.getCustomerName();
			String cmail=c.getMailId();
			long cmobile=c.getMobileNumber();
			String caddress=c.getAddress();
			double ccamount=c.getCurrentAmount();
	        double ccredit=c.getCreditedAmount();
	        double cdebit=c.getDebitedAmount();
	        
				switch(cdetails) {
				case 1:
					System.out.println("CustomerAccountNumber:"+" "+caccount);
					System.out.println("CustomerName:"+" "+cname);
					System.out.println("MailId:"+" "+cmail);
					System.out.println("MobileNumber:"+" "+cmobile);
					System.out.println("Address:"+" "+caddress);
					System.out.println("CurrentAmount:"+" "+ccamount);
					System.out.println("CreditedAmount:"+" "+ccredit);
					System.out.println("DebitedAmount:"+" "+cdebit);
				    break;
				case 2:
					System.out.println("Enter Deposit Amount:");
					double deposit=sc.nextDouble();
					cust.setCreditedAmount(deposit);
					int state=cbo.depoist(caccount, ccamount, deposit);
					if(state!=0) {
					log.info("Amount Deposited Successfully!");
					}
					else {
						log.warn("Amount Not Deposited. Please check details once!");
					}
					break;
				case 3:
					System.out.println("Enter Withdraw Amount:");
					double withdraw=sc.nextDouble();
					cust.setDebitedAmount(withdraw);
					int state1=cbo.withdraw(caccount, ccamount, withdraw);
					if(state1!=0) {
					log.info("Amount Debited Successfully!");
					}
					else{
						log.warn("Amount Not Debited!");
					}
					break;
				case 4:
					System.out.println("Enter transfer account number:");
					long taccno=sc.nextLong();
					System.out.println("Enter transfer amount:");
					double withdraw1=sc.nextDouble();
					cust.setDebitedAmount(withdraw1);
					int state2=cbo.withdraw(caccount, ccamount, withdraw1);
					if(state2!=0) {
						
						List<Customer> lc1=cbo.existingCustomer(taccno);
						for(Customer c1:lc1) {
							double camount=c1.getCurrentAmount();
						cust.setCreditedAmount(withdraw1);
						int st=cbo.depoist(taccno, camount, withdraw1);
						if(st!=0) {
							log.info("Amount Transferred Successfully!");
						}
						else {
							log.warn("Amount Transfer Fail!");
						}}
					}
					break;
				case 5:
					CustomerTransaction cus=new CustomerTransaction();
					cus.setCustomerAccountNumber(caccount);
					List<CustomerTransaction> lc1=cbo.customerTransaction(caccount);
					for(CustomerTransaction c3:lc1) {
						//double ccamount=c.getCurrentAmount();
				        double ccredit1=c3.getCreditedAmount();
				        double cdebit1=c3.getDebitedAmount();
				        System.out.println("CustomerAccountNumber:"+" "+caccount);
						//System.out.println("CurrentAmount:"+" "+ccamount);
						System.out.println("CreditedAmount:"+" "+ccredit1);
						System.out.println("DebitedAmount:"+" "+cdebit1);
						System.out.println("***********");
					}
					break;
				case 6:
					log.info("You have Sucessfully logouted.");
					BankManagement b=new BankManagement();
					b.main(null);
					break;    
			    default:
			    	log.warn("Please enter correct choice!");
			    	break;
				}
			}
		}	
	}
}	

