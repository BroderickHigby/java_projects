/*Program: DateThirdTry	
 *Programmer: Broderick Higby
 *Date: 3-23-2015
 *Description: Calculates what the day of the month is after the date is entered  .*/
public class DateThirdTry //Beginning of class
{
	private String month; //Declares month as a string
	private int day;
	private int year; //a four digit number.
	//Data types declared and public
	
	public void setDate(int newMonth, int newDay, int newYear)
	{
		month = monthString(newMonth);
		day = newDay;
		year = newYear;
	}
	
	//Declared public for other classes to use
	public String monthString(int monthNumber)
	{
		switch(monthNumber) 
		//switch statement returns month as a name
		{
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
		   return "March";
		case 4:
		   return "April";
		case 5:
		   return "May";
		case 6:
		   return "June";
		case 7:
		   return "July";
		case 8:
		   return "August";
		case 9:
		   return "September";
		case 10:
		   return "October";
		case 11:
		   return "November";
		case 12:
		   return "December";
		default:
			System.out.println("Fatal Error"); //If incorrect month value is entered
			System.exit(0);
			return "Error"; //to keep the compiler happy
		}
	}

	public void writeOutput() {
		System.out.println(month+" "+ day + "," + year);
		
	}


}