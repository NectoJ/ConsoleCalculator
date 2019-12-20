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