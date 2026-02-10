package com.capg.test.java;
import com.capg.java.Calculation;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	Calculation calculator;
	protected void setUp() {
		calculator=new Calculation();
	}
	
	public void testAdd() {
		assertEquals(5,calculator.addition(2, 3));
	}
	public void testSub() {
		assertEquals(2,calculator.substraction(5,3));
	}
	public void testMul() {
		assertEquals(6,calculator.multiplication(2, 3));
	}
	public void testDiv() {
		assertEquals(2,calculator.division(10, 5));
	}
	
	public void testAll() {
		assertEquals(5,calculator.addition(2, 3));
		assertEquals(2,calculator.substraction(5,3));
		assertEquals(6,calculator.multiplication(2, 3));
		assertEquals(2,calculator.division(10, 5));
	}
	
	protected void tearDown() {
		calculator=null;
	}
	
}
