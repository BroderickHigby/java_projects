/** Chapter No. 10 - Exercise No.  2 
   File Name:          PetRecord.java
   Programmer:         Broderick Higby
   Date Last Modified: October 13, 2015

 *Algorithm:
 * - Establish array for holdng petRecords
 * - Initiate scanner and ask user what they want to do. 
 * - Read, Write, or Exit, entered and ran through an if-else statement
 * - Write: enter binary filename, enter pet info
 * - Write: decide if you want to keep entering info via while loop
 * - Read: Enter the filename of the document, then read the array info
 * - Read: Take extremes (largest, etc.), using for loop, print the extreme
 *			values from the binary file
 * - Exit:  System exit
 * - Close streams ;-)
 */
import java.io.*;
import java.util.*;

public class PetRecordTester extends PetRecord 
{

  public static void main(String[] args) throws IOException
  {
  	boolean doneSon = false;
  	String writeUserFile = "no file";
  	
	PetRecord[] readArray = new PetRecord[15];
	
	ObjectOutputStream outFile = null; 	
    
    
    while(doneSon != true)
    {		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Welcome to the Pet Records program");

	System.out.println("Would you like to \na: Write?\nb: Read?\nc: Exit?");
	String userMenuInput = keyboard.nextLine();
	
/****************************WRITE*********************************************/
	if(userMenuInput.equalsIgnoreCase("a"))
	{
 		if(writeUserFile.equals("no file"))
 		{
 		
		System.out.println("Enter the filename and extension of the document\n"
							+ "you would like to read from");

		writeUserFile = keyboard.nextLine();

		outFile = new ObjectOutputStream(new FileOutputStream (writeUserFile));		
		}	
	boolean petNumber = false;
		while(petNumber != true)
		{	
			//finding inputted filename
			System.out.println("Please enter pet record information");
		
			System.out.println("Please enter pet name");
			String tempName = keyboard.next();

		
			System.out.println("\nPlease enter pet age");	
			int tempAge = keyboard.nextInt();
			System.out.println("\nPlease enter pet weight");
			double tempWeight = keyboard.nextDouble();
			
			PetRecord temp = new PetRecord();
			
			temp.setName(tempName);
			temp.setAge(tempAge);
			temp.setWeight(tempWeight); 
			
			//Write the array elements to the binary file
			 outFile.writeObject(temp);   
			//Close the file
			System.out.println("Are you finished inputting pets names? yes or no?");
			String tempInput = keyboard.next();			
			if(tempInput.equalsIgnoreCase ("yes"))
			{
			petNumber = true;
			}
		}	
	}
/*****************************READ*********************************************/
	else if(userMenuInput.equalsIgnoreCase("b"))
	{

		boolean endOfFile =false;		
		String readPet;
		System.out.println("Enter the filename and extension of the document\n"
							+ "you would like to read from");
		
		String readFileName = keyboard.next();
		keyboard.nextLine();
		//finding inputted filename
		//while(endOfFile != true)
		//{
		
 			ObjectInputStream petFile = new ObjectInputStream(
 									  new FileInputStream(readFileName));
		int index = 0;
		try
		{
			while(true)
				{
					readArray[index] =(PetRecord) petFile.readObject();
					index++;
							
				}
		}
		catch (EOFException e)
		{
		System.out.println("End of file Bro");
		}
		catch (Exception e)
		{
		System.out.println("Exceptional Exceptions Bro");
		}
	
		for(int i = 0; i < readArray.length; i++)
		{
			if(readArray[i] != null)
			{
				System.out.println(readArray[i]);
			}
		}
		
	PetRecord largest = readArray[0];
 	PetRecord smallest = readArray[0];
 	PetRecord youngest = readArray[0];
 	PetRecord oldest = readArray[0];
 	String largestS = "";
 	String smallestS = "";
 	String youngestS = "";
 	String oldestS = "";
	 for(int j = 0; j <readArray.length; j++)
	 {
	 	 if(readArray[j] != null)
	 	 {
	 		if(largest.getWeight() < readArray[j].getWeight())
	 		{
	 			largest = readArray[j];
	 		}
	 		if(smallest.getWeight() > readArray[j].getWeight())
	 		{
	 			smallest = readArray[j];
	 		}
	 		if(youngest.getAge() < readArray[j].getAge())
	 		{
	 			youngest = readArray[j];
	 		} 	
	 		if(oldest.getAge() > readArray[j].getAge())
	 		{
	 			oldest = readArray[j];
	 	 	} 	
	 	}		 	  
	 }	
	 for(int k = 0; k < readArray.length; k++)
	 {
	 	 if(readArray[k] != null)
	 	 {
	 		if(largest.getWeight() == readArray[k].getWeight())
	 		{
	 			largestS += readArray[k].getName() + ", ";
	 		}
	 		if(smallest.getWeight() == readArray[k].getWeight())
	 		{
	 			smallestS += readArray[k].getName() + ", ";
	 		}
	 		if(youngest.getAge() == readArray[k].getAge())
	 		{
	 			youngestS += readArray[k].getName() + ", ";
	 		} 	
	 		if(oldest.getAge() == readArray[k].getAge())
	 		{
	 			oldestS += readArray[k].getName() + ", ";
	 		} 
	 	 }		 				
	 }
	 	largestS = largestS.substring(0, largestS.length() - 2) + " with the weight of " + largest.getWeight();
	 	smallestS = smallestS.substring(0, smallestS.length() - 2) + " with the weight of " + 	smallest.getWeight();	 	
	 	youngestS = youngestS.substring(0, youngestS.length() - 2) + " with the age of " + 	youngest.getAge();
	 	oldestS = oldestS.substring(0, oldestS.length() - 2) + " with the age of " +   	oldest.getAge();
	System.out.println("This is the largest: " + largestS);
	System.out.println("This is the smallest: " + smallestS);
	System.out.println("This is the youngest: " + youngestS);
	System.out.println("This is the oldest: " + oldestS);	
		petFile.close();	
	   	//}//end of while loop
   	}//end of else if statement

/**************************EXIT*********************************************/
   	else if(userMenuInput.equalsIgnoreCase("c"))
   	{
   		doneSon = true;
   		System.exit(0);
   	}	
   

   }//Close loop
      outFile.close();	
 }//End main method
}//End Class
