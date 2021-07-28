/*Sophia Fisher
  Chapter 7 - Movies
  Adams - 7th period
  9 November 2018
 */
import java.util.*;

public class Movies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a rating from 1 to 5: ");
		int rating = input.nextInt();
		switch(rating)
		{
		case 5:
			System.out.println("See this movie twice!");
			break;
		case 4:
			System.out.println("Worth your time!");
			break;
		case 3:
			System.out.println("An average experience.");
			break;
		case 2:
			System.out.println("Not good");
			break;
		case 1:
			System.out.println("Awful.");
			break;
		default:
			System.out.println("A real dud.");
			break;
		}
		
		input.close();
	}

}
