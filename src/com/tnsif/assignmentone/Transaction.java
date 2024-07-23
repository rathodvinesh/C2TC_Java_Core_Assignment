package com.tnsif.assignmentone;

public class Transaction {
	private static final double Transaction_Fee =2.0;
	
	public final void performTransaction (Account account, double amount, boolean isDeposit) {
		if (isDeposit) {
			account.deposit(amount);
		}
		else {
			account.withdraw(amount);
		}
		System.out.println("Transaction completed. Transaction fee: " + Transaction_Fee);
	}

}
