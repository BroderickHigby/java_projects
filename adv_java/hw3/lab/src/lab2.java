import java.util.ArrayList;
import java.util.Scanner;

public class lab2 
{
	static ArrayList<DirectoryEntry> theDirectory = new ArrayList<DirectoryEntry>();
	
	public static void main(String[] args)
	{

		theDirectory.add(new DirectoryEntry("Jane Smith", "555-549-1234"));
		
		System.out.println(theDirectory.get(0));
		addOrChangeEntry(theDirectory, "John Duong", "408-444-4444");
		System.out.println(theDirectory.get(0));


		
	}
	
	public static void addOrChangeEntry(ArrayList<DirectoryEntry> theDirectory, String aName, String newNumber)
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		input = keyboard.nextLine();
		
		DirectoryEntry temp = new DirectoryEntry(aName,newNumber);
		for(int i = 0;i < theDirectory.size();i++)
		{
			if(theDirectory.get(i).getName().equals(input))
			{
				theDirectory.set(i,temp);
				break;
			}
			else
			{
				theDirectory.add(i,temp);
				break;
			}
		}
	}
}