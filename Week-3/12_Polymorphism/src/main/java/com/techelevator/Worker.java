package com.techelevator;

public class Worker {
		private String firstName;
		private String lastName;
	
	
	public Worker (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	public double calculateWeeklyPay (int hoursWorked) {
		return 0.00;
	}
}
