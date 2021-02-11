import java.io.File;
import java.io.FileNotFoundException;
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
		 * additional methods for writing
		 */
		
		
	}

}
