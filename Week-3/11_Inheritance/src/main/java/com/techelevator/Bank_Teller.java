package com.techelevator;

import java.math.BigDecimal;

public class Bank_Teller {

	public static void main(String[] args) {

	/****************************************************************************
	 * 
	 * Use this application program to test your classes.
	 * 
	 * You should instantiate objects of your class using each of the ctors
	 * created for the class.
	 * 
	 * Use those objects to test each of the methods you have for a class.
	 * 
	 * (Hint: The exercise description has "Sample usage", feel free to use)
	 * 
	 * Consider adding a "show()" method to each class which will display the
	 * values in the data members of the object used to invoke it to make it
	 * easy to verify the processing of your methods
	 * 
	 ****************************************************************************
	 */

		
		BankAccount aBankAccount = new BankAccount();
		BankAccount anotherAcct = new BankAccount ("031952", new BigDecimal ("19.95"));
		BankAccount aSavingsAcct = new SavingsAccount ();
		BankAccount anotherSaveAcct = new SavingsAccount ("07041776", new BigDecimal ("26000"));
		
		BankAccount aCheckingAccount = new CheckingAccount();
		BankAccount anotherCheckAcct = new CheckingAccount("083112", new BigDecimal("14.92"));
		
		System.out.println("anotherCheckAcct test: " + anotherCheckAcct.getBalance());
		System.out.println("anotherAcct test: " + anotherAcct.getBalance());
		System.out.println("aSavingsAcct test: " + aSavingsAcct.getBalance());
		System.out.println("anotherSaveAcct test: " + anotherSaveAcct.getBalance());
		
		BigDecimal amountToDeposit = new BigDecimal ("1.00");
		BigDecimal newBalance = anotherCheckAcct.deposit(amountToDeposit);
		
		System.out.println("anotherCheckAcct test: " + anotherCheckAcct.getBalance());
		System.out.println("anotherAcct test: " + anotherAcct.getBalance());
		System.out.println("aSavingsAcct test: " + aSavingsAcct.getBalance());
		System.out.println("anotherSaveAcct test: " + anotherSaveAcct.getBalance());
		
		
		BigDecimal amountToTransfer = new BigDecimal(".50");
		anotherCheckAcct.transfer(anotherAcct, amountToTransfer);
		
		System.out.println("anotherCheckAcct test: " + anotherCheckAcct.getBalance());
		System.out.println("anotherAcct test: " + anotherAcct.getBalance());
		System.out.println("aSavingsAcct test: " + aSavingsAcct.getBalance());
		System.out.println("anotherSaveAcct test: " + anotherSaveAcct.getBalance());
		
		BigDecimal amountToWithdraw = new BigDecimal("2.00");
		BigDecimal newBalance2 = anotherSaveAcct.withdraw(amountToWithdraw);
		System.out.println("anotherSaveAcct withdrawalTest: " + anotherSaveAcct.getBalance());
		
		anotherSaveAcct.addInterest();
		System.out.println("anotherSaveAcct interestTest: " + anotherSaveAcct.getBalance());
		
		
		BankCustomer gatsby = new BankCustomer();
		gatsby.addAccount(aBankAccount);
		gatsby.addAccount(anotherAcct);
		gatsby.addAccount(anotherCheckAcct);
		gatsby.addAccount(aSavingsAcct);
		gatsby.addAccount(anotherSaveAcct);

		System.out.println("gatsby has %s accounts" + gatsby.getAccounts());
		System.out.println(gatsby.getIsVIP());
		
		
		CheckingAccount tester1 = new CheckingAccount ("12345", new BigDecimal("200"));
		
		tester1.withdraw(new BigDecimal("250"));
		
		System.out.println(tester1.getBalance());
	}

}
