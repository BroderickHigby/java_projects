import java.io.*;
import java.util.*;

public class recordWriter extends PetRecordTester
{
	public static void petWriter() throws IOException
	{
		String[] names;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename and extension of the document\n"
							+ "you would like to read from");
		
		String writeFileName = keyboard.next();
		//finding inputted filename
		
		//Open a binary file for output
		DataOutputStream outFile = new DataOutputStream(
			                         new FileOutputStream(writeFileName));
		
		System.out.println("Writing pet information to a file.");
		
		//Write the array elements to the binary file
		for (int i = 0; i < names.length; i++)
		{
		
		    outFile.writeObject(names[i]);
		}    
		//Close the file
		outFile.close();
;
	}
}

	  public static void petWriter() throws IOException
	  {


      }