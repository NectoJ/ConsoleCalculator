package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/** CalculatorTest.java
 *
 * @author Jamie Lam
 * @version 30.11.2019
 */

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void testSumAddTwoPositive() {
        calculator = new Calculator();
        assertTrue(calculator.sum(10,25) == 35);
    }
}