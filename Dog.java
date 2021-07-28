/*Sophia Fisher
  Chapter 10 - Dog House
  Adams - 7th period
  17 January 2019
 */

//The Chapter 10 Activity

public class Dog
{
private int numTimesFed = 0;
private boolean sleeping = false;
private String name = "Slobbery";

	public String getName()
	{
	return name;
	}
	
	public void wakeUp()
	{
	System.out.println("WAKING UP");
	sleeping = false;
	numTimesFed = 0;
	}

	public void sleep()
	{
	sleeping = true;
	System.out.println("SLEEPING");
	}
	
	public void hear(String sound)
	{
		if (sleeping == true)
		{
			return;
		}
		
		if(sound.equals(name))
		{
		System.out.println("WAG TAIL");
		}
		
		if(sound.equals("ding-dong"))
		{
		System.out.println("BARK");
		}
		
		else
		{
		return;
		}
	}
	
	public void feed()
	{
		if(sleeping == true)
		{
			return;
		}
		
		numTimesFed += 1;
		
		if(numTimesFed > 2)
		{
			System.out.println("YAWN");
		}
		
		else
		{
		System.out.println("YUMMY");
		}
	}
}