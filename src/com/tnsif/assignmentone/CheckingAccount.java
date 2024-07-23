package com.tnsif.assignmentone;


public class CheckingAccount extends Account {
	private static final double Transaction_Fee = 2.0;

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount - Transaction_Fee;
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount + Transaction_Fee <= balance) {
			balance -= amount + Transaction_Fee;
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	
}

