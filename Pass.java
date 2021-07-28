/*Sophia Fisher
  Chapter 7 - Pass
  Adams - 7th period
  9 November 2018
 */

//This will use ifs to do cool stuff
import java.util.*;

public class Pass 
{

	public static void main(String[] args) 
	{
		int grade;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number grade: ");
		grade = input.nextInt();
		
		if(grade >= 90 && grade <= 100)
		{
			System.out.println("You made an A!");
		}
		
		else if(grade > 100)
		{
			System.out.println("That is not possible LIAR!");
		}
		
		else if(grade >= 80)
		{
			System.out.println("You made a B!");
		}
		
		else if(grade >= 71)
		{
			System.out.println("You made a C...");
		}
		
		else if(grade == 70)
		{
			System.out.println("You barely passed!");
		}
		
		else
		{
			System.out.println("You need to study more!");
		}
		
		input.close();
	}

}
