package test.maysupport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import maysupport.Calculator;

public class CalculatorTest {

	@Test
	public void test_Sum() {
		Calculator c = new Calculator();
		int result = c.add(5, 2);
		assertEquals(7, result);
	}

}
