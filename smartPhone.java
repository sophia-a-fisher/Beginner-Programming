/*Sophia Fisher
  Chapter 10 - Smartphone
  Adams - 7th period
  10 January 2019
 */

//this is connected to Battery class


public class smartPhone 
{
	//we used program tracing to solve problem
	
	public static void main(String[] args) 
	{
		//System.out.println("The program is about to create a Battery object.");
		Battery myBattery = new Battery();
		//System.out.println("The program has created a Battery object.");
		myBattery.charge(10);
		//System.out.println("The program set charge to 10.");
		System.out.println("Battery is " + myBattery.getPercentFull() + "% full");
	}

}

//code not working check later --- code FIXED!