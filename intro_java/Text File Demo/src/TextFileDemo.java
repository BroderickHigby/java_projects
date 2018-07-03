/**
 Program Name: Delimiter Demo
 Author: Broderick Higby
 Date: 2/12/2015
 Description: Displays use of String names
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo 
{
	public static void main(String[]args)
	{
		Scanner fileIn = null; //Initializes fileIn to empty
		try			//Just try, come on it's not that hard
		{ //It's called a try block, it tries to execute the program
			//Attempt to open the file
			fileIn=new Scanner(
					new FileInputStream("player.txt"));
		}
		catch (FileNotFoundException e)//Sooo the Try block throws the exception to the catch block, like a pitcher 
		//The catch block now begins execution 
		{
			//This block executed if the file is not found
			//and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
		//If the program gets here then the file executed successfully 
		int highscore;
		String name;
		
		System.out.println("Text left to read" +
				fileIn.hasNextLine());
			highscore = fileIn.nextInt();
			fileIn.nextLine();
			
			System.out.println("Name: " +name);
			System.out.println("High score: " +highscore); //
			System.out.println("Text left to read " +
					fileIn.hasNextLine());
			fileIn.close();
	} //End of main method
} //End of class...School's out!
