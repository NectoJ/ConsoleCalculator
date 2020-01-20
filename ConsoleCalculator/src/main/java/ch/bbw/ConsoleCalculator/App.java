package ch.bbw.ConsoleCalculator;

/**
 * Console Calculator
 * 
 * @author Jamie Lam
 * @version 0.0.1
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	
    	System.out.print("Console Calculator" + "\n\n" );
    	
    	int firstValue = 10;
		int secondValue = 20;
        System.out.println("Addition: " + firstValue + " + " + secondValue + " = " + calculator.sum(firstValue, secondValue) );
        System.out.println("Subtraction: " + firstValue + " - " + secondValue + " = " + calculator.subtraction(firstValue, secondValue));
        System.out.println("Division: " + firstValue + " / " + secondValue + " = " + calculator.division(4, 2));
        System.out.println("Compound Interest: " + calculator.compoundInterest(1200, 4, 5));
        System.out.println("String to Binary: " + calculator.StringToBinary(1954533));
        System.out.println("Integer to Hexa: " + calculator.StringToHexa(1954533));
        System.out.println("QuadraticEquation: " + calculator.QuadraticEquation(1, 4, 3));
        System.out.println("PrimeChecker: " + calculator.PrimeChecker(7));
    }
}
