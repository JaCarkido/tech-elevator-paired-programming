package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	//First method that takes zero numbers
	
	@Test
	public void method_takes_zero_numbers() {
		assertEquals("String did not return integer 0 when String empty", 0, KataStringCalculator.addString(""));
	}
	@Test
	public void method_takes_one_number() {
		assertEquals("String did not return int 1", 1, KataStringCalculator.addString("1"));
		assertEquals("String did not return int 2", 2, KataStringCalculator.addString("2"));
		}
	@Test
	public void method_takes_two_numbers() {
		assertEquals("String did not return sum of 5", 5, KataStringCalculator.addString("2,3"));
		assertEquals("String did not return sum of 47", 47, KataStringCalculator.addString("23,24"));
	}
	@Test
	public void method_takes_three_numbers() {
		assertEquals("String did not return sum of 20", 20, KataStringCalculator.addString("5,4,11"));
		assertEquals("String did not return sum of 100", 100, KataStringCalculator.addString("29,69,2"));
	}
	@Test
	public void method_takes_new_lines() {
		assertEquals("String did not return sum of 20", 20, KataStringCalculator.addString("5,4\n11"));
	}	
}