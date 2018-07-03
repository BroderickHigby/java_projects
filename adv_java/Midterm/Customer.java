import java.util.Scanner;
import java.io.*;
public class Customer implements Serializable
{
	Scanner keyboard = new Scanner(System.in);
	int transNumber;
	final double COST_PER_GALLON = 3.50;
	double numOfGallons;
	//all variables
	
	public void setTransNumber(int myNum)
	{
		transNumber = myNum;
	}
	public int getTransNumber()
	{
		return transNumber;
	}
	public void setNumOfGallons(double myNum)
	{
		numOfGallons = myNum;
		
	}
	public double getGallons()
	{
		return numOfGallons;
	}
	
	
}