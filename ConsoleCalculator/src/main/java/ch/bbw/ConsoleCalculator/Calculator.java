package ch.bbw.ConsoleCalculator;

import java.text.DecimalFormat;

/**
 * Calculator.java
 * Contains different methods for a fully fledged calculator.
 * 
 * @author Jamie Lam
 * @version 0.0.1
 */

public class Calculator {
	
	DecimalFormat df = new DecimalFormat("#.00"); 

	public int sum(int value1, int value2) {
		return value1 + value2;
	}

	public int subtraction(int value1, int value2) {
	    return value1 - value2;
    }
	
	public int division(int value1, int value2) {
		return value1 / value2;
	}

	public String compoundInterest(double monopoly, double p, double n) {
		return df.format(monopoly * Math.pow((1 + p / 100), n));
	}
	
	public String StringToBinary(int value) {
		return Integer.toBinaryString(value);
	}
	
	public String StringToHexa(int value) {
		return Integer.toHexString(value);
	}
}
