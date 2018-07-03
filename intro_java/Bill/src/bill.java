/*Program: Bill.java	
 *Programmer: Broderick Higby
 *Date: 3-22-2015
 *Description: */
import java.util.Scanner;

public class bill 
{
	public static final double RATE = 150.00; //Dollars per quarter hour 
	
	//passive public local variables
	public int hours;
	public int minutes;
	public double fee;
	
	//Method that scans user input
	public void inputTimeWorked ()
	{
		System.out.println("Enter number of full hours worked");
		System.out.println("followed by number of minutes");
		Scanner keyboard = new Scanner(System.in);
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt();
	}
	//Local variable that takes user input and calculates values 
	private double computeFee(int hoursWorked, int minutesWorked)
	{
		minutesWorked = hoursWorked*60 + minutesWorked;
		int quarterHours = minutesWorked/15;
			//Any remaining fraction of a quarter hour is not
			//charged for.
		return quarterHours*RATE;
	} 
	//Calculates fee
	public void updateFee()
	{
		fee = computeFee(hours, minutes);
	}
	//Outputs the calculated fee 
	public void outputBill()
	{
		System.out.println("Time worked: *");
		System.out.println(hours + " hours and" + minutes + " minutes");
		System.out.println("Rate: $" + RATE + " per quarter hour.");
		System.out.println("Amount due: $" + fee);
	}
}
