/*Sophia Fisher
 Variables Activity
 Adams - 7th period
 2 October 2018
 */

public class Variables 
{

	public static void main(String[] args)
	{
		//declaring variables and assigning the variables with value

		int age = 14;
		char letter = 'a';
		double data = 3.14;
		boolean answer = true;
			
		//print variable value
		System.out.println(age);
		System.out.println(letter);
		System.out.println(data);
		System.out.println(answer);
		
		//perform math (fun)
		age = age + 1;
		System.out.println(age);
		age += 1;
		System.out.println(age);
		age++;
		System.out.println(age);
		
		int catWeight = 3/2; //catWeight is 1
		double doubleWeight1 = 3/2; //Weight1 is 1.5
		double doubleWeight2 = 3.0/2.0; //Weight2 is 1.5
		float maxFloat = Float.MAX_VALUE; //long decimal
		
		System.out.println(catWeight);
		System.out.println(doubleWeight1);
		System.out.println(doubleWeight2);
		System.out.println(maxFloat);
		
		
	}

}
