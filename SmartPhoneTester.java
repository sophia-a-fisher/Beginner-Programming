/*Sophia Fisher
  Chapter 11 - Smart Phone Interface
  Adams - 7th period
  18 January 2019
 */

//messing around with interfaces for the first time

public class SmartPhoneTester 
{

	public static void main(String[] args)
	{
	IDialer phone1 = new Android();
	IDialer phone2 = new iPhone();
	
	phone1.call("867-5309");
	phone2.call("867-5309");

	}

}
