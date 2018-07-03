/**
 Program Name: Delimiter Demo
 Author: Broderick Higby
 Date: 2/12/2015
 Description: Displays use of String names
 */
import java.util.Scanner;

	public class DelimiterDemo 
	{
		public static void main(String[] args)
		{
			Scanner keyboard1 = new Scanner(System.in);//Declares keyboard input
			Scanner keyboard2 = new Scanner(System.in);
			keyboard2.useDelimiter("##"); //The Delimiter makes ## call the variable for keyboard2
			//delimiter for keyboard1 is whitespace
			//delimiter for keyboard2 is ##.
			
			String word1, word2;	//Declares variables 
			System.out.println("Enter a line of text:"); 
			word1 = keyboard1.next();//Each reads one int from the keyboard
			word2 = keyboard1.next();
			System.out.println("For keyboard1 the two words read are:");
			System.out.println(word1);//Prints the word that was previously entered 
			System.out.println(word2);//The only words that aren't displayed are the ones in the ##delimiter##
			String junk = keyboard1.nextLine(); //To get rid of rest of line
			
			System.out.println("Reenter the same line of text:");//statement that appears after keyboard1 info is displayed
			word1 = keyboard2.next();
			word2 = keyboard2.next();
			System.out.println("For keyboard2 the two words read are:");
			System.out.println(word1);//Keyboard2 words are displayed
			System.out.println(word2);
		}//End of Main method
}//End of class

	
	