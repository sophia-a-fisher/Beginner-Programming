import java.util.LinkedList;

/*Sophia Fisher
  Chapter 14 - Iterators
  Adams - 7th period
  29 February 2019
 */
import java.util.*;
public class ContactsImprovedImproved
{
	public String name;
	public String number;
	
	public ContactsImprovedImproved(String n , String num)
	{
		name = n;
		number = num;
		
	}
	
	public static void main (String[] args)
	{
	   // old array code commented out or deleted

	   // create LinkedList 
	   LinkedList<ContactsImprovedImproved> contactList = new LinkedList<ContactsImprovedImproved>();

	   // add 5 Contacts to list 
	   contactList.add(new ContactsImprovedImproved( "George Washington", "(800) 555-1234" )); 
	   contactList.add(new ContactsImprovedImproved( "John Adams", "(800) 555-4567" ));
	   contactList.add(new ContactsImprovedImproved( "Thomas Jefferson", "(800) 555-7890" ));
	   contactList.add(new ContactsImprovedImproved( "James Madison", "(800) 555-3456" ));
	   contactList.add(new ContactsImprovedImproved( "James Monroe", "(800) 555-2345" ));


	   // get first and last Contact from list
	   ContactsImprovedImproved first = (ContactsImprovedImproved)contactList.getFirst();
	   ContactsImprovedImproved last = (ContactsImprovedImproved)contactList.getLast();

	   // print out contact info
	  // System.out.println(first.name + ": " + first.number );
	   //System.out.println(last.name + ": " + last.number );
	   search(contactList,"George Washington");
	   search(contactList,"James Monroe");
	   search(contactList,"Andrew Jackson");
	}
	private static void search(Collection contacts, String targetName)
	{
		/*for (int i = 0; i < 5; i++)
		{
			if (contacts[i].name.equalsIgnoreCase(targetName))
	         {
	            // print out name and number
	            System.out.println( contacts[i].name + ": " + contacts[i].number );

	            // all done searching, exit loop early
	            return; 
	         }
		}*/
		
		for (Iterator myIterator=contacts.iterator(); myIterator.hasNext(); ) 
		   {
		      // get the next element 
		      ContactsImprovedImproved c = (ContactsImprovedImproved)myIterator.next();
		      if (c.name.equalsIgnoreCase(targetName))
		      {
		         // print out name and number
		         System.out.println( c.name + ": " + c.number );   

		         // all done searching, exit loop early
		         return; 
		      }
		   } 
		
		System.out.println( targetName + ": NOT FOUND");
	}
}
