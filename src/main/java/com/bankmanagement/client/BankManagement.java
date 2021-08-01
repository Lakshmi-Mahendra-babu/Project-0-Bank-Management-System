package com.bankmanagement.client;


import java.util.Scanner;

import org.apache.log4j.Logger;

public class BankManagement {
	private static Logger log = Logger.getLogger(BankManagement.class);
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[]) {
			log.info("**********/----Welcome to the Bank Management System---/***********");
			while(true) {
			System.out.println("1. New Employee");
			System.out.println("2. Existing Employee");
			System.out.println("3. New Customer");
			System.out.println("4. Existing Customer");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
	        int input=sc.nextInt();
	        sc.nextLine();
	        switch(input) {
	        case 1:
	        	EmplyoeeMain.newEmp();
	        	break;
	        case 2:
	        	EmplyoeeMain.existingEmp();
	        	break;
	        case 3:
	        	CustomerMain.newCustomer();
	        	break;
	        case 4:
	        	CustomerMain.existingCustomer();
	        	break;
	        case 5:
	        	System.exit(0);
	        	log.info("Thank You!");
	        default:
	        	log.warn("Please enter correct choice!");
	        	break;
	        }
	}	
}
}