/*Sophia Fisher
  Chapter 11 - Smart Phone Interface
  Adams - 7th period
  18 January 2019
 */

//messing around with interfaces for the first time

public class Android implements IDialer
{
	public void call(String phoneNumber)
	{
	System.out.println("Android calling " + phoneNumber);
	}
}
