//package edu.miracosta.Labs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Entry 
{
	static ArrayList<DirectoryEntry> theDirectory = new ArrayList<DirectoryEntry>();
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		theDirectory.add(new DirectoryEntry("Jane Smith", "555-549-1234"));
		theDirectory.add(new DirectoryEntry("Saul Goodman", "760-440-8854"));
		theDirectory.add(new DirectoryEntry("Christian Jones", "525-339-0934"));
		
		String input = " ";
		String input2 = " ";
		
		System.out.println("~~~~~~~~~~~~Menu~~~~~~~~~~~~");
		System.out.println("1. Add or Change an Entry");
		System.out.println("2. Remove an Entry");
		System.out.println("3. End the Program");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Please Enter choice");
		int dec = keyboard.nextInt();
		
		switch(dec)
		{
			case 1:
			{
				addOrChangeEntry( input, input2);

				break;
			}
			
			case 2:
			{
				removeEntry(input, input2);
				break;
			}
			
			case 3:
			{
				System.exit(0);
			}
			
			default:
			{
				System.out.println("Invalid Entry");
			}
		}
		
		for(Object DirectoryEntry : theDirectory)
		{
			System.out.println(DirectoryEntry.toString());
		}
	}
	
	public static String addOrChangeEntry( String input, String input2)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String test = " ";
		int choice = 0;
		
		do
		{
			System.out.println("~~~~~~~~~~~~~Menu~~~~~~~~~~~~~");
			System.out.println("1. Add a Phone Book Entry");
			System.out.println("2. Change a Phone Book Entry");
			System.out.println("3. End the Program");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.println("Please make a choice");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Please enter name Information");
					input = keyboard.nextLine();
					
					System.out.println("Please enter number information");
					input2 = keyboard.nextLine();
					
					theDirectory.add(new DirectoryEntry(input, input2));
					
					
					break;
				}
				
				case 2:
				{
					System.out.println("Please enter Information pertaining to the Entry you wish to change");
					String change = keyboard.nextLine();
					boolean found = false;
					
					@SuppressWarnings("rawtypes")
					Iterator X = theDirectory.iterator();
					DirectoryEntry tester = new DirectoryEntry();
					
					while(X.hasNext())
					{
						DirectoryEntry temp = (DirectoryEntry) X.next();
						
						if(temp.getName().contains(change))
						{
							tester = temp;
							found = true;
						}
						
						if(temp.getNumber().contains(change))
						{
							tester = temp;
							found = true;
						}
					}
					
					if(found)
					{
						System.out.println("Contact will be modified");
						System.out.println("Modifications");
						System.out.println("1. Change Name");
						System.out.println("2. Change Number");
						
						int mod = keyboard.nextInt();
						keyboard.nextLine();
						
						if(mod == 1)
						{
							System.out.println("Please enter new Name");
							String name = keyboard.nextLine();
							
							tester.setName(name);
						}
						else if(mod == 2)
						{
							System.out.println("Please enter new Number");
							String num = keyboard.nextLine();
							
							tester.setNumber(num);
						}
						
						
					}
					
					break;
				}
			}
		}while(choice != 3);
		
		return test;
	}
	
	public static String removeEntry(String input, String input2)
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String test2 = " ";
		
		System.out.println("Please enter Information pertaining to the Entry you wish to Delete");
		String delete = keyboard.nextLine();
		
		boolean found = false;
		
		@SuppressWarnings("rawtypes")
		Iterator X = theDirectory.iterator();
		DirectoryEntry tester = new DirectoryEntry();
		
		while(X.hasNext())
		{
			DirectoryEntry temp = (DirectoryEntry) X.next();
			
			if(temp.getName().contains(delete))
			{
				tester = temp;
				found = true;
			}
			
			if(temp.getNumber().contains(delete))
			{
				tester = temp;
				found = true;
			}
		}
		
		if(found)
		{
			System.out.println("Deleting Entry Information");
			theDirectory.remove(tester);
		}
		
		else
		{
			System.out.println("Error, can't find desired Entry");
		}
		
		return test2;
	}
	
}