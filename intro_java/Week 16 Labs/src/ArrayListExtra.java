/*
 *Programmer: Broderick Higby
 *Program: ArrayList
 *Date: 5 May 2015
 *Description: Demonstrates the use of Array list instead of 
 * arrays to display the number of occurrences
****************************/

//Import required packages
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListExtra //Start of class
{
	public static int countOccurrences(char [] array, char ch) //Start of countOccurences occurrences method 
	{
		int chCount=0;
		
		//for loop runs to count occurrances 
		for (int loopCount=0; loopCount<array.length; loopCount++)   
		{
			if( array[loopCount] == ch ) //if what's inside the loop count is equivalent to ch, then continue
			{
				chCount=chCount+1; //counts each occurrence of b and then adds 1
			}
		}

		return chCount; //returns the chCount

	}

	public static void main(String [] args) //Start of main method
	{
		char[] myChars = {'c', 'b', 'b', 'a'};
		//initializes array list and wrapper class, ArrayList instantiates a new instance of Character, the primitive data type
		ArrayList<Character> arrayList = new ArrayList<Character>();
	
		char myCh = 'b'; //Looks for char b 
		int count = countOccurrences(myChars,myCh); //pulls b out of myChars array 
		System.out.println("The number of occurrences is: " +count); //pulls from count and countOccurrences
	} //End of main method
} //End of class