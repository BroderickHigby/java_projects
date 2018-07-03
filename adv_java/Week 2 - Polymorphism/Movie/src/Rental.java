public class Rental 
{
	//This takes the movie class and changes the name to customerRental
	Movie customerRental; 
	
	int customerID = 0; 
	int daysLate;
	
	//Passed through the objects from the Movie class 
	public Rental(int daysLate, int customerID, int IDNumber, String movieType, String movieName, char genre)
	{
		//Used the 'this' keyword to pass objects from Movie->Rental class->Rental method
		this.daysLate = daysLate;
		this.customerID = customerID;
		
		if((genre== 'a')||(genre== 'A')) 
		{	//pulls the action class and then accesses Movie input
			customerRental = new Action();
			customerRental.setMovieType(movieType);
			customerRental.setMovieName(movieName);
			customerRental.setIDNumber(IDNumber);
		}
		else if ((genre== 'd')||(genre== 'D')) //
		{
			customerRental = new Drama();
			customerRental.setMovieType(movieType);
			customerRental.setMovieName(movieName);
			customerRental.setIDNumber(IDNumber);
		}
		
		else if ((genre== 'c')||(genre== 'C'))
		{
			customerRental = new Comedy();
			customerRental.setMovieType(movieType);
			customerRental.setMovieName(movieName);
			customerRental.setIDNumber(IDNumber);
		}
	}
	public void writeOutput() //Write output holds all of the information to pass to the test class
	{
		System.out.println("The customer's ID number is: " + customerID);
		System.out.println("\n"+ customerRental);
		System.out.println("\nThe movie is " + daysLate + " days late");
		System.out.println("The late fee for the customer is $" + customerRental.calcLateFees(daysLate));
		System.out.println("\n\nThank you for renting the movie from Brody's Movies, Support local businesses!");
	}
		
}