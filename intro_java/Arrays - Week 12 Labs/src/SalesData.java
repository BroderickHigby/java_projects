/*Program: InClass Lab #3 Salesdata.java
 *Programmers: Spencer Holloway, Broderick Higby, Jesse Leon
 *Date: 4-7-15
 *Description: This program will prompt the user to enter values for each month of the year. From there, the user will be
 *presented with a menu of choices, in which the user will choose from to preform a calculation, utilizing arrays and loops.*/
 
import java.util.Scanner;//Allows one to utilize the Scanner Package

public class SalesData//Beginning of Class
{
	
	public static void main(String[] args)//Beginning of Main method
	{
		
		System.out.println("Please enter Sales for 12 Months.");
		Scanner keyboard = new Scanner (System.in);//Scanner Object Instantiated
		
		//Here, variables are defined along with an array of type Int
		int Sales;
		char choice;
		int[] total = new int[12];
		double max = total[0];

		for (int i= 0 ; i < total.length; i++)//Beginning of For Loop that will allow the user to enter in 12 values
		{
			
			System.out.println("Please enter the data for month " + (i+1) + ":");
			total[i] = keyboard.nextInt();//Scanning user input
			
			if (total[i] > max)//If an entered value is greater than max, max will be assigned that value
				max = total[i];
				
		}//End of loop
		
		//This part finds the month that had the highest score
		int highestMonth = 0;  //Highest score variable declared and set to zero
		//For loop starts @ int 1; as long as the index is less than total length, then increment 1 with each loop succession 
		for (int i = 0; i < total.length; i++) 
		{
		   int newNumber = total[i]; //creates newNumber local variable
		   //highestMonth is the array argument that gets sent to output; if the total is less than newNumber highest month 
		   //will equal the total 
		   if ((newNumber > total[highestMonth]))
		   {
		   highestMonth = i;
		   }
		}
		System.out.println("The highest month sales this year were: $" + max);
		System.out.println("This occured in month number: " +(highestMonth+1));
		//Beginning of do while block
		do
		{
		
			//Here, a menu of choices will be printed to the screen
			System.out.println("\n\tSales Menu");
			System.out.println("\nA. Calculate 1st Quarter Sales");
			System.out.println("\nB. Calculate 2nd Quarter Sales");
			System.out.println("\nC. Calculate 3rd Quarter Sales");
			System.out.println("\nD. Calculate 4th Quarter Sales");
			System.out.println("\nE. Calculate Annual Sales");	
			System.out.println("\nF. End the Program");
		
			System.out.println("\nPlease choose one of the 6 menu choices");
			choice = keyboard.next().charAt(0);//Scanning user input
		
			switch (choice)
			{
				case 'A'://If the user chooses A, the first three entered values will be added and their total will be displayed
				{
					Sales = total[0] + total[1] + total[2];
					System.out.println("The Company's 1st Quarter Sales are: " + Sales);
					break;
				}		
		
				case 'a'://If the user chooses a, the first three entered values will be added and their total will be displayed
				{
					Sales = total[0] + total[1] + total[2];
					System.out.println("The Company's 1st Quarter Sales are: " + Sales);
					break;
				}	
				
				case 'B'://If the user chooses B, the next three entered values will be added and their total will be displayed
				{
					Sales = total[3] + total[4] + total[5];
					System.out.println("The Company's 2nd Quarter Sales are: " + Sales);
					break;
				}		
		
				case 'b'://If the user chooses b, the next three entered values will be added and their total will be displayed
				{
					Sales = total[3] + total[4] + total[5];
					System.out.println("The Company's 2nd Quarter Sales are: " + Sales);
					break;
				}	
				
				case 'C'://If the user chooses C, the next three entered values will be added and their total will be displayed
				{
					Sales = total[6] + total[7] + total[8];
					System.out.println("The Company's 3rd Quarter Sales are: " + Sales);
					break;	
				}	
		
				case 'c'://If the user chooses c, the next three entered values will be added and their total will be displayed
				{
					Sales = total[6] + total[7] + total[8];
					System.out.println("The Company's 3rd Quarter Sales are: " + Sales);
					break;	
				}	
				
				case 'D'://If the user chooses D, the next three entered values will be added and their total will be displayed
				{
					Sales = total[9] + total[10] + total[11];
					System.out.println("The Company's 3rd Quarter Sales are: " + Sales);
					break;
				}
		
				case 'd'://If the user chooses d, the next three entered values will be added and their total will be displayed
				{
					Sales = total[9] + total[10] + total[11];
					System.out.println("The Company's 3rd Quarter Sales are: " + Sales);
					break;
				}
				
				case 'E'://If the user chooses E, all entered values will be added and their total will be displayed
				{		
					Sales = total[0] + total[1] + total[2] + total[3] + total[4] + total[5] + 
					total[6] + total[7] + total[8] + total[9] + total[10] + total[11];
					System.out.println("The Company's Annual Sales are: " + Sales);
					break;
				}
		
				case 'e'://If the user chooses e, all entered values will be added and their total will be displayed
				{		
					Sales = total[0] + total[1] + total[2] + total[3] + total[4] + total[5] + 
					total[6] + total[7] + total[8] + total[9] + total[10] + total[11];
					System.out.println("The Company's Annual Sales are: " + Sales);
					break;
				}
		
				default:
					//If the user enters anything other than the defined menu choices, this error message will be displayed 
					System.out.println("Oops, you entered an invalid choice. Please end the program and try again.");
					break;
			}
		
		}while (choice != 'F');//The do while loop will continue to execute as long as F is not entered
	
		System.out.println("Thank you for using this program!");

	}//End of Main method

}//End of Class