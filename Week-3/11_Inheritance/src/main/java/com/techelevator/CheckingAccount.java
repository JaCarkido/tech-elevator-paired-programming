package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

	public CheckingAccount() {
		super();
		}
	
	
	public CheckingAccount(String acctNumber, BigDecimal balance) {
		super(acctNumber, balance);
		}
	
	
@Override

	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		//if balance < 0
		//$10.00 overdraft fee
		//then  overdraft up to $100
		//if overdraft > 100 then transfer fails balance = balance	
		
	
	if( super.getBalance().doubleValue() >= amountToWithdraw.doubleValue()) {
		super.withdraw(amountToWithdraw);
	}	
		else {
			if(super.getBalance().doubleValue() - amountToWithdraw.doubleValue() >= -100) {
				super.withdraw(amountToWithdraw.add(new BigDecimal ("10")));
			}
			else {
				return super.getBalance();
			}
		}
	
	return super.getBalance();
	
}
	
	
	
	

}
