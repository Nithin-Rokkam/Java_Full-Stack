package com.capg.test.java;
import com.capg.java.Calculation;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	public void testAdd() {
		Calculation cal1=new Calculation();
		int result=cal1.addition(3, 2);
		assertEquals(5,result);
	}
	
	public void testSub() {
		assertEquals(-3,new Calculation().substraction(2, 5));
	}
	
	public void testMul() {
		assertEquals(10,new Calculation().multiplication(2, 5));
	}
	
	public void testDiv() {
		assertEquals(0,new Calculation().division(2, 5));
	}
}
