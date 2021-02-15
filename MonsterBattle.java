import java.io.*;
import java.util.Scanner;
public class MonsterBattle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int input = kb.nextInt();
		
		switch(input) {
		case 1: 
			Monster Giant = new Monster("Giant", 200, 25, 1);
			System.out.println(Giant.toString());
			Monster Ogre = new Monster("Ogre", 100, 50, 3);
			break;
		case 2: 
			System.out.println("Please enter a file name");
			kb.nextLine();
			
			String fileName = kb.nextLine();
			readMonster(fileName);
			
			break;
		default: System.out.println("Please enter a number between 1 and 2.");
		
		//Run battle
		
		}
	}
	
	public static void readMonster(String name) {
		
		try 
		{
			FileWriter fileWriter = new FileWriter(name);
			PrintWriter out = new PrintWriter(fileWriter);
			Monster newMonster = new Monster();
			// Write file with values
			out.println(newMonster.setName(name));
			
			out.close();
		} 
		catch (IOException e) 
		{
			
			System.out.println(e);
		}
	}
}
	

