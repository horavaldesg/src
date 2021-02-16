import java.io.*;
import java.util.Scanner;
public class MonsterBattle {
	public static Boolean validFileName = false;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("1: Premade Enemies \n2: Make your own Enemies");
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
		
		//Monster A goes first
		while(monsterIsAlive) {
			monsterA.getAttackPriority();
			
			monsterB.getAttackPriority();
			if(monsterA.getAttackPriority() > monsterB.getAttackPriority()) 
			{
				monsterB.takeDamage(monsterA.attack());
				System.out.printf("%s attacked %s for %.2f damage \n", monsterA.getName(), monsterB.getName(), monsterA.attack());
				
				if(monsterA.isAlive() && monsterB.isAlive()){
					System.out.println(monsterA.toString());
					System.out.println(monsterB.toString());
					System.out.println("\n");
				}
				else if(monsterA.isAlive() && monsterB.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterA.getName());
					monsterIsAlive = false;
				}
				
				
			}
			//Monster B goes first
			else if(monsterA.getAttackPriority() < monsterB.getAttackPriority()) 
			{
				monsterA.takeDamage(monsterB.attack());
				System.out.printf("%s attacked %s for %.2f damage\n", monsterB.getName(), monsterA.getName(), monsterB.attack());
				if(monsterB.isAlive() && monsterA.isAlive()){
					System.out.println(monsterA.toString());
					System.out.println(monsterB.toString());
					System.out.println("\n");
				}
				else if(monsterB.isAlive() && monsterA.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterB.getName());
					monsterIsAlive = false;
				}
				
	
			}
			else if(monsterA.getAttackPriority() == monsterB.getAttackPriority()) 
			{
				double randDouble = Math.random();
				int rand = 0;
				if(randDouble >= 0.5f) {
					rand = 1;
				}
				else {
					rand = 0;
				}
				
				
				switch(rand) {
				case 0: //Monster A attacks first
				monsterB.takeDamage(monsterA.attack());
				System.out.printf("%s attacked %s for %.2f damage \n", monsterA.getName(), monsterB.getName(), monsterA.attack());
				
				if(monsterA.isAlive() && monsterB.isAlive()){
					System.out.println(monsterA.toString());
					System.out.println(monsterB.toString());
					System.out.println("\n");
				}
				else if(monsterA.isAlive() && monsterB.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterA.getName());
					monsterIsAlive = false;
				}
					break;
				case 1: // monster B attacks first
				monsterA.takeDamage(monsterB.attack());
				System.out.printf("%s attacked %s for %.2f damage\n", monsterB.getName(), monsterA.getName(), monsterB.attack());
				if(monsterB.isAlive() && monsterA.isAlive()){
					System.out.println(monsterA.toString());
					System.out.println(monsterB.toString());
					System.out.println("\n");
				}
				else if(monsterB.isAlive() && monsterA.isAlive() == false) {
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterB.getName());
					monsterIsAlive = false;
				}
					break;
				}
				
			}
				
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
	

