package com.capg.java.test;
import com.capg.java.Calculation;

import junit.framework.TestCase;
public class CalculationTest extends TestCase{
	
	Calculation calculator;
	
	protected void setUp() {
		calculator =new Calculation();
	}
	
	public void testAdd() {
		assertEquals(5,calculator.addition(2, 3));
	}
	
	protected void tearDown() {
		calculator=null;
	}
}
