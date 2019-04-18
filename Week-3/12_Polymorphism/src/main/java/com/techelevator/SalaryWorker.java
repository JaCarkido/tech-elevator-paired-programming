package com.techelevator;

public class SalaryWorker extends Worker {

	private double annualSalary;
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		super(firstName, lastName);
		this.annualSalary = annualSalary;
	}

	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}
//	
//	public String getFirstName() {
//		return super.getFirstName();
//	}
//	
//	public String getLastName() {
//		return super.getLastName();
//	}
	@Override 
	public double calculateWeeklyPay (int hoursWorked) {
		double pay = annualSalary / 52;
		return pay;
	}
}
