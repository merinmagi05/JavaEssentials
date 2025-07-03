package com.axisbank;

public abstract class Account {
	double availableLimit;
	double withdrawAmount;
	
	public void deposit(double amount) {
		
	}
	
	public abstract double withdraw(double amount);
//		if(amount<=availableLimit) {
//			withdrawAmount=amount;
//			
//		}
//		
//		
//		return withdrawAmount;
	
}
