/*Sophia Fisher
  Chapter 8 - Multiplication Function
  Adams - 7th period
  14 December 2018
 */

//oops looks like we forgot to do this assignment

public class Multiplication
{

	public static void main(String[] args)
	{
		//call the printTable method to print out message
	printTable(5);
	printTable(6);
	printTable(7);
	
	}
	
	public static void printTable(int number)
	{
		int answer;
		
		//print out the answer for persons number times 1,2,3,4...
		for(int j = 1; j < 11; j++)
		{
			answer = number * j;
			System.out.println(j + " x " + number + " = " + answer);
		}
		System.out.println("");
	}

}
