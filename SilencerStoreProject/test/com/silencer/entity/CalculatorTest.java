package com.silencer.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc=new Calculator();
		int a =12;
		int b=13;
		int result=calc.add(a, b);
		assertEquals(result, 25);
		
	}

}
