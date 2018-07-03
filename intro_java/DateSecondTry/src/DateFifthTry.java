/*Program: DateFourthTry	
 *Programmer: Broderick Higby
 *Date: 3-22-2015
 *Description: Demonstrate the use of private methods  .*/

public class DateFifthTry //Start of class
{
	//local variables 
	private String month;
	private int day; 
	private int year;
	
	//Lets user set or reset Date  of this object
	public void setDate(int month, int day, int year)
    {
		//Uses dateOK to check and make sure there aren't any impossible dates
		if (dateOK(month, day, year))
        {
            this.month = monthString(month);
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }
	//Loops run based on years, months, and days from User arguments
    public void setMonth(int monthNumber)
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            month = monthString(monthNumber);
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }
  
    public void setYear(int year)
    {
        if ( (year < 1000) || (year > 9999) )
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public int getDay( )
    {
        return day;
    }

    public int getYear( )
    {
        return year;
    }
  //Returns month and integer value
    public int getMonth( )
    {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equals("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equalsIgnoreCase("November"))
            return 11;
        else if (month.equalsIgnoreCase("December"))
            return 12;
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0; //Needed to keep the compiler happy
        }
    }

    
    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }
	
	//converts date into string
	public String toString()
	{
	 return (month + " " + day + ", " + year);
	}
	//Compares DateForthTry equals otherDate and returns true or false
	public boolean equals(DateFifthTry otherDate){
		return ( (month.equals(otherDate.month))
				&& (day == otherDate.day) && (year == otherDate.year) );
	}
	

	//Compares two dates to see if current object precedes other object
	public boolean precedes(DateFifthTry otherDate)
	{
		return ((year < otherDate.year)
				|| (year == otherDate.year && getMonth() < otherDate.getMonth()) || (year == otherDate.year
				&& month.equals(otherDate.month) && day < otherDate.day));
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
} //End of class
