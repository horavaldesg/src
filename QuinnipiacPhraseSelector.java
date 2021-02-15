import java.io.*;
import java.util.Scanner;
public class QuinnipiacPhraseSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("phrases.txt");
		Scanner kb = null;
		try 
		{
			kb = new Scanner(file);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		String ln = "";
		while(kb.hasNextLine())
		{
			ln = kb.nextLine();
			if(ln.toLowerCase().contains("quinnipiac")){
				System.out.println(ln);
			}
		}
		
		
	}

}
