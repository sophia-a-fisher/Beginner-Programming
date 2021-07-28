/*Sophia Fisher
  Chapter 11 - Car Tester
  Adams - 7th period
  18 January 2019
 */

public class CarTester 
{

	public static void main( String[] args ) 
	   {
	      //Car car1 = new Car();
	      //car1.setTrip(1200, 1500, 12);
	      Car car1 = new Car(1200, 1500, 12);
	      System.out.println("Car1 gets " + car1.calculateMPG() + " MPG" );

	      //Car car2 = new Car();
	      //car2.setTrip(27000, 28000, 30);
	      Car car2 = new Car(27000, 28000, 30);
	      System.out.println("car2 gets " + car2.calculateMPG() + " MPG" );
	   }

}
