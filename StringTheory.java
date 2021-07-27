/*Sophia Fisher
  Chapter 5 - String Theory
  Adams - 7th period
  25 October 2018
 */

//prints out strings using unique methods

import java.util.Calendar;

public class StringTheory 
{
	public static void main(String[] args)
	{
		String str1 = "Bibbety";
		String str2 = "Bobbety";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		
		System.out.println("str1 equals str4: " + str1.equals(str4));
		System.out.println("str1 equals str4 (ignore case): " + str1.equalsIgnoreCase(str4));
		System.out.println("str1 replacing 'b' with 'p': " + str1.replace('b', 'p'));
		System.out.println("first three characters in str2: " + str2.substring(0,3));
		System.out.println("uppercase str3: " + str3.toUpperCase());
		
		String result = String.format("the current time is: %tr" , Calendar.getInstance());
		System.out.println(result);
		
		result = String.format("str1 + str2: %s%s", str1, str2);
		System.out.println(result);
		
		int parseInt = Integer.parseInt("5");
		System.out.println("parseInt result: " + parseInt);
		
		int indexOf = str1.indexOf('e'); 
		System.out.println("location of \'e\' in str1: " + indexOf);
	}

}
