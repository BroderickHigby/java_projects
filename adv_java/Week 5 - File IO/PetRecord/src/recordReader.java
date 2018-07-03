import java.io.*;
import java.util.*;
public class recordReader extends PetRecordTester
{

	private static final long serialVersionUID = 1084786972283412294L;

	public static void petReader() throws IOException
	{
		boolean endOfFile =false;		
		String readPet;
		

		//String[] nameArray;
		int arrayCount;


		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename and extension of the document\n"
							+ "you would like to read from");
		
		String readFileName = keyboard.next();
		//finding inputted filename

 			DataInputStream petFile = new DataInputStream(
 									  new FileInputStream(readFileName));

		int nameArray = new int['arrayCount'];
	
		for(int index; index < arrayCount; index++ )
		{
			System.out.println("");
		}
		try
		{
			while(!endOfFile)
			{
			readPet = petFile.readUTF();
			System.out.println(readPet + " ");
			}
			petFile.close();
		}
		catch (EOFException e)
		{
			endOfFile = true;
		}


			petFile.close();
	}
}
