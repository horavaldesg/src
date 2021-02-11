
public class DwarfDriver {
	public static void main(String[] args) 
	{
		//Create dwarfs
		Dwarf boulder = new Dwarf();
		Dwarf grumpy = new Dwarf(2, "Grumpy", "grumpy");
		
		//Make sentence
		String part1 = "First dwarf is feeling ";
		String part2  = "Second dwarf is feeling ";
		
		part1 = part1 + boulder.sayAnAdjective();
		part2 = part2 + grumpy.sayAnAdjective();
		
		System.out.println(part1 + "\n" + part2);
	}
}
