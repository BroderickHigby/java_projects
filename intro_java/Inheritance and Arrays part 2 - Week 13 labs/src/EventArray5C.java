/*Program: EventArray5C.java
*Programmer: Broderick Higby
*Date: 4/19/2015
*Description: This program will copy elements from one array into a separate array using a for loop and calling
*methods from a base class 
**/

public class EventArray5C
{

	public static void main(String[] args)//Beginning of Main method
	{

		//Array instantiation
		String [] Event = new String [5];
		//Creates new someEvents array
		String [] someEvents = new String [5];
		
		someEvents = Event;

		//Sets
		EventBaseClass test;

		//Calls base class
		int x;//Variable declaration

			for (int i=0; i < Event.length; i++)//Here, the elements of array Event is copied to someEvents
			{
				someEvents[i] = Event[i];
			}

			for (int i = 0; i < someEvents.length; i++)
			{
				test = new EventBaseClass ();//Object of base class instantiated
				//Prints the output; X's and 0.0's 
				System.out.println("someEvents Array Elements: " + test.getEventType() + " " + test.getEventMinRate());
			}
	}//End of Main method
}//End of Class 