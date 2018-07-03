/*
* Program: Party.java
*Programmer: Broderick Higby
*Date: 4/21/2015
*Description: Demonstrates the use of setting default values to get called. 
*Uses accessor and mutator methods and the ".this" variable for the TestParty class to call and 
*/

public class Party //Start of class
{
	private int Guests; //Declared objects 
	private String partyDate;
	private String Time;
	
	public  Party() //Party method sets the default value for guests and time 
	{
		Guests = 50;
		Time = "6:00 PM";
	}

	public Party(int Guests, String Time) //Overloads the party method
	{
		//this parameter is the keyword for the calling objects
		this.Guests = Guests; 
		this.Time = Time;

	}
	
	public void setGuests(int Guests) //Sets the guests and calls the objects in parameters 
	{
		this.Guests = Guests;
	}
	
	public int getGuests() //passes the variable through the method and returns the Guests output 
	{
		//returns the # of guests 50
		return Guests;
	}
	
	public void setTime(String Time) //Sets the Time and calls the objects in parameters 
	{
		this.Time = Time;
	}
		
	public String getTime() //passes the variable through the method and returns the Time output 
	{
		//returns the time 6:00PM
		return Time;
	}
	
	public void setpartyDate(String partyDate) //Sets the partyDate and calls the objects in parameters 
	{
		this.partyDate = partyDate;
	}
	public String getpartyDate() //passes the variable through the method and returns the partyDate output 
	{
		return partyDate; 
	}

} //End of class
