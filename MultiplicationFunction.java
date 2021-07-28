/*Sophia Fisher
  Chapter 8 - Average Method
  Adams - 7th period
  28 November 2018
 */

//making our own methods

public class MultiplicationFunction
{

	public static void main(String[] args)
	{
		printTable(5);
		printTable(6);
		printTable(7);

	}
	
public static void printTable(int number)
{
	int answer;
	
	for(int j=1; j<11; j++)
	{
		answer = number * j;
		System.out.println(j + " x " + number + " = " + answer);
	}
	System.out.println("");
	
}
}
