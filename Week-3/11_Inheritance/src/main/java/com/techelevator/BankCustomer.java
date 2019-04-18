package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

// Class Data Members --------------------------------------------------------------------------------
	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts = new ArrayList<BankAccount>(); // I changed this to an array list because it is
																		// flexible.

//CTOR -------------------------------------------------------------------------------------------------

	// --Default--

// Class Getters and Setters -----------------------------------------------------------------------------

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the accounts
	 */

	public List<BankAccount> getAccounts() {

		return accounts;
	}

	public boolean getIsVIP() {
		BigDecimal total = new BigDecimal("0");
		
		for (BankAccount eachAccount : accounts) {
			total = total.add(eachAccount.getBalance());
		}
		if (total.doubleValue() > 25000) {
			return true;

		}
		System.out.println(total);
		return false;
	}

//Class Methods ----------------------------------------------------------------------------------------	

	public void addAccount(BankAccount newAccounts) {

		accounts.add(newAccounts);

	}
}
