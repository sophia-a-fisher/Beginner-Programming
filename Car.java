/*Sophia Fisher
  Chapter 10 - Car Milage
  Adams - 7th period
  15 January 2019
 */

//using classes in other classes

public class Car 
{
  // class member variables
  private double startMiles; 
  private double endMiles; 
  private double gallons; 

  // set the car trip details
  public void setTrip(int start, int end, int gals)
  {
      startMiles = start;
      endMiles   = end;
      gallons    = gals;
  }

  // calculate miles-per-gallon
  public double calculateMPG()
  {
      return (endMiles - startMiles) / gallons;
  }
}