/*Program: Project 5D
 *Programmer: Broderick Higby
 *Date: 4-28-15
 *Description: This program will take in 5 user inputs with regards to an event menu and output the associated rate.
 */
 
import java.util.Scanner;//Allows one to use the Scanner Package

public class InteractiveEventArray4D
{

	//Global constant variables defined
	public static final double CORP_RATE = 75.99;
	public static final double PRI_RATE = 47.99;
	public static final double NON_PROF_RATE = 40.99;
	
	public static void main(String[] args) throws Exception//Beginning of Main Method, throws exception
	{
		//variables defined
		char event = 'Z';
		double rate = 0;
		
		Scanner keyboard = new Scanner(System.in);	
		Event [] someEvents = new Event [5];
		
		
	
		
		System.out.println("\tEvent Menu");
		System.out.println("-------------------------");
		System.out.println("\nC. Corportate Event");
		System.out.println("\nP. Private Event");
		System.out.println("\nN. Non Profit Event");
		System.out.println("-------------------------");
		
		for(int i = 0; i < someEvents.length; i++)
		{
			System.out.println("Please make a choice from the menu");
			event = keyboard.next().charAt(0);
		
		
			if (event == 'C' || event == 'c')
			{
				rate = CORP_RATE;
			}
		
			else if (event == 'P' || event == 'p')
			{
				rate = PRI_RATE;
			}
		
			else if (event == 'N' || event == 'n')
			{
				rate = NON_PROF_RATE;
			}
			

			someEvents[i] = new Event(event, rate);
		}
		
		for (int i = 0; i < someEvents.length; i++)
		{
			System.out.println("\nYou chose option " + " " + someEvents[i].getEventType() + "." + "Your minimum rate is $" + someEvents[i].getEventMinRate());
		}
	
		System.out.println("\nThank you for using this program!");
	
	}
}
