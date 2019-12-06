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
        System.out.println( "First Sum: " + firstValue + " + " + secondValue + " = " + calculator.sum(10, 20) );
    }
}
