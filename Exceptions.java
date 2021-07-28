/*Sophia Fisher
  Chapter 9 - Predicting Exceptions
  Adams - 7th period
  4 December 2018
 */
public class Exceptions
{

	public static void main(String[] args) 
	{
		// indexoutofbounds exception 
	      String username = "Elmer";
	      char firstLetter = username.charAt(-1);
	      System.out.println("First char: " + firstLetter);

	      // nullpointer exception
	      String inputPassword = null;
	      String storedPassword = "mystery";
	      if (inputPassword.equals(storedPassword))
	      {
	         System.out.println("Login successful");
	      }

	      // arithmetic exception
	      int numGrades = 0;
	      int totalScore = 500;
	      double avgGrade = totalScore / numGrades;
	      System.out.println("Grade average: " + avgGrade);

	}

}
