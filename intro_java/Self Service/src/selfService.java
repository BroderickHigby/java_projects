/**
 Program Name: String Processing Demo
 Author: Broderick Higby
 Date: 2/12/2015
 Description: Displays use of String names
 */
import java.util.Scanner;

public class selfService 
{
	public static void main(String[]args) //Calls main method
	{
	Scanner keyboard = new Scanner(System.in); //Scanner class calls keyboard input
	
	System.out.println("Enter number of items purchased");
	System.out.println("Followed by the cost of one item");
	System.out.println("Do not use a dollar sign.");
	
	int count = keyboard.nextInt(); // declares variable and initiates count
	double price = keyboard.nextDouble(); //Scans the next input from the keyboard as a double
	double total = count*price; //counts and multiplies the price
	
	System.out.printf("%d items at $%.2f each %n", count, price); //calls count variable and price and inserts them in message
	System.out.printf("Total amount due $%2f. %n", total);
	
	System.out.println("Please take your merchandise");
	System.out.printf("Total amount due $%2f.%n",total);
	
	System.out.printf("Place $%.2f in an envelope %n", total);
	System.out.println("and slide it under the office door.");//No idea why you would trust someone to slide it under the door...
	System.out.println("Thank you for using the self-service line.");
	}//end main method
}//end class