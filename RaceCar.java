/*Sophia Fisher
  Chapter 11 - Race Track
  Adams - 7th period
  24 January 2019
 */

public class RaceCar implements IRacer
{
	
	public RaceCar(String name, double maxSpeed, double acceleration)
	{
		myName = name;
		myMaxSpeed = maxSpeed;
		myAcceleration = acceleration;
		myCurrentSpeed = 0;
	}
	
private String myName;
static private double myMaxSpeed;
private double myAcceleration;
private double myCurrentSpeed;

//declaring some getter methods
	public String getName()
	{
		return myName;
	}
	
	public double getCurrentSpeed()
	{
		return myCurrentSpeed;
	}
	
	public double resetCurrentSpeed()
	{
		return myCurrentSpeed = 0;
	}

	public void accelerate()
	{
		myCurrentSpeed += myAcceleration;
		
		if(myCurrentSpeed > myMaxSpeed)
		{
			myCurrentSpeed = myMaxSpeed;
		}
	}
	

}
