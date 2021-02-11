import java.util.*;
public class ExceptionDemo {
	
	/*
	 * Exception: A signal that indicates that an exceptional condition
	 * has occurred in a program.
	 * To 'throw' an exception: to signal that a problem has occurred
	 * To 'catch' an exception: to handle the problem/exceptional situation
	 * 
	 * Program flow when an exception is thrown
	 * The Java interpreter attempts to find a matching exception handler
	 * associated with the enclosing block of code
	 * If not found, the exception is propagated to the calling method
	 * If the main method is reached without finding a matching handler,
	 * the program terminates
	 * 
	 * Catching exceptions
	 * try 
	 * {
	 * 	...
	 * 	a statement that can throw an exception
	 * 	...
	 * }
	 * 
	 * catch (ExceptionType exceptionName)
	 * {
	 * 	...
	 * 	code to handle the exception
	 * 	...
	 * }
	 * 
	 */
	
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		try 
		{
			int quotient = divide(a,b);
			System.out.printf("%d / %d = %d", a, b, quotient);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Sorry, try again, division by zero is not allowed");
			main(args); //rerun the program
		}
		
		kb.close();
	}
	public static int divide(int a, int b) 
	{
		return a/b;
	}
}
