/*Sophia Fisher
  Chapter 5 - Account Verification
  Adams - 7th period
  16 October 2018
 */

/*this program prints if the username input is the same 
as what it should be*/

public class StringCompare
{

	public static void main(String[] args) 
	{
		String storedUsername = "captainbob";
		String storedPassword = "ahoy";
		String inputUsername = "CAPTAINBOB";
		String inputPassword = "Ahoy";
		boolean usernameMatch = storedUsername.equalsIgnoreCase(inputUsername);
		boolean passwordMatch = storedPassword.equals(inputPassword);

		System.out.print("Username match: ");
		System.out.print(usernameMatch + "\n");
		System.out.print("Password match: ");
		System.out.print(passwordMatch);
	}

}
