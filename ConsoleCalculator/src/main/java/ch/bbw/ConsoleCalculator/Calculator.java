package ch.bbw.ConsoleCalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Calculator.java
 * Contains different methods for a fully fledged calculator.
 * 
 * @author Jamie Lam
 * @version 1.0.0
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

	protected String compoundInterest(double monopoly, double p, double n) {
		return df.format(monopoly * Math.pow((1 + p / 100), n));
	}
	
	/**
	 * Ich benutze keine private Methods da Sie bei JUnit Tests nicht getestet werden können.
	 * Es gibt alternative wie PrivilegedAccessor die für solchen Zwecken benutzt werden.
	 * 
	 * Auf jedenfalls funktionieren public, protected und default Methoden.
	 */
	
	String StringToBinary(int value) {
		return Integer.toBinaryString(value);
	}
	
	public String StringToHexa(int value) {
		return Integer.toHexString(value);
	}
	
	// Quadratic Equation = ax^2 + bx + c = 0
	public List<Double> QuadraticEquation(double a, double b, double c) {
        List<Double> solutions = new ArrayList<Double>();
        
        double diskriminant = b * b - 4 * a * c;
        
        if (a == 0) {
        	return solutions;
        } else {
	        if (diskriminant >= 0){
	            if (diskriminant == 0){
	            	solutions.add(-b/(2*a));
	            	return solutions;
	            }
	            else {
	               double x1 = -b + Math.sqrt(diskriminant)/(2*a);
	               double x2 = -b - Math.sqrt(diskriminant)/(2*a);
	               solutions.add(x1);
	               solutions.add(x2);
	               return solutions;
	            }
	         }
	         else {
	           	return solutions;
	         }
        }
	}
	
	//PrimeChecker checks if your input is a prime number or not
	public Boolean PrimeChecker(int n) {
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
	}
}
