import java.util.*;
public class StandardIO_Demo {

	public static void main(String[] args) {
		/*
		 * Input and output consists of streams
		 * Stream is a sequence of bytes
		 * Stream is a sequence of characters
		 * Input sources: Keyboard/console, mouse, file, network
		 * Output sources: Console, file, network
		 * Java provides built-in capabilities for converting raw 
		 * input into a format usable by our programs
		 * 
		 * Standard Input/Output (I/O)
		 * System.in - Java class that represents standard input stream
		 * (typically, corresponds to keyboard input)
		 * System.out - represents standard output stream (typically, 
		 * corresponds to console/monitor)
		 */
		
		// Examples of standard output
//		System.out.println("Hello World");		
//		System.out.printf("%s is %d years old and %f meters tall \n", "Peter", 21, 1.9);
//		
//		System.out.printf("%s is %d years old and %.2f meters tall", "Peter", 21, 1.9);

		//Standard input
		Scanner kb = new Scanner(System.in);
		
		int age = kb.nextInt();
		
		System.out.println("I just read " + age);
		
		double height = kb.nextDouble();
		
		System.out.println("I just read " + height);
		
		kb.nextLine();
		String line = kb.nextLine();
		
		System.out.println("I just read " + height);
	}

}
