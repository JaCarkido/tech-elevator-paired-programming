package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class SavingsAccountTest {
	
	SavingsAccount generic = new SavingsAccount();
	
	
	@Test
	public void Test_Default_Constructor(){
		SavingsAccount testAccount = new SavingsAccount();
		
		assertEquals("wrong account number", "unknown", testAccount.getAcctNumber());
		assertEquals("wrong balance", new BigDecimal("0.00"), testAccount.getBalance());
	}
	@Test
	public void Test_Second_Constructor() {
		SavingsAccount testAccount = new SavingsAccount("12034", new BigDecimal("19.95"));
		assertEquals("wrong account number", "12034", testAccount.getAcctNumber());
		assertEquals("wrong balance", new BigDecimal("19.95"), testAccount.getBalance());
	}
	
	@Test
	public void Test_Savings_Withdraw() {
		SavingsAccount testAccount = new SavingsAccount("12345", new BigDecimal("200.00"));
		SavingsAccount testAccount2 = new SavingsAccount("12345", new BigDecimal("100.00"));
		SavingsAccount testAccount3 = new SavingsAccount("12345", new BigDecimal("100.00"));
		
		assertEquals("Balance minus withdrawal should equal: ", new BigDecimal("150.00"), testAccount.withdraw(new BigDecimal("50.00")));
		assertEquals("Balance minus withdrawal minus two (balance under 150.00) : ", new BigDecimal("48.00"), testAccount2.withdraw(new BigDecimal("50.00")));
		assertEquals("Balance should remain at : ", new BigDecimal("100.00"), testAccount3.withdraw(new BigDecimal("150.00")));
	}
	
	@Test
	public void Test_Static_Interest_Rate() {
	
		assertEquals("Interest Rate should always equal: ", new BigDecimal("0.02"), SavingsAccount.getInterestRate());
		
	}

	@Test
	public void Test_Add_Interest_Rate() {
		SavingsAccount testAccount = new SavingsAccount("12345", new BigDecimal("200.00"));
		
	
		assertEquals("With interest rate added should equal: ", new BigDecimal("204.00"), testAccount.addInterest());
	}
}
