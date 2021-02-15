import java.io.*;
import java.util.Scanner;
public class MonsterBattle {
	public static Boolean validFileName = false;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();
		
		switch(input) {
		case 1: 
			Monster Giant = new Monster("Giant", 200, 25, 1);
			Monster Ogre = new Monster("Ogre", 100, 50, 3);
			Battle(Giant, Ogre);
			
			break;
		case 2: createMonster();
			
			
			
			break;
		default: System.out.println("Please enter a number between 1 and 2.");
		
		
		}
	}
	
	public static void Battle(Monster monsterA, Monster monsterB) {
		//Run battle
		Boolean monsterIsAlive = true;
		
		//Who attacks first
		monsterA.getAttackPriority();
		
		monsterB.getAttackPriority();
		//Monster A goes first
		while(monsterIsAlive) {
			if(monsterA.getAttackPriority() > monsterB.getAttackPriority()) 
			{
				System.out.printf("%s attacked %s for %.2f damage \n", monsterA.getName(), monsterB.getName(), monsterA.attack());
				
				monsterB.takeDamage(monsterA.attack());
				if(monsterA.isAlive() && monsterB.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterA.getName());
					monsterIsAlive = false;
				}
				
				else {
					System.out.println(monsterA.toString());
					System.out.println(monsterB.toString());
				}
			}
			//Monster B goes first
			else if(monsterA.getAttackPriority() < monsterB.getAttackPriority()) 
			{
				System.out.printf("%s attacked %s for %.2f damage\n", monsterB.getName(), monsterA.getName(), monsterB.attack());
				monsterA.takeDamage(monsterB.attack());
				 if(monsterB.isAlive() && monsterA.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterB.getName());
					monsterIsAlive = false;
				}
				else {
					monsterA.toString();
					monsterB.toString();
				}
	
			}
//			else if(monsterA.getAttackPriority() == monsterB.getAttackPriority()) 
//			{
//				System.out.printf("%s attacked %s for %.2f damage\n", monsterB.getName(), monsterA.getName(), monsterB.attack());
//				monsterB.takeDamage(monsterA.attack());
//				if(monsterA.isAlive() && monsterB.isAlive() == false) {
//					System.out.printf("%s is declared the winner and the battle is over\n", monsterA.getName());
//					monsterIsAlive = false;
//				}
//				else if(monsterB.isAlive() && monsterA.isAlive() == false) {
//					System.out.printf("%s is declared the winner and the battle is over\n", monsterB.getName());
//					monsterIsAlive = false;
//				}
//				else {
//					monsterA.toString();
//					monsterB.toString();
//				}
//			}
				
		//Attack
				
				
		
		//Win condition
			
		}
	}
	
	public static void createMonster() {
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter a file name");
//		kb.nextLine();
		
		String fileName = kb.nextLine();
		readMonster(fileName);
		System.out.println("Please enter a file name for the second monster");
		
//		kb.nextLine();
		
		String fileName2 = kb.nextLine();
		readMonster(fileName2);
	}
	
	public static void readMonster(String name) {
		
		try 
		{
			FileWriter fileWriter = new FileWriter(name);
			PrintWriter out = new PrintWriter(fileWriter);
			name = name.split(".txt")[0];
			Monster newMonster = new Monster();
			// Write file with values
			out.println(newMonster.setName(name));
//			System.out.println(newMonster.toString());
			validFileName = true;
			
			out.close();
		} 
		catch (IOException e) 
		{
			
			createMonster();
		}
	}
}
	

