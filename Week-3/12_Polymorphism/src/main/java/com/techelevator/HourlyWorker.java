package com.techelevator;

public class HourlyWorker extends Worker {
	
	private double hourlyRate;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		
		super(firstName, lastName); 
		this.hourlyRate = hourlyRate;
		
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	@Override
	public double calculateWeeklyPay (int hoursWorked) {
		
		double pay;
		if(hoursWorked - 40 > 0) {
			pay = hourlyRate * hoursWorked;
			int overTime = hoursWorked - 40;
			pay = pay + (hourlyRate * overTime * .5);
			
		}else {
		 pay = hourlyRate * hoursWorked;
			
		}
		return pay;
	
	}
}
