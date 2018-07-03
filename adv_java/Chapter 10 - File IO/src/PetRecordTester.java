/* 1.	Write a program that allows you to write and read records of type PetRecord to a file.
 *  		The program asks the user to choose between reading and writing from a file. 
 *  		In either case, the program next asks for the file name. If the user is asked to write to a file,
 *  		they can enter as many records as desired. If the user is asked to read from a file, 
 *      they are shown all of the records in the file. Be sure that the records do not scroll by so quickly 
 *      that the user cannot read them. Redefine the class PetRecord so that it is serializable.
 * 2.	Write a program that reads records of type PetRecord from the file created in step 1 and 
 *		outputs the following information to the screen: the name and weight of the largest pet, 
 *		the name and weight of the smallest pet, the name and age of the youngest pet, and the name and age of the oldest pet.
 *		Could there be pets with the same name, weight and age?
 *Algorithm:
 * 
 * - Add Scanner class to take users input
 * - display a menu and ask the user whether they want to read or write to a file 
 * - use if-else loop to send user input to have user decide whether to read or write
 * - Create an array and have that take the users pet name input
 * - Create InputStream in a try-catch, and take the users input for the filename
 * 
 * - In a partially filled array, take the users' pet record info
 * - The fi
 */
import java.io.*;
import java.util.*;
public class PetRecordTester extends PetRecord
{

	public static void main(String[] args) throws IOException
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Welcome to the Pet Records program");
	System.out.println("Would you like to read or write?\nEnter 'r' or 'w'");
	String readWrite = keyboard.nextLine();
	//pull from recordReader and RecordWriter, where they'll then input their filename 
	//if(readWrite == "r" || readWrite == "R")
	if(readWrite.equals("r") || readWrite.equals("R"))

	{
		System.out.println("Brody rules");
		
		recordReader.petReader();
		return;
	}
	else
	{
		System.out.println("Brody rocks");
		//recordWriter.writer();
	}

	}
}
