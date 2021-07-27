/*Sophia Fisher
  Chapter 5 - Expetional Parsing
  Adams - 7th period
  25 October 2018
 */

//convert strings to other primitive data type variables

public class NunmberConversions 
{

	public static void main(String[] args)
	{
		int pieWidth = Integer.parseInt("17");
		System.out.println(pieWidth);
		
		float sugarGrams = Float.parseFloat("12.95");
		System.out.println(sugarGrams);
		
		boolean eggs = Boolean.parseBoolean("false");
		System.out.println(eggs);
		
		//tablespoonSyrup is supposed to cause ERROR to teach lesson
		byte tablespoonsSyrup = Byte.parseByte("twelve");
		System.out.println(tablespoonsSyrup);

	}

}
