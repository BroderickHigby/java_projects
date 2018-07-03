 /* Course CS112    Days & Time: September 28, 2015
 * Chapter Number: 10 Project 1 
 * Programmer: Broderick Higby 
 * Program Title: Popular Names
 * Program Description: Write a program that reads both the girl and boy files
 *  into memory using arrays.
 *  Then, allow the user to input a name. The program should search through both
 *  arrays.If there is a match, then it should output the popularity ranking and
 *  the number of namings.The program should also indicate if there is no match.
 *  Algorithm: 
 * 1. Declare all the variables
 * 2. Read the name, popularity, and rank in an array from the text files 
 * 3. Parse the boy rank(# of namings), and take in boyinput & boy popularity
 * 4. Scan the users input to find the name, output no result if the name isn't
 *		found
 */

import java.util.*;   //includes Scanner
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PopularNames 
{
	
	public static void main(String[] args)
	{
		
/*********************Variables declared*****************/
		int counter = 0;
		int boyRanked = 0;
		int girlRanked = 0;
		
		int boyPopularityObj = 0;
		int girlPopularityObj = 0;
		
		String boyNamesObj = null;
		String girlNamesObj = null;
		boolean found = false;
		boolean continueProgram = true;
		String tryAgain;
/********************Declares and Reads in arrays***********/
		String[] boyNames = new String[1000];
		String[] girlNames = new String[1000];
		
		int[] boyRank = new int[1000];
		int[] girlRank = new int[1000];

		int[] boyPopularity = new int[1000];
		int[] girlPopularity = new int[1000];
		

/**********Scanners declared for the try-catch block********/
		Scanner boyInput = null;
		Scanner girlInput = null;
		

/**********This pulls the .txt files in a try-catch block*****/
		try {	
		boyInput = new Scanner(new FileInputStream("boynames.txt"));
		girlInput = new Scanner(new FileInputStream("girlnames.txt"));	
		
		} catch (FileNotFoundException e)
			{
			System.out.println("The file could not be found");
			System.out.println("or could not be opened");
			System.exit(0);
			}
			
/**The while loop takes the array at 0 and checks each line in the .txt files**/ 
		while(boyInput.hasNext()) //this is a boolean
		{
			boyNames[counter] = boyInput.next();
			boyRank[counter] = Integer.parseInt(boyInput.next());
			boyPopularity[counter] = counter; 
			counter++;
			
		}
		counter = 0;
		while(girlInput.hasNext())
		{
			girlNames[counter] = girlInput.next();
			girlRank[counter] = Integer.parseInt(girlInput.next());
			girlPopularity[counter] = counter; 
			counter++;
		}
		
	      boyInput.close();
	      girlInput.close();
	    
/************************Herein lies the do-while loop************************/  
	do
	{
/*****************This scans in the users input********************************/
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nWelcome to the Amazing Names Program"); 
		System.out.println("Enter a name to get started!"); 
		String usersInputtedName = keyboard.next();
		boyNamesObj = usersInputtedName; 
		girlNamesObj = usersInputtedName; 
		
		
/*******This takes the rank in the list of the name that the user inputted*****/
		
		for(int i=0; i < 1000;i++)
		{
			if(usersInputtedName.equalsIgnoreCase(boyNames[i]))
			{
				boyRanked = boyRank[i];
				boyPopularityObj = boyPopularity[i] +1;
				boyNamesObj = boyNames[i];
				found = true; 
				break; 
			}
		}
		
		if(found)
		{
		 	System.out.printf("The name %s is ranked %d in popularity among \n"
						+ "the top 1000 boys names with %d "
						+ "namings\n",boyNamesObj, boyPopularityObj, boyRanked);
		}
		else
		{
			System.out.printf("%s is not ranked among the top 1000 boys"
								+" names\n", boyNamesObj);
		}
			found = false;

		for(int i=0; i < 1000;i++)
		{
			if(usersInputtedName.equalsIgnoreCase(girlNames[i]))
			{
				girlRanked = girlRank[i];
				girlPopularityObj = girlPopularity[i] +1;
				girlNamesObj = girlNames[i];
				found = true; 
				break; 
			}
		}
		
		if(found)
		{
			System.out.printf("The name %s is ranked %d in popularity among \n" 
					+ "the top 1000 girls names with %d "
					+ "namings",girlNamesObj, girlPopularityObj, girlRanked);
		}
		else
		{
			System.out.printf("%s is not ranked among the top 1000 girls"
									+ "names\n", girlNamesObj);
		}

		System.out.println("\nDo you want to continue checking names?\n");
		System.out.println("yes or no\n");
		keyboard.nextLine();
		tryAgain = keyboard.nextLine(); 
				if(tryAgain.equalsIgnoreCase("no"))
				{
					continueProgram = false;
				}
	}while(continueProgram);	
	System.out.println("Glad you enjoyed the program");
	System.out.println("If you found this program helpful, consider donating to"
			+ " St. Jude \n- Children's Research Hospital");
	}

}
