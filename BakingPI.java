/*Sophia FIsher
  Chapter 5 - Baking A PI
  Adams - 7th period
  25 October 2018
 */

//this will demonstrate formatting skills

public class BakingPI
{
	public static void main(String[] args) 
	{
		double pi = 3.14159;
		String result;
		
		result = "PI = " + pi;
		System.out.println(result);
		
		result = String.format("PI = %1$.5f" , pi);
		System.out.println(result);
		
		result = String.format("PI = %f" , pi);
		System.out.println(result);
		
		result = String.format("PI = %e" , pi);
		System.out.println(result);
		
		result = String.format("PI = %.2f" , pi);
		System.out.println(result);
		
		result = String.format("PI = %6.2f" , pi);
		System.out.println(result);
		
		result = String.format("PI = %06.2f" , pi);
		System.out.println(result);
	}
}
