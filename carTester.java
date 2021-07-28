/*Sophia Fisher
  CHapter 10 - Car Milage
  Adams - 7th period
  15 January 2019
 */

//connecting classes

public class carTester
{
   public static void main( String[] args ) 
   {
      Car car1 = new Car();
      car1.setTrip(1200, 1500, 12);
      System.out.println("Car1 gets " + car1.calculateMPG() + " MPG" );

      Car car2 = new Car();
      car2.setTrip(27000, 28000, 30);
      System.out.println("car2 gets " + car2.calculateMPG() + " MPG" );
   }
}