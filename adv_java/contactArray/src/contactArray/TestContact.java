/** Chapter No. 14 - Exercise No. 2 
   File Name:          TestContact.java
   Programmer:         Broderick Higby
   Date Last Modified: November 5, 2015

 *Algorithm:
  Contact.java 
	- Create variables
	- Create an array list "of parameter type Contact"
	- Create get and set methods for the contacts first name, last name, phone number, and e-mail address
	- Use toString() to return the contact info 
	- equals() container to parse email 
	- ContactString method will be used for search 
  TestContact.java
   	- Create an array list that passes through the Contact class
   	- Create variables and Scanner class
   	- Allow user to choose what they'd like to do, from a menu that goes to a switch statement 
   	- Use contactArray.add to create contacts 
   	- Use contactArray.contains to search through contacts
   	- Use contactArray.remove to delete contacts from the arrraylist 
   	- Use a for, each loop to display the contents of the arraylist
   	- Repeat menu, and exit while loop upon user input selection 
 */
package contactArray;
import java.util.ArrayList;
/*	Algorithm:
	- Create a menu, take user input, whether they want to search and display contacts, add content, or delete contacts
	- Use a for-each loop to iterate through the array list
	- Display user-end results 
 */
import java.util.Scanner;
public class TestContact
{
	public static void main(String[] args)
	{
		ArrayList<Contact> contactArray = new ArrayList<Contact>();

		Scanner keyboard = new Scanner (System.in);
		char menuInput;
		String userInput;
		boolean done = false;
		do
		{
			System.out.println("\tWelcome to Brody's Awesome Contact List!");
			System.out.println("------------------------------------");
			System.out.println("Select what you would like to do");
			System.out.println("\n\tA: Add Contact" + "\n\tB: Search Contacts" + "\n\tC: Delete Contacts" 
									+ "\n\tD: Display all Contacts" + "\n\tX:Exit");
			System.out.println("------------------------------------");
			System.out.println("Please make a selection: ");//Prompts user to choose A,B,C,D, or E
			menuInput = keyboard.next().charAt(0);//Scans in entered value
			menuInput = Character.toUpperCase(menuInput);//Converts entered char into upper case
			
				switch (menuInput)
				{
					case 'A': //add contact
					while(!done)
					{
						Contact tempInput = new Contact();	
						System.out.println("Add Contact\nType in persons first name: ");
						tempInput.setFirst(keyboard.next());
						System.out.println("Enter last name: ");
						tempInput.setLast(keyboard.next());
						System.out.println("Enter phone number: ");
						tempInput.setPhone(keyboard.next());
						System.out.println("Enter e-mail: ");
						tempInput.setEmail(keyboard.next());
						contactArray.add(tempInput);
						System.out.println("Would you like to enter another contact?\nYes or No?");
						String answer = keyboard.next();
						if (!(answer.equalsIgnoreCase("yes")))
						{
							done = true;
						} 
					}	
					break;
					case 'B': //Search Contacts
					System.out.println("Enter search criteria: ");					
					userInput = keyboard.next();	
					boolean temp = false;						
					for(Contact search: contactArray)
						{
							if(search.getFirst().contains(userInput))
							{
								System.out.println(search.toString());
								temp = true;
							}
							if(search.getLast().contains(userInput))
							{
								System.out.println(search.toString());
								temp = true;
							}
							if(search.getPhone().contains(userInput))
							{
								System.out.println(search.toString());								
								temp = true;
							}
							if(search.getEmail().contains(userInput))
							{
								System.out.println(search.toString());
								temp = true;
							}
							if (temp = false)
							{
								System.out.println("There are no contacts to display");							
							}
						}
					break;
					case 'C': //Delete Contact
					System.out.println("What contact do you want to delete?");
					userInput = keyboard.next();
					Contact deleteContact = new Contact();
					for(Contact tempContact: contactArray)
					{		
						if(tempContact.getFirst().contains(userInput))
						{
							deleteContact = (tempContact);
					
							System.out.println("You are deleting: " + tempContact );						
						}
						else if(tempContact.getLast().contains(userInput))
						{
							deleteContact = (tempContact);
							System.out.println("You are deleting: " + tempContact );						
						}
						else if(tempContact.getPhone().contains(userInput))
						{
							deleteContact = (tempContact);
							System.out.println("You are deleting: " + tempContact );						
						}
						else if(tempContact.getEmail().contains(userInput))
						{
							deleteContact = (tempContact);
							System.out.println("You are deleting: " + tempContact );						
						}
					}
					if(contactArray.contains(deleteContact))
					{
						contactArray.remove(deleteContact);
					}
					break;
					case 'D': //Display all contacts
					System.out.println("These are all the contacts displayed");
					for (Contact display: contactArray)
					{
						System.out.println(display);
					}
					break;
					case 'X': //Exit the program
					{
						System.exit(0);
					}
					default:
						System.out.println("Oops, you did not enter a valid selection."
								+ "Please enter one of the five valid selections to continue.");
					}
			} while(menuInput != 'X');
		
		

	}
}
