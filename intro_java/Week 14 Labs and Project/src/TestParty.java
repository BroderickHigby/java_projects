/*
* Program: TestParty.java
*Programmer: Broderick Higby
*Date: 4/21/2015
*Description: 
*/

public class TestParty { //Start of class

	public static void main(String[] args) //Start of main method
	{
	Party myBday = new Party(); //Classes declared 
	Party yourBday = new Party(15, "4:00 am");
	
	yourBday.setpartyDate("July 4, 2015"); //Set partyDate methods for both parties	
	myBday.setpartyDate("August 12, 2015");
	
	//Gets the various elements (date, time, guests) for my Bday
	System.out.printf("The date of my party is: " + myBday.getpartyDate());  
	System.out.printf("\n My party kicks off at: " + myBday.getTime() + "!!!\n");
	System.out.printf("\n There will be " + myBday.getGuests() + " \n partiers helping me celebrate my birthday \n");
	System.out.println("\n Can't wait to see you guys there!!!\n");

	//Gets the various elements (date, time, guests) for your Bday
	System.out.printf("\n The date of my party is: " + yourBday.getpartyDate());
	System.out.printf("\n Your party kicks off at: " + yourBday.getTime() + "!!!\n");
	System.out.printf("\n There will be " + yourBday.getGuests() + " \n partiers helping to celebrate your birthday \n");
	System.out.println("\n Turn down for what!!!");
	
	} //End of method 
} //End of Class
