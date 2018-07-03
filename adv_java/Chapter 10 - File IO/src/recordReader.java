import java.io.*;
import java.util.*;
public class recordReader extends PetRecordTester
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1084786972283412294L;

	public static void petReader() throws IOException
	{
		boolean endOfFile =false;		
		String readPet;
		
/*FOR ARRAY 
 * 		String[] readArray;
		int i;
*/
/* ASKING USER FOR INPUT
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the filename and extension of the document\n"
							+ "you would like to read from");
		
		String readFileName = keyboard.next();
		//finding inputted filename

 			DataInputStream petFile = new DataInputStream(
 									  new FileInputStream("readFileName"));

		
		//array takes in user pet record info
		//BufferedReader petFile = new BufferedReader(new InputStreamReader(in));
				//Object petFile = ObjectInputStream.readObject();
*/
/*FOR ARRAY		readArray[i] = petFileTest;
*/	
		
//HARDCODING FOR TESTING PURPOSES
 			DataInputStream petFile = new DataInputStream(
 									  new FileInputStream("/Users/brody/Documents/Workspace/PetRecord/src/Pet.dat"));

		
		
		try
		{
			while(!endOfFile)
			{
/*FOR ARRAY	
 * 			i = petFileTest.readUTF()
			//read input object stream and increment
				i++;
*/
			readPet = petFile.readUTF();
			System.out.println(readPet + " ");
			
			}
		}
		catch (EOFException e)
		{
			endOfFile = true;
		}
/*		finally
		{
		petFile.close();
		}
*/		
	}
}
