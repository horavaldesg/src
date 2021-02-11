
public class RepeatArgsExtra 
{
	public static void main(String[] args)
    {
      int index = 0;
      int numLength = 0;
      while(index < args.length)
      {
        while(numLength < args[index].length())
        {
          System.out.println(args[index]);
          numLength++;
        }
        index+=1;
      }
    }
}
