package com.tnsif.assignmentone;


public class SavingsAccount extends Account {
		private static final double Interest_Rate = 0.03;
		
		public SavingsAccount(double initialBalance) {
			super(initialBalance);
		}

		@Override
		public void deposit(double amount) {
			if(amount > 0) {
				balance += amount + (amount * Interest_Rate);
			}
		}

		@Override
		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
			}
		}

		@Override
		public double getBalance() {
			return balance;
		}
		
}

