package com.techelevator;

public class KataStringCalculator {
<<<<<<< HEAD

=======
<<<<<<< HEAD
	
	private String result;
	public static int addString(String result) {
		result = result.replaceAll("\n", ",");
		String[] result2 = result.split(",");
		int holder = 0;
		if (result.equals("")) {
			return 0;	
		}
		for (String number : result2) {
			holder += Integer.parseInt(number);
			
		}
		return holder;
	}
	
=======
String numbers = "";
>>>>>>> 833c073ddd39ca6a2095a22ee269c97bc3d3b197
	
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
	
	
>>>>>>> 8ebc72f54e910dbe4532595bae6b2487438f2940
}
