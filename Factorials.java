/*Sophia Fisher
  Chapter 7 - Fun Factorials
  Adams - 7th period
  15 November 2018
 */

import java.util.*;

public class Factorials
{

	public static void main(String[] args)
	{
		
	Scanner input = new Scanner(System.in);
	int number;
	
	System.out.print("Enter an integer number and press enter: ");
	
	if(!input.hasNextInt())
	{
		System.out.print("Oops, you entered an invalid answer...what a surprise! Enter an integer. ");
		input.close();
		return;
	}
	
	number = input.nextInt();
	long result = 1;
	
	for(int i = 1; i <= number; i++)
	{
		result = result * i;
	}
	
	System.out.println("for() loop result: " + result);
	
	result = 1;
	int number2 = 1;
	
	while(number2 <= number)
	{
		result = result * number2;
		number2++;
	}
	System.out.println("while() loop result: " + result);
	
	result = 1;
	int number3 = 1;
	
	do
	{
		result *= number3;
		number3++;
	}
	while(number3 <= number);
	
	System.out.println("do-while() loop result: " + result);
	input.close();
	}

}
