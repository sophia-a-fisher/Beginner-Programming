/*Sophia Fisher
  Chapter 7 - Multiplication Tables
  Adams - 7th period
  November 13 2018
 */

//FOR loops!
import java.util.*;

public class MultiplicationTable 
{

	public static void main(String[] args)
	{
		int number = 0;
		int answer = 0;
		
		System.out.print("Enter a multiplication number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		for(int j = 0; j <= 10; j++)
		{
			answer = number * j;
			System.out.println(j + " x " + number + " = " + answer);
		}
		
		input.close();
	}

}
