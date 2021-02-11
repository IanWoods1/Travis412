package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(15, 5), 3);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideZeroDivisor() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(15, 0);
	}
	
	@Test
	public void testMinusNegativeMinuend() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(-5, 3), -8);
	}
	
	@Test
	public void testMultiplyZeroMultiplicand() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(0, 3), 0);
	}
	
}
