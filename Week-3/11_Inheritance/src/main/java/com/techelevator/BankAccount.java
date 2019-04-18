package com.techelevator;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	private String acctNumber;
	private BigDecimal balance = new BigDecimal("0");
	
// ctor
	
	public BankAccount() {
		balance = new BigDecimal ("0.00");
		acctNumber = "unknown";
	}
	
	public BankAccount(String acctNumber, BigDecimal balance) {
		this.acctNumber = acctNumber;
		this.balance = balance;
	}
		
// getters & setters		
	

	/**
	 * @return the acctNumber
	 */
	public String getAcctNumber() {
		return acctNumber;
	}

	/**
	 * @param acctNumber the acctNumber to set
	 */
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public  List<BankAccount> getAccounts() {
		return null;
	}
	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		//System.out.println(balance);
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	private void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
// Methods
	
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
		this.setBalance(balance);
		return balance;
	}
	
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		
		balance = balance.subtract(amountToWithdraw);
		this.setBalance(balance);
		return balance;
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		
		if (balance.compareTo(transferAmount) >= 0) {
		withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);

				
			}
		}
	
	public BigDecimal addInterest() {
		return null;
	}
		
		
	

public String toString() {
	return acctNumber;
}
}

// do we need an ArrayList.  key = acctNumber and value = balance so 
 // List <String, String> accounts = new ArrayList <String, String>();




