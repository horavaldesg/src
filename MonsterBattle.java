/**
 *  Description: Monster class controller
 */

/**
 * @author Horacio Valdes and Hanna Morreale
 *
 *
 */
import java.io.*;
import java.util.Scanner;
public class MonsterBattle {
	
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
		case 2: createMonsterA();
				
			
			
			break;
		default: System.out.println("Please enter a number between 1 and 2.");
		
		
		}
	}
	
	public static void createMonsterA() {
		Scanner kb = new Scanner(System.in);

		//First Monster
		System.out.println("Please enter a file name for the first monster");
//		kb.nextLine();
		
		String fileName = kb.nextLine();
		File file = new File(fileName);
		Monster monsterA = new Monster();
		try 
		{
			kb = new Scanner(file);
			
		} 
		catch (FileNotFoundException e) 
		{
			createMonsterA();
		}
		while(kb.hasNextLine()) {
			
			monsterA.setName(kb.nextLine());
			monsterA.setHealth(kb.nextDouble());
			monsterA.setStrength(kb.nextDouble());
			monsterA.setSpeed(kb.nextInt());
			
		}
		kb.close();
		/*
		System.out.println(monsterA.getName());
		System.out.println(monsterA.getHealth());
		System.out.println(monsterA.getStrength());
		System.out.println(monsterA.getSpeed());
		*/
		
		createMonsterB(monsterA);

	}
	public static void createMonsterB(Monster monsterA) {
		Scanner kb = new Scanner(System.in);
		
		//First Monster
		System.out.println("Please enter a file name for the second monster");
//		kb.nextLine();
		
		String fileName = kb.nextLine();
		File file = new File(fileName);
		
		Monster monsterB = new Monster();
		try 
		{
			kb = new Scanner(file);
			
		} 
		catch (FileNotFoundException e) 
		{
			createMonsterB(monsterA);
		}
		while(kb.hasNextLine()) {
			
			monsterB.setName(kb.nextLine());
			monsterB.setHealth(kb.nextDouble());
			monsterB.setStrength(kb.nextDouble());
			monsterB.setSpeed(kb.nextInt());
			
			
		}
		
		kb.close();
		/*
		System.out.println(monsterB.getName());
		System.out.println(monsterB.getHealth());
		System.out.println(monsterB.getStrength());
		System.out.println(monsterB.getSpeed());
		*/
		
		
		Battle(monsterA, monsterB);
	}
	
	public static void Battle(Monster monsterA, Monster monsterB) {
		//Run battle
		
		
		//Who attacks first
		
		//Monster A goes first
		while(monsterA.isAlive() && monsterB.isAlive()) {
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
					System.out.printf("%s: %f\n", monsterA.getName() , monsterA.getHealth());
					System.out.printf("%s: %f\n",monsterA.getName() , monsterB.getHealth());
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterA.getName());
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
					System.out.printf("%s: %f\n", monsterA.getName() , monsterA.getHealth());
					System.out.printf("%s: %f\n",monsterA.getName() , monsterB.getHealth());
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterB.getName());
				}
				
	
			}
			//Attack priority is the same on both monsters
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
					System.out.println(monsterA.getName() + monsterA.getHealth());
					System.out.println(monsterA.getName() + monsterB.getHealth());
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterA.getName());
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
					System.out.printf("%s: %f\n", monsterA.getName() , monsterA.getHealth());
					System.out.printf("%s: %f\n",monsterA.getName() , monsterB.getHealth());
					System.out.printf("%s is declared the winner and the battle is over Monster\n", monsterB.getName());
				}
					
				}
				
			}
				
	
			
		}
	}
}
	

