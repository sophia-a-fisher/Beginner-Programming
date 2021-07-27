/*Sophia Fisher
  Chapter 5 - Alphabet Soup
  Adams - 7th period
  18 October 2018
 */

//print out things relating to strings

public class AlphabetSoup 
{

	public static void main(String[] args) 
	{
		String myName = "Sophia";
		int nameLength = myName.length();
		char firstLetter = myName.charAt(0);
		char lastLetter = myName.charAt(5);
		
		System.out.println("My name is: " + myName);
		System.out.println("The first letter is: " + firstLetter);
		System.out.println("The last letter is: " + lastLetter);

	}

}
