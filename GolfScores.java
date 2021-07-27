/*Sophia Fisher
  Chapter 6 - Golf Scores
  Adams - 7th period
  1 November 2018
 */

import java.util.*;

public class GolfScores 
{

	public static void main(String[] args) 
	{
		String username;
		int course1;
		int course2;
		int course3;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your name and press enter: ");
		username = input.nextLine();
		
		System.out.print("Enter your round 1 score: ");
			if(input.hasNextInt())
			{
				course1 = input.nextInt();
			}
			else
			{
				course1 = 0;
				input.nextLine();
			}
		
		System.out.print("Enter your round 2 score: ");
			if(input.hasNextInt())
			{
				course2 = input.nextInt();
			}
			else
			{
				course2 = 0;
				input.nextLine();
			}
			
		System.out.print("Enter your round 3 score: ");
			if(input.hasNextInt())
			{
				course3 = input.nextInt();
			}
			else
			{
				course3 = 0;
				input.nextLine();
			}
		
		average = (course1 + course2 + course3) / 3;
		
		System.out.println("");
		System.out.println("Hello " + username);
		System.out.println("Score for course 1: " + course1);
		System.out.println("Score for course 2: " + course2);
		System.out.println("Score for course 3: " + course3);
		System.out.println("Average score: " + average);
		
		input.close();
		
		
	}

}
