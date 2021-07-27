/*Sophia Fisher
  Chapter 6 - Command Line Echo
  Adams - 7th period
  30 October 2018
 */

//uses user input to output message as echo

public class CommandLineEcho 
{

	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			System.out.println("You entered: " + args[0]);
		}
		
		System.out.println("That's all, folks!");

	}

}
