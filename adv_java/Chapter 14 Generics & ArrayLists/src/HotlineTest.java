/** Chapter No. 14 - Exercise No. Extra Credit 
   File Name:          HotlineBling.java
   Programmer:         Broderick Higby
   Date Last Modified: November 17, 2015

 *Algorithm:
  HotlineBling.java 
   	- Constructor created and first, last, phone, and major declared
	- Create get and set methods for the contact first name, last name, phone number, and e-mail address
	- Use toString() to return the contact info 
	- equals() container to return the major (ignoring case) 
	- The HotlineBling method will be used to search 
  HotlineTest.java
  	- Create array list to hold students names and info
  	- Ask user to search for maajor
  	- take user input, and create constructor that passes info to iterator and list iterator
  	- Iterator element goes to equals method in HotlineBling
  	- returns values if the person is a computer science major
  	- The list iterator does the same exact thing, but goes through the list from the index 4-0
Difference between an Interator and a ListIterator
  The iterator and ListIterator are similar, but differ in certain abilities such as, 
  the iterator uses both List and Set methods. The ListIterator only uses List. Iterator can only 
  go forward, whereas ListIterator goes both directions. NextIndex and PreviousIndex obtain indeces
  in ListIterator. The ListIterator has 9 methods for navigating array lists, whereas Iterator only 
  contains 3. Essentially, if you're trying to do something simple, then use Iterator, but if you need
  human interaction and have multiple requests, then ListIterator will work better. 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;
public class HotlineTest 
{
  public static void main(String args[]) 
  {
    ArrayList<HotlineBling> al = new ArrayList<HotlineBling>();

    Scanner keyboard = new Scanner(System.in);
    al.add(new HotlineBling("Broderick", "Higby", "1800HOTLINEBLING", "Computer Science"));
    al.add(new HotlineBling("Spencer", "Holloway", "7605551234", "Computer Science"));
    al.add(new HotlineBling("Drake", "Graham", "1800DRAKE", "Music and Film"));
    al.add(new HotlineBling("Childish", "Gambino", "18003334444", "Music"));
    al.add(new HotlineBling("Tommy", "Tutone", "8675309", "Theatre"));
    
    System.out.println("What major would you like to search for?");
    String userInput = keyboard.nextLine();
    HotlineBling majorInput = new HotlineBling(userInput);
 
    System.out.print("Contacts who are Computer Science Majors: \n");
    Iterator<HotlineBling> itr = al.iterator();
    while (itr.hasNext()) 
    {
	    	HotlineBling element = itr.next();
	    	if (element.equals(majorInput))
	    	{
	      System.out.print(element + " \n");    		
	    	}
    }
    System.out.println();
//List Iterator reads in the array list backwards 
    ListIterator<HotlineBling> litr = al.listIterator();
    while (litr.hasNext()) 
    {
	    	HotlineBling element = litr.next();
	      litr.set(element);
    }
    // Now, display the list backwards.
    System.out.print("These are the contacts from last to first in the array #BackToBack: \n");
    while (litr.hasPrevious()) 
    {
	    	HotlineBling element = litr.previous();
	    	if (element.equals(majorInput))
	    	{
	      System.out.print(element + " \n");    		
	    	}
    }
  }
}