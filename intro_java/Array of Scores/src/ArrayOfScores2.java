/*------------------------------------------------
  *Programmer: Broderick Higby
 *Program: ArrayOfScores.java
 *Date: 3/31/15
 *Description: 
 *------------------------------------------------*/
 
 import java.util.Scanner; //Imports scanner objects
 
 public class ArrayOfScores2
 {
 	//Reads in 5 scores and shows how much each score
 	//differs from the highest score
 	public static void main(String[] args)
 	{
 		Scanner keyboard = new Scanner(System.in); //Scanner object instantiated
 		//Score is declared as an array using double the array has 5 indices from 0-5
 		double[] score = new double[5]; 
 		int index; //index declared as an int variable 
 		double max; //max declared as double 
 		
 		//Same as before, score.length puts the value 5 into the string, b/c the length of the array is 5
 		System.out.println("Enter " + score.length + " scores:");
 		
 		score[0] = keyboard.nextDouble(); //The score array scans input and indexes it
 		max = score[0]; //Array score is value 0, which means that the max starts out at 0
 		for (index = 1; index < score.length; index++) //index starts at 1 for output and increases until 5
 		{
 			score[index] = keyboard.nextDouble(); //the user input is being captured in the array by the index variable 
 			if (score[index] > max) //
 				max = score[index];
 				//max is the largest values score[0]
 			
 		}
 		
 		System.out.println("The highest score " + max); //Outputs message and determined max score
 		System.out.println("The scores are:"); //Same here
 		for (index = 0; index < score.length; index ++) //Outputs indices up to score.length(5); continually goes up 1 index 
 			System.out.println(score[index] + " differs from max by "//returns scores subtracted from the max
 											+ (max - score[index]));
 		} //end of main method
 } //end of class