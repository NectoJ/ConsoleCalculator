package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/** CalculatorTest.java
 *
 * @author Jamie Lam
 * @version 30.11.2019
 */

public class CalculatorTest {
	
	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
    @Test
    public void testSumAddTwoPositive() {
        assertTrue(calculator.sum(10,25) == 35);
    }

    @Test
    public void testSumAddTwoNegative() {
	    assertTrue(calculator.sum(-10, -20) == -30);
    }

    @Test
    public void TestSumAddTwoZero() {
	    assertTrue(calculator.sum(0, 0) == 0);
    }

    @Test
    public void testSumAddTwoMAX_VALUE() {
	    assertTrue(calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE) == -2);
    }

    @Test
    public void TestSumAddTwoMIN_VALUE() {
	    assertTrue(calculator.sum(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
    }

    @Test
    public void TestSumAddMAX_VALUEAndMIN_VALUE() {
	    assertTrue(calculator.sum(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSubtractionTwoPositive() {
        assertTrue(calculator.subtraction(25,10) == 15);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivisionWithZero() {
    	assertTrue(calculator.division(4, 0) == 0);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivisionOneNegativeOneZero() {
    	assertTrue(calculator.division(-4, 0) == 0);
    }

}