 /* Course CS112    Days & Time: September 3, 2015
 * Chapter Number: 8 Project Number: 2
 * Programmer: Broderick Higby 
 * Program Title: Movie
 * Program Description: Displays movie information for a local rental shop to demonstrate the
 *  					use of polymorphism and late binding.
 */
 import java.util.*;
 
public class Movie 
{	
	int IDNumber; //This its the ID number for the movie
	String movieType; //This is for the rating
	String movieName; 

	//Construction of the movie class
	public Movie(String type, String name, int number) 
	{
		movieType = type;
		movieName = name;
		IDNumber = number;
	}
	//The objects are given 0 or null for now to be passed in later
	public Movie() 
	{
		IDNumber = 0;
		movieType = null;
		movieName = null;
	}	
	//Accessor and modifier methods for the movie name, Movie ID, and the movie MPAA rating
	public void setMovieName(String name)
	{
		movieName = name; 
	}
	public void setMovieType(String type)
	{
		movieType = type;	
	}
	public void setIDNumber(int number)
	{
		IDNumber = number;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public String getMovieType()
	{
		return movieType;
	}
	public int getIDNumber()
	{
		return IDNumber;
	}
	//This uses the equals method to compare two movie ID numbers together
	public boolean equals(Movie otherMovie)
	{
		if(this.IDNumber==otherMovie.getIDNumber())
		{
			return true;
		}
		 else
		 {
		 	return false;
		 }	 
	}		
	//This calculates the fees based on the genre and the days late
	public double calcLateFees(int daysLate)
	{
		int lateFee = daysLate * 2;

		return lateFee;
	}
	//I used toString to hold all the movie classes information to be
	//passed into the rental class
	public String toString()
	{
	return "Movie Title: " + movieName + 
		   "\nMovie MPAA Rating: " + movieType + 
		   "\nMovieID Number: " + IDNumber;
	}
	
}