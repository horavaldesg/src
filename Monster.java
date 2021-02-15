
public class Monster {
	private double health ;
	private double strength;
	private String name;
	private int speed; 
	
	public Monster() {
		this.health = 0;
		this.strength = 0;
	}
	public Monster(String newName, double newHealth, double newStrength, int newSpeed) {
		this.health = newHealth;
		this.strength = newStrength;
		this.name = newName;
		this.speed = newSpeed;
	}
    public double getHealth() { return this.health; }
    public double getStrength() { return this.strength; }
    public String getName() { return this.name;}
    public double getSpeed() {return this.speed;}
    
    
    
    
    public double setHealth(double health) { return this.health = health; }
    public double setStrength(double strength) { return this.strength = strength; }
    public String setName(String name) {return this.name = name;}
    public double setSpeed(int speed) {return this.speed = speed;}
    
    public double attack() {return  Math.random() * this.strength;}
    public double takeDamage(double damage) {return this.health = this.health - damage;}
    
    public double getAttackPriority() { return  this.speed * Math.random();}
//    public double getAttackPriority() { return 1;}
    public String toString() {return String.format("name: %s, health: %.2f, strength: %.2f, speed: %d", this.name, this.health, this.strength, this.speed);}

    
    public Boolean isAlive() {
    	if(health>0) {
    		return true;
    	}
    	else
    		return false;
    	
}
}
