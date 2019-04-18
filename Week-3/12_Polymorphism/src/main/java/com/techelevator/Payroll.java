package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Payroll {
public static void main(String[] args) {
	
	Worker Mickey = new HourlyWorker("Mickey", "Mouse", 50);
	Worker George = new VolunteerWorker("George", "Geef");
	Worker Daisy = new SalaryWorker("Daisy", "Duck", 50);
	Worker Minnie = new HourlyWorker("Minnie", "Mouse", 20);

//System.out.println(Mickey.calculateWeeklyPay(50));

List<Worker>employees = new ArrayList<Worker>();
employees.add(Mickey);
employees.add(George);
employees.add(Daisy);
employees.add(Minnie);

double totalHours = 0.0;
double totalPay = 0.0;

for (Worker people : employees) {
int hoursWorked =(int) (Math.random()* 100);
totalPay += people.calculateWeeklyPay(hoursWorked);
totalHours += hoursWorked;
System.out.println("hours worked: "+ hoursWorked);
}
System.out.printf("Total Hours: %.2f \n ",totalHours);
System.out.printf("Total pay: %.2f \n ",totalPay);
}

	


}


