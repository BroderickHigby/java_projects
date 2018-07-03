/*Programmers: Broderick Higby
 * Program: ArrayOfScores
 * Date: 2 April 2015
 * Description: This is a program that reads in 5 scores and shows how much each score differs from the highest score 
 */
import java.util.Scanner;

public class ArrayOfScores 
{
	//Reads in 5 scores and shows how much each 
	//score differs from the highest score
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //Instatiates scanner variable
		double[] score = new double[5]; //Declares array and sets it to 5 indices 
		int index; //declared index variable
		double max; 
		
		System.out.println("Enter 5 scores:");
		score[0] = keyboard.nextDouble();
		max = score[0]; //Calls earlier declared array
		max = score [0];
		for (index = 1; index < 5; index++) //index=1 is important or else scores[] will start at 0 
		{
			score[index] = keyboard.nextDouble(); //Call score array to scan user input
			if (score[index] > max) //if score array is greater than max; sign important later for correct subtraction
				max = score[index]; //Max returns score
			//Max is the largest value of the values score[0],..., score[index]
		}
		
		System.out.println("The highest score is " + max); //prints max score
		System.out.println("The scores are:");
		//Indices from 0 to 5 adding one; outputting scores in order, then subtracting them from max
		//Pulls index from score,starts with 0 b/c it won't pull all 5 scores otherwise, and would just output 4 scores
		for (index = 0; index < 5; index++) 
			System.out.println(score[index] + " differs from max by "
											+ (max - score[index]));
		
	}
}
