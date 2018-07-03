/*
 * Programmer: Broderick Higby
 * Date: March 29, 2015
 * Project Name: ChooseManagerC
 * Description: Demonstrate the use of an if else loop within a JOptionPane class, calling a constructor class, declaring constants, and local scope variables
 */

public class Event 
{
	//private variables which can only be used in this class are defined 
	private static char eventType ;
	private static double eventMinRate;

	public Event(char event, double Rate)
	{
			//Local variables defined within the method 
		
			eventType = event;		
			eventMinRate = Rate;
		}
			public char geteventType()
			{
			//The entered event type will then be returned 
			return eventType;
			}
				//The entered eventType is called
			public double geteventMinRate() //Not , but used in part B
			{
					//The entered event min rate will then be returned
					return eventMinRate;
			}
		
}