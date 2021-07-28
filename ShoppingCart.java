/*Sophia Fisher
  Chapter 8 - Shopping Cart
  Adams - 7th period
  28 November 2018
 */

//more things to do with our method

public class ShoppingCart 
{

	public static void main(String[] args)
	{
		purchase("cheese", 5, 3.5);
		
		double result = purchase("milk", 8, 2.1);
		System.out.println("I spent " + result);
		
		System.out.println("I also spent " + purchase("crackers", 19, .45));
	}

	public static double purchase(String product, int quantity, double price)
	{
		double total = quantity * price;
		System.out.println("You have purchased " + quantity + " " + product + " for $" + price);
		
		return total;
	}
}
