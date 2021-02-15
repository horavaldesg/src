import java.util.*;
public class OddNumberPrinter {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int a = 0;
		
		//Takes input as a string and removes spaces
		String inp[]= kb.nextLine().split("\\s");
		
		//Loop to convert string into an integer depending on the lines length
		for(int i = 0 ;i < inp.length;i++)
		{
			//turns inp to an int and assigns it to a
		    a= Integer.parseInt(inp[i]);
		    
		    // Finds all the odd numbers and prints them
		    if(a % 2 != 0) 
		    {
		    System.out.print(a + " ");
		    }
		}
		
	}
	

}

