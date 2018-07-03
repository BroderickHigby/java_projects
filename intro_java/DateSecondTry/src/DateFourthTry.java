/*Program: DateFourthTry	
 *Programmer: Broderick Higby
 *Date: 3-22-2015
 *Description: Compares dates using equals and toString.*/

public class DateFourthTry 
{
	//local variables 
	private String month;
	private int monthInt;
	private int day; 
	private int year;
	//converts date into string
	public String toString()
	{
	 return (month + " " + day + ", " + year);
	}
	//Compares DateForthTry equals otherDate and returns true or false
	public boolean equals(DateFourthTry otherDate){
		return ( (month.equals(otherDate.month))
				&& (day == otherDate.day) && (year == otherDate.year) );
	}
	
	//Lets user set or reset Date  of this object
	public void setDate(int newMonth, int newDay, int newYear)
	{
		month = monthString(newMonth);
		monthInt = newMonth;
		day = newDay;
		year = newYear;
	}
	//Compares two dates to see if current object precedes other object
	public boolean precedes(DateFourthTry otherDate)
	{
		return ((year < otherDate.year)
				|| (year == otherDate.year && getMonth() < otherDate.getMonth()) || (year == otherDate.year
				&& month.equals(otherDate.month) && day < otherDate.day));
	}
	//Returns month and integer value
	public int getMonth() {
		return monthInt;
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
