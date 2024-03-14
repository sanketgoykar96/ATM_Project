package com.sanket;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		
		int atmBalance= scanner.nextInt();
		ATM atm = new ATM(atmBalance);
		System.out.println("Enter your withdrawl amount");
		int withdrawalAmount = scanner.nextInt();
		try {
			atm.withdraw(withdrawalAmount);
		}
		catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
		
	}
}
