/* Course CS112	Date: October 1, 2015
 *Chapter Number: 10 project 1
 *Programmer: Broderick Higby
 *Program Title: Integers
 *Program Description: Write a program that reads a file of numbers of type int 
 *	and outputs all the numbers to
 *	another file, but without any duplicate numbers. Assume that the input file 
 *	is sorted from smallest first to largest last. After the program is run, 
 *  the new file will contain all the numbers in the original file, 
 *	but no number will appear more than once in the file. The numbers in the 
 *  output file should also be sorted from smallest to largest.
 *  Your program should obtain both file names from the user. Use a text file 
 *  that stores one number per line.
 * 
 *Algorithm:
 * 1.	Declare all the necessary variables
 * 2.	Use scanner to ask the user to input the file name 
 * 3.	Take the users text file name and assign it to a FileInputStream
 * 4.	Read in int numbers from a text file
 * 5.	Check them in an array 
 * 6.	Check for duplicate numbers in a while loop
 * 7.	Write the numbers to the new text file
 */
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class Integers 
{    
    public static void main(String[] args) 
    {
/****************Variables Declared***************/
		int i = 0;
		int tempNumber;
		Scanner inputStream = null;
		boolean keepRunning = true;
		String tryAgain;
	  do
	  {	
/****************Taking users' file name input**************/
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the numbers program");
		System.out.println("Enter the name of the text file you want to get started: ");
		String fileName = keyboard.next();

		try
		{
			inputStream = new Scanner(new FileInputStream(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File was not found or could not be opened");
			System.exit(0);
		}
			

		int[] nums = new int[15];

/**************Loop takes the integers and checks for duplicates*******/
		//Error cheecks, if not 0 & not less than the previous number, 
		//then save it to the array
		while(inputStream.hasNextInt())
		{

			//user input is stored in tempNumber object
			tempNumber = inputStream.nextInt();			
/*			if(i!=0 && i != nums[i+1]) 
			{
				tempNumber = nums[i]; 			
			}
		i++;		
*/
		}
		PrintWriter outputStream = null;
		System.out.println("The duplicate numbers are now removed");
		System.out.println("Please enter the output file name that you would like"
								+ " to write to:");
		String outputFileName = keyboard.next();
				
		try
		{
			outputStream = new PrintWriter(new FileOutputStream(outputFileName));		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("The file was not found or could not be opened");
			System.exit(0);
		}
		
			outputStream.close();
			
					
		
		
		
		
		for(int k = 0; k < nums.length; k++)
		{
			if(nums[k]!=nums [k+1])
			{
				outputStream.println(nums[k]);
			}
		}		
		
/************Output the numbers to the file***************************/

/************Ask user if they want to keep running the program****************/
			
			
			System.out.println("Would you like to start again?\nEnter Yes or No");
			keyboard.nextLine();
			tryAgain = keyboard.nextLine();
			if(tryAgain.equalsIgnoreCase("no"))
			{
				keepRunning = false;
			}
	  }while(keepRunning);
	  System.out.println("Thank you for using the integers program");
	  System.out.println("If you enjoyed it, consider rating it on the App Store");	
    }
}
