import java.io.*;
import java.util.*;
public class FileIO_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("csc111_file.txt");
		Scanner kb = null;
		try 
		{
			kb = new Scanner(file);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		while(kb.hasNextLine()) {
			System.out.print(kb.nextLine() + " ");
		}
		
//		while(kb.hasNext()) {
//			System.out.print(kb.next() + " ");
//		}
		
		/*Writing to a File
		 * Use a FileWriter to create an output stream to the file
		 * Nest the FileWriter inside the PrintWriter. PrintWriter provides
		 * additional methods for writing.
		 * Write to the file using methods of the PrintWriter
		 * Close the streams when done
		 */
		
		try {
			FileWriter fileWriter = new FileWriter("qu_file.txt");
			PrintWriter out = new PrintWriter(fileWriter);
			out.println("We like bobcats!");
			out.println("We also like the Sleeping Giant");
			fileWriter.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
