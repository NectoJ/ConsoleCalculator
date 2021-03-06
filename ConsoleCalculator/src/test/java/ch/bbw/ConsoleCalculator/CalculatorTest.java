package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/** CalculatorTest.java
 *
 * @author Jamie Lam
 * @version 1.0.0
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
    public void TestSumAddPositiveAndNegative() {
	    assertTrue(calculator.sum(10, -20) == -10);
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
    public void testSumAddMAX_VALUEAndOne() {
	    assertTrue(calculator.sum(Integer.MAX_VALUE, 1) == -2147483648);
    }

    @Test
    public void testSubtractionTwoPositive() {
        assertTrue(calculator.subtraction(25,10) == 15);
    }

    @Test
    public void testSubtractionTwoNegative() {
	    assertTrue(calculator.subtraction(-20,-30) == 10);
    }

    @Test
    public void testSubtractionPositiveAndNegative() {
	    assertTrue(calculator.subtraction(10, -20) == 30);
    }

    @Test
    public void testSubtractionTwoZero() {
	    assertTrue(calculator.subtraction(0, 0) == 0);
    }

    @Test
    public void testSubtractionTwoMAX_VALUE() {
	    assertTrue(calculator.subtraction(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
    }

    @Test
    public void testSubtractionTwoMIN_VALUE() {
	    assertTrue(calculator.subtraction(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
    }

    @Test
    public void testSubtractionMAX_VALUEAndMIN_VALUE() {
	    assertTrue(calculator.subtraction(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
    }

    @Test
    public void testSubtractionMAX_VALUEAndOne() {
	    assertTrue(calculator.subtraction(Integer.MAX_VALUE, 1) == 2147483646);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivisionWithZero() {
    	assertTrue(calculator.division(4, 0) == 0);
    }

    @Test
    public void testDivisionTwoPositive() {
	    assertTrue(calculator.division(4, 2) == 2);
    }

    @Test
    public void testDivisionTwoNegative() {
	    assertTrue(calculator.division(-4, -2) == 2);
    }

    @Test
    public void testDivisionPositiveAndNegative() {
	    assertTrue(calculator.division(4, -2) == -2);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivisionOneNegativeOneZero() {
    	assertTrue(calculator.division(-4, 0) == 0);
    }

    @Test
    public void testDivisionTwoMAX_VALUE() {
	    assertTrue(calculator.division(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
    }

    @Test
    public void testDivisionTwoMIN_VALUE() {
	    assertTrue(calculator.division(Integer.MIN_VALUE, Integer.MIN_VALUE) == 1);
    }

    @Test
    public void testDivisionMAX_VALUEAndOne() {
	    assertTrue(calculator.division(Integer.MAX_VALUE, 1) == 2.147483647E9);
    }

    @Test
    public void testCompoundInterest() {
	    assertTrue(calculator.compoundInterest(1200, 4, 5).equals("1459.98"));
    }
    
    @Test
    public void testMinusCompoundInterest() {
	    assertTrue(calculator.compoundInterest(-1200, 4, 5).equals("-1459.98"));
    }
    
    @Test
    public void testEmptyCompoundInterest() {
	    assertTrue(calculator.compoundInterest(0, 0, 0).equals(".00"));
    }
    
    @Test
    public void testStringToBinary() {
    	assertTrue(calculator.StringToBinary(1954533).equals("111011101001011100101"));
    }
    
    @Test
    public void testStringToBinaryMAX_VALUE() {
    	assertTrue(calculator.StringToBinary(Integer.MAX_VALUE).equals("1111111111111111111111111111111"));
    }
    
    @Test
    public void testStringToBinaryMIN_VALUE() {
    	assertTrue(calculator.StringToBinary(Integer.MIN_VALUE).equals("10000000000000000000000000000000"));
    }
    
    @Test
    public void testStringToHexa() {
    	assertTrue(calculator.StringToHexa(1954533).equals("1dd2e5"));
    }
    
    @Test
    public void testStringToHexaMAX_VALUE() {
    	assertTrue(calculator.StringToHexa(Integer.MAX_VALUE).equals("7fffffff"));
    }
    
    @Test
    public void testStringToHexaMIN_VALUE() {
    	assertTrue(calculator.StringToHexa(Integer.MIN_VALUE).equals("80000000"));
    }
    
    @Test
    public void testQuadraticEquationFunctioning() {
    	assertTrue(calculator.QuadraticEquation(1, 4, 3).equals(Arrays.asList(-3.0, -5.0)));
    }
    
    @Test
    public void testQuadraticEquationMissingA() {
    	assertTrue(calculator.QuadraticEquation(0, 4, 3).isEmpty());
    }
    
    @Test
    public void testQuadraticEquationMissingB() {
    	assertTrue(calculator.QuadraticEquation(1, 0, 3).isEmpty());
    }
    
    @Test
    public void testQuadraticEquationMissingC() {
    	assertTrue(calculator.QuadraticEquation(1, 4, 0).equals(Arrays.asList(-2.0, -6.0)));
    }
    
    @Test
    public void testEmptyQuadraticEquation() {
    	assertTrue(calculator.QuadraticEquation(0, 0, 0).isEmpty());
    }
    
    @Test
    public void testPrimeCheckerIsTrue() {
    	assertTrue(calculator.PrimeChecker(7).equals(true));
    }
    
    @Test
    public void testPrimeCheckerIsFalse() {
    	assertTrue(calculator.PrimeChecker(8).equals(false));
    }
    
    @Test
    public void testPrimeCheckerZero() {
    	assertTrue(calculator.PrimeChecker(0).equals(false));
    }
}