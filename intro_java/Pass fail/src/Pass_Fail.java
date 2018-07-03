/*Programmers: Broderick Higby
 * Program: Pass_Fail
 * Date: 2 April 2015
 * Description: This is a program that calculates 15 test scores and uses an array to 
 * calculate them and return number of students whom passed and failed  
 */
import java.util.Scanner; //Imports scanner class

public class Pass_Fail 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //instantiates keyboard for input
		double[] testScore = new double [15]; //establishes test_scores 
		int index; //Array variable created here
		int total_fail = 0; //Used for tests below 65
		
		System.out.println("The program computes 15 test scores and ");//Program description
		System.out.println("determines the number of students who failed the exam");
		
		//First loop gets the users input
		for (index = 0; index < 15; index++) //Test scores range from 0-15
		{				
		
			System.out.println("Test Score " + (index+1)); //Makes sure the Test Scores start at 1, Important as well 
			double tempScore= keyboard.nextDouble(); //Takes input from keyboard and creates tempScore variable
			testScore[index] = tempScore; //Calls array, critical for adding number failed 

			//If the tempScore is less than 0 and greater than 100, condition is false
			if(tempScore < 0 || tempScore > 100)
			{
				//Gives user error
				System.out.println("The exam score cannot be over 100 points");
				index--; //Deducts 1 from the array(aka repeats test score
			}	
		}
		
		for (index = 0; index < 15; index++) //allows array to go up to 15
		{
			if(testScore[index]>65) //If less than 65, it's failing 
			{
			      total_fail++; //Important! adds 1 for each failure				
			}
		}
		//Number who passed 
		System.out.println("The number of students who passed the exam" + total_fail);
		//Number who failed; using 15 test scores - those who failed 
		System.out.println("The number of students who failed the exam" + (15-total_fail));				
				
	} //End of method
}//End of class...And the program, thankfully, this was my Thursday and Friday