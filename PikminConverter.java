/*Sophia Fisher
  Independent Project
  Adams - 7th Period
  13 December 2018
 */

//This will ask for your amount of pikmin
//Then will add or subtract amount depending on what your choices are
import java.util.*;

public class PikminConverter
{
	
	static Scanner input;
	
	public static void main(String[] args)
	{
		//declaring variables for game

	
	input = new Scanner(System.in);
	printIntro();
	int redPikmin = getPikmin();
	playGame(redPikmin);
	
	input.close();
		
	}
	
	public static void printIntro()
	{
		//output friendly message explaining game
		System.out.println("Welcome to Pikmin Converter! We convert good choices to pikmin!!");
		System.out.print("Please enter your amount of starting red pikmin: ");
	}
	
	public static int getPikmin()
	{
		//can not close scanner object until its last use
		//input = new Scanner(System.in);
		int redPikmin = 0;
		
		if (input.hasNextInt())
		{
		redPikmin = input.nextInt();
		//get rid of newline char for next time we read this thing
		input.nextLine();
		System.out.println("Red pikmin: " + redPikmin);
		}

		else 
		{
			System.out.println("ERROR you needed to enter an integer");	
		}
		//input.close();
		
		return redPikmin;
	}
	
	public static void playGame(int pikmin)
	{
		//input = new Scanner(System.in);
		String answer = "";
		System.out.println("The game must begin...\nDo you choose to go into the Whispering Garden?");
		
		if(input.hasNext()) {
		answer = input.nextLine();
		
		
		
		if(answer.charAt(0) == 'y' || answer.charAt(0) =='Y')
		{
			pikmin -= 6;
			System.out.println("You lost 6 pikmin. You now have: " + pikmin);
		}
		else
		{
			System.out.println("You made the right choice. You still have: " + pikmin);
		}
		
		}
	}
}

//this game did not work
