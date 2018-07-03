/*Program: EventBaseClass.java
*Programmer: Broderick Higby
*Date: 4/18/2015
*Description: This program will be the base class for EventArray5c and returns the methods to create X's and 0.0's*/

public class EventBaseClass//Beginning of Class
{
	//Private Variables which can only be used in this class are defined
	private double eventMinRate;

	public void Event(char eventType, double eventMinRate)
	{
		//Local variables defined within this method
		eventType = 'x';
		eventMinRate = 0.0;
	}

	public char getEventType()
	{

		char eventType = 'x';

		//The entered even type will then be returned
		return eventType;
	}

	public double getEventMinRate()
	{
		//The entered event min rate will then be returned
		return eventMinRate;
	}
}//End of Class