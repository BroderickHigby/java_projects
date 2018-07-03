import java.io.*;
import java.util.*;
public class FileEncryptionFilter
{
	public static void main(String []args)
	{
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		String line;
		//String secretLine;
		char encrytedChar;
		String[] tempLine = new String[2];//create partially filled array//
		char[] tempChar = new char[1000];
		
		try
		{
			inputStream = new Scanner(new FileInputStream("SecretFile.txt"));
			outputStream = new PrintWriter( new FileOutputStream("EncryptedFile.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		//Lines put into array//
		for(int i = 0; i < tempLine.length; i++)
		{
			line = inputStream.nextLine();
			tempLine[i] = line;
		}
		//note: parse encyptedchar into an int
		tempChar = 5 + enryptedChar 
		
		
		
		
		//copying lines into encrypted file//
		for(int i = 0; i < tempLine.length; i++)
		{
			outputStream.println(tempLine[i]);
		}
		
		outputStream.close();
		
		 
		
		
		
		
		
	}
}