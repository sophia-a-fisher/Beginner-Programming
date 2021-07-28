/*Sophia Fisher
  Chapter 11 - Car Tester
  Adams - 7th period
  18 January 2019
 */

public class Car
{

// class member variables
     private double startMiles; 
     private double endMiles; 
     private double gallons; 
  
     // build a car with trip details
     public Car(double start, double end, double gals)
     {
        startMiles = start;
        endMiles   = end;
        gallons    = gals;
     }
  
     // updated the car trip details
     //public void setTrip(double start, double end, double gals)
     //{
        //startMiles = start;
        //endMiles   = end;
        //gallons    = gals;
     //}
  
     // calculate miles-per-gallon
     public double calculateMPG()
     {
        return (endMiles - startMiles) / gallons;
     }
}