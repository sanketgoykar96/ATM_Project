package com.sanket;

public class ATM {
	private int totalAmount;

	public ATM(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void withdraw(int amount)throws InsufficientBalance {
		if(amount> totalAmount) {
			throw new InsufficientBalance("Insufficient balance ATM has only "+totalAmount+ "available");
		}
		totalAmount -=amount;
		System.out.println("WIthdrawn "+amount+ " from ATM. Remaining balance "+totalAmount);
	}
}
