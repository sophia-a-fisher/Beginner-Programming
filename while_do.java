/*Sophia Fisher
  Chapter 7 - Are You Done Yet?
  Adams - 7th period
  15 November 2018
 */

import java.util.*;

public class while_do 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String answer = "";
		
		while(!answer.equalsIgnoreCase("yes") )
		{
			System.out.println("Are you done yet? ");
			answer = input.nextLine();
		}
		
		System.out.println("Finally!");
		
		input.close();
	}

}
