package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class BankAccountTest {
	
	BankAccount tester = new BankAccount(); 
	
@Test
public void Test_Default_Constructor(){
	BankAccount testAccount = new BankAccount();
	
	assertEquals("wrong account number", "unknown", testAccount.getAcctNumber());
	assertEquals("wrong balance", new BigDecimal("0.00"), testAccount.getBalance());
}
@Test
public void Test_Second_Constructor() {
	BankAccount testAccount = new BankAccount("12034", new BigDecimal("19.95"));
	assertEquals("wrong account number", "12034", testAccount.getAcctNumber());
	assertEquals("wrong balance", new BigDecimal("19.95"), testAccount.getBalance());
}
		
@Test
public void Test_Get_Account_Number() {
	
	BankAccount testAccount = new BankAccount("12034", new BigDecimal("19.95"));
	assertEquals("this account number is wrong", "12034", testAccount.getAcctNumber());
	
}

@Test
public void Test_Get_Balance() {
	
	BankAccount testAccount = new BankAccount("12034", new BigDecimal("19.95"));
	assertEquals ("the balance is wrong", new BigDecimal("19.95"), testAccount.getBalance());
	
}
 /*
@Test
public void Test_Set_Balance() {
	BankAccount testAccount = new BankAccount("12345", new BigDecimal("19.95"));
	testAccount.setBalance(new BigDecimal("40.00"));
}
*/

@Test

public void Test_Deposit() {
	BankAccount testAccount = new BankAccount ("12345", new BigDecimal("19.95"));
	assertEquals("wrong amount", new BigDecimal("39.95"), testAccount.deposit(new BigDecimal("20.00")));
	
}

@Test
public void Test_Withdraw() {
	BankAccount testAccount = new BankAccount ("12345", new BigDecimal("19.95"));
	assertEquals("wrong amount", new BigDecimal ("9.95"), testAccount.withdraw(new BigDecimal("10.00")));
	
}
@Test
public void Test_Transfer() {
	BankAccount transferFromAccount = new BankAccount ("12345", new BigDecimal("500.00"));
	BankAccount transferToAccount = new BankAccount ("12345", new BigDecimal("20.00"));
	
	transferFromAccount.transfer(transferToAccount, new BigDecimal("130.00"));
	
	assertEquals ("the balance is wrong", new BigDecimal("370.00"), transferFromAccount.getBalance());
	assertEquals ("the balance is wrong", new BigDecimal("150.00"), transferToAccount.getBalance());
	
	
}
@Test
public void Test_Balance_Above_Zero() {
	BankAccount transferFromAccount = new BankAccount ("12345", new BigDecimal("500.00"));
	BankAccount transferToAccount = new BankAccount ("12345", new BigDecimal("20.00"));
	
	transferFromAccount.transfer(transferToAccount, new BigDecimal("510.00"));
	
	assertEquals ("the balance is wrong", new BigDecimal("500.00"), transferFromAccount.getBalance());
	assertEquals ("the balance is wrong", new BigDecimal("20.00"), transferToAccount.getBalance());
	
}












	
}
