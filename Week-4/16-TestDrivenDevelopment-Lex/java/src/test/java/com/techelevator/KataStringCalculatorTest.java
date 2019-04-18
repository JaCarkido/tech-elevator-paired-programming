package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {

	
@Test

public void Empty_String_Returns_0() {
	
	KataStringCalculator calc = new KataStringCalculator();
	assertEquals("empty string should return 0", 0, calc.add(""));
	
}
@Test
	public void String_Length_Of_One_Returns_Itself() {

	KataStringCalculator calc = new KataStringCalculator();
	assertEquals("single number returns itself",4, calc.add("4"));

}


@Test
	public void String_Length_Of_Two_Returns_Sum() {
	
	KataStringCalculator calc = new KataStringCalculator();
	assertEquals("two numbers return sum", 13, calc.add("7,6"));
	
}

@Test
	public void String_Length_Of_Multiples_Returns_Sum() {
	KataStringCalculator calc = new KataStringCalculator();
	assertEquals("three numbers return sum", 18, calc.add("7,6,5"));
}

@Test
	public void Test_Different_Dilimeters() {

	KataStringCalculator calc = new KataStringCalculator();
	assertEquals("different delimeters not working", 14, calc.add("3\n5\n2,4"));
}

}
