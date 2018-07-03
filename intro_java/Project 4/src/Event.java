/* Programmer: Broderick Higby
 * Date: March 6, 2015
 * Project Name: Project4
 * Description: Demonstrate the development of a constructor class
 */
public class Event //Start of class
{
	private char eventType; //This is a private container of eventType
	private double eventMinRate; //Same as above
	
	public Event (char event, double rate){ //This is a constructor method
		//Assigning user arguments into local containers
		eventType = event;  
		eventMinRate = rate;
	}
	//Retrieves local containers 
	public char getEventType() {
		return eventType;
	}
	
	public double getEventMinRate() {
		return eventMinRate;
		
	}
}

