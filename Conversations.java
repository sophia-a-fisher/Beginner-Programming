/*Sophia Fisher
  Chapter 6 - Conversations
  Adams - 7th period
  6 November 2018
 */

// This will demonstrates my user input knowLEDGE

import java.util.*;

public class Conversations 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		String name = "";
		String noun = "";
		String verb = "";
		int int1 = 1;
		double double1 = 1.0;
	
		System.out.print("Enter you name: ");
		name = input.nextLine();
		
		System.out.print("Enter a noun: ");
		noun = input.next();
		input.nextLine();
	
		System.out.print("Enter a verb: ");
		verb = input.next();
		input.nextLine();
		
		System.out.println("Enter a integer: ");
			if(input.hasNextInt() )
			{
				int1 = input.nextInt();
			
			}
		
		input.nextLine();
		
		System.out.println("Enter a rational number: ");
		if(input.hasNextDouble() )
		{
			double1 = input.nextDouble();
		
		}
	
	input.nextLine();
	
	String story = "One day " + name + " decided to eat a " + noun + ".\n";
	story += "Since the " + noun + " was so yummy, " + name + " chose to eat " + int1 + " more.\n";
	story += "Because " + name + " wanted to " + verb + " he" ; 
	story += " was thrown in jail and had to pay $" + double1 + " to get out.";
	
	System.out.print(story);
	}
}
