/*Sophia Fisher
  Chapter 9 - Exception Machine
  Adams- 7th period
  4 December 2018
 */

//debugging TIME!

public class ExceptionMachine 
{

	public static void main(String[] args)
	{
		// indexoutofbounds exception 
		try
		{
			System.out.println("Have not declared username yet...");
	      String username = "Elmer";
	      System.out.println("The username = " + username);
	      char firstLetter = username.charAt(-1);
	      System.out.println("First char: " + firstLetter);
		}
		catch (Exception ex)
		{
			System.out.println("Error: " + ex.toString());
		}

	      // nullpointer exception
		try 
		{
		System.out.println("Have not set input Password");
	      String inputPassword = null;
	  	System.out.println("Set input Password = " + inputPassword);
	      String storedPassword = "mystery";
	      if (inputPassword.equals(storedPassword))
	      {
	         System.out.println("Login successful");
	      }
		}
		catch (Exception ex)
		{
			System.out.println("Error: " + ex.toString());
		}

	      // arithmetic exception
		try
		{
			System.out.println("Have not set numGrades");
	      int numGrades = 0;
	    	System.out.println("Set input grades = " + numGrades);
	      int totalScore = 500;
	   	System.out.println("Set total Score = " + totalScore);
	      double avgGrade = totalScore / numGrades;
	      System.out.println("Grade average: " + avgGrade);
		}
		catch (Exception ex)
		{
			System.out.println("Error: " + ex.toString());
		}

	}

}
