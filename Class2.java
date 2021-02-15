
/**
 * @author horaciovaldes
 *
 */
public class Class2 
{
	public static void main(String[] args)
	{
//		Single line comment
		/*Multiple
		 * line
		 * comment
		 */
//		Variable declaration
		int numStudents;
		
//		Variable initialization
		numStudents = 20;
		
//		Primitive data types (built-in)
		boolean isHappy;	//True or false
		char firstInittial = 'C'; //Represents a character, 16 bits long
		
		//Integer types
		byte num1 = 10;	// 8 bits long (-128-127)
		short num2;	// 16 bits
		int num3;	// 32 bits
		long num4;	//64 bits
		
		//Non-integer types
		float num5 = 0.5f;//32 bits
		double num6 = 0.5;	// 64 bits
		
		//Non-primitive types, a.k.a reference types--pointers
		String name = "Amber";
		
		//Literals--represent hard coded values
		//E.g., 10, 'C', "Amber", 0,5
		
		//Reserved words/keywords
		//if, byte, long, ..., public, static
		
		//Identifiers - names of variable, methods, classes (chosen by programmer)
		// contain, letters, digits, '$', '_'
		// Cannot start with digit
		// cannot be reserved words
		
		// Operators:
		// assignment: =
		// arithmetic: +,-,*,/
		// Increment/decrement operators: --,++
		// Comparison: >, <, ==, <=, >=
		// Logical: &&, ||
		
		// Statement: a single command executed by the Java interpreter
		
		// Array: a collection of elements
		// Has a fixed size
		// All the elements are of the same types
		// Elements can be directly accessed by index (1st element at index 0)
		
		// Array declaration
		int[] nums1;
		int[] nums2;
		
		// Array initialization
		nums1 = new int[10];
		
		nums2 = new int[] {1,2,3,4};
		
		// Structured Programming Theorem
		// Any program/algorithm can be implemented with
		// Sequential instructions
		// Selection (branching, conditionals, if-statements)
		// Iteration (Loops, repetition)
		
		// Selection
		// If-statements
		int classDuration = 75;
		if(classDuration <= 75) 
		{
			System.out.println("I am happy");
		}
		else
		{
			System.out.println("I am not so happy");
		}
		
		// switch statements
		
		switch (classDuration){
		case 75: 
				System.out.println("75");
				break;
		
		case 65: 
				System.out.println("65");
				break;
			
		}
		
		/*
		 * Loops/Iteration
		 * While loop
		 * For loop
		 */
		
		int x = 1;
		
		System.out.println("While Loop");
		
		while(x <= 10) 
		{
			System.out.println(x);
			x++;
		}
		
		System.out.println("For Loop");
		
		//Variable visible in the for loop scopes
		for(int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
	}
}
