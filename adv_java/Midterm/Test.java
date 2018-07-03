import java.util.Scanner;
public class Test
{
	//Scanner keyboard = new Scanner(System.in);
	public static int transNumber = 10000;
	
	
	
	public static int getTransNumber()
	{
		transNumber++;
		return transNumber;
	}
	public static double setGallons(Scanner kb)
	{
		double numOfGallons = 0;
		System.out.println("Press x to add gallons");
		while(kb.nextLine().equalsIgnoreCase("x"))
		{
			numOfGallons += .5;
		}
		return numOfGallons;
	}
	
	
}