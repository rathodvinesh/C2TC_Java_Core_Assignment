package com.tnsif.assignmentone;

public class Main {
	public static void main (String [] args) {
		SavingsAccount savings = new SavingsAccount(1000);
		CheckingAccount checking = new CheckingAccount(500);
		
		System.out.println("Initial Savings Balance: " + savings.getBalance());
		System.out.println("Intial Checking Balance: " + checking.getBalance());
		
		Transaction transaction = new Transaction();
		
		transaction.performTransaction(savings, 200, true); //Deposit to savings
		transaction.performTransaction(savings, 50, false); // Withdraw from checking
		
		System.out.println("Updated Savings Balance: "+ savings.getBalance());
		System.out.println("Updated Checking Balance: " + checking.getBalance());
		
		System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
	}
}
 