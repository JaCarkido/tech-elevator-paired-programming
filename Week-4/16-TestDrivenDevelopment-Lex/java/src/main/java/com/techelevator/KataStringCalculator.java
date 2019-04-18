package com.techelevator;

public class KataStringCalculator {

	
	public KataStringCalculator() {
		
	}
	
	
	
	public int add(String numbers) {
		int result = 0;
		String[] temp = numbers.split("\\n|,");

		
		
		if (numbers.equals("")) {
			return 0;
		}
		
			for(String num: temp) {
				result += Integer.parseInt(num);
			}
		 
		return result;

	}
	
	
}
