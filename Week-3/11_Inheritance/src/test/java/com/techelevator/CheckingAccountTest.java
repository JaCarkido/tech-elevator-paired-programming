package com.techelevator;
import org.junit.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class CheckingAccountTest {
	
		CheckingAccount Tester = new CheckingAccount();
		
		@Test
		public void Test_Default_Constructor(){
			CheckingAccount testAccount = new CheckingAccount();
			
			assertEquals("wrong account number", "unknown", testAccount.getAcctNumber());
			assertEquals("wrong balance", new BigDecimal("0.00"), testAccount.getBalance());
		}
		@Test
		public void Test_Second_Constructor() {
			CheckingAccount testAccount = new CheckingAccount("12034", new BigDecimal("19.95"));
			assertEquals("wrong account number", "12034", testAccount.getAcctNumber());
			assertEquals("wrong balance", new BigDecimal("19.95"), testAccount.getBalance());
		}
		@Test
		public void Test_Withdraw() {
			CheckingAccount checker2 = new CheckingAccount("12345", new BigDecimal("200.00"));
			CheckingAccount checker = new CheckingAccount("12345", new BigDecimal("200.00"));
			assertEquals("withdraw amount exceeds balance", new BigDecimal("150.00"), checker.withdraw(new BigDecimal("50.00")));
			assertEquals("should apply withdraw fee of 10.00", new BigDecimal("-110.00") , checker.withdraw(new BigDecimal("250.00")));
			assertEquals("should apply withdraw fee of 10.00", new BigDecimal("200.00") , checker2.withdraw(new BigDecimal("400.00")));
			
			
		}

}
