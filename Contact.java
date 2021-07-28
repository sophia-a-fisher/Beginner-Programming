/*Sophia Fisher
  Chapter 14 - Contact
  Adams - 7th period
  19 February 2019
 */

public class Contact 
{
	public String name;
	public String number;
	
	public Contact(String n , String num)
	{
		name = n;
		number = num;
		
	}

	public static void main(String[] args) 
	{
		Contact[] contacts = new Contact[5];
		contacts[0] = new Contact( "George Washington", "(800) 555-1234" ); 	    
		contacts[1] = new Contact( "John Adams", "(800) 555-4567" );
        contacts[2] = new Contact( "Thomas Jefferson", "(800) 555-7890" );
	    contacts[3] = new Contact( "James Madison", "(800) 555-3456" );
	    contacts[4] = new Contact( "James Monroe", "(800) 555-2345" );
	    
	    search(contacts,"George Washington");
	    search(contacts,"James Monroe");
	    search(contacts,"Andrew Jackson");

	}
	
	private static void search(Contact[] contacts, String targetName)
	{
		for (int i = 0; i < 5; i++)
		{
			if (contacts[i].name.equalsIgnoreCase(targetName))
	         {
	            // print out name and number
	            System.out.println( contacts[i].name + ": " + contacts[i].number );

	            // all done searching, exit loop early
	            return; 
	         }
		}
		
		System.out.println( targetName + ": NOT FOUND");
	}

}
