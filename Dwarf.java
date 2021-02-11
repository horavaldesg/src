
public class Dwarf {
	double height;
	String name;
	String mood;
	
	// Constructor methods
	public Dwarf(double height, String name, String mood) 
	{
		this.height = height;
		this.name = name;
		this.mood = mood;
		
	}
	public Dwarf() 
	{
		this.height = 3;
		this.name = "Boulder";
		this.mood = "happy";
	}
	
	// Instance methods
	public String sayAnAdjective() 
	{
		if(mood.equals("happy")) 
			return "wonderful";
		if(mood.equals("grumpy"))
			return "terrible";
		else 
			return "normal";
	}
}

