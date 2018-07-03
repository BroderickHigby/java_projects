/*
 * Programmer: Broderick Higby
 * Date: March 29, 2015
 * Project Name: ChooseManagerC
 * Description: Demonstrate the use of an if else loop within a JOptionPane class, calling a constructor class, declaring constants, and local scope variables
 */
import javax.swing.*; //Allows us to utilize JoptionPane

public class ChooseManagerC 
{
	//The rates are declared as static so they can be seen by all objects, they're declared final so they can't be changed	
	public static final double CORP_RATE = 75.99; //corporate rate is set to $75.99
	public static final double PRI_RATE = 47.99; //private rate is set to $47.99		
	//public corporateEvent, privateMethod
	
	public static void main(String[] args)
	{


		
	String window = " "; //Window is the variable that is declared
	
	String sentence = "C for a corporate event"; //I created a string so I wouldn't return an error for the line being so long
	String sentence1 = " P for a private event"; //Same here
	
	window = JOptionPane.showInputDialog("Hello! Please enter the type of event you are scheduling \n " + sentence + "\n" +sentence1);
	//JOptionPane shows the dialog box and 'window' stores input
	
		char eventType = window.charAt(0); //The input from window is called here and eventType as a char takes it and sends it into the loop

			Event anEvent; //This constructs a new instance from Event and calls it anEvent
			
				 if (eventType=='c' || eventType=='C') //If C is entered it goes here
				 {	 	
					 	//anEvent is constructed using the Event class, using the eventType object and the CORP_RATE constant 
						anEvent = new Event(eventType, CORP_RATE);
						
						//Uses newly constructed anEvent object and calls geteventType from Event class
						anEvent.geteventType(); //Pulls eventType from the Event class
					 	//This JOptionPane shows this dialog given the boolean expression C is true					 
						JOptionPane.showMessageDialog(null, "The Manager for this event will be Dustin Britt"); 
						//Displays message then pulls from the Event class and geteventMinRate
						JOptionPane.showMessageDialog(null, "Thank you, the rate for this event will be $" +anEvent.geteventMinRate());
						//This will execute window and use the constant CORP_RATE
						
						
						
				}
				else if(eventType=='P' || eventType=='p')
				{						
				 		//anEvent is constructed using the Event class, using the eventType object and the CORP_RATE constant 
						anEvent = new Event(eventType,PRI_RATE);

						//Uses newly constructed anEvent object and calls geteventType from Event class
						anEvent.geteventType();
						
						//The JOptionPane shows this dialog given the boolean expression P is true								
						JOptionPane.showMessageDialog(null, "The Manager for this event will be Carmen Lindsey");
						//Displays message then pulls from the Event class and geteventMinRate						
						JOptionPane.showMessageDialog(null, "Thank you, the rate for this event will be $" +anEvent.geteventMinRate());
						//This will execute window and use the constant CORP_RATE
				}
				else
				{
						JOptionPane.showMessageDialog(null, "Please enter a valid option");
						//The JOptionPane shows this dialog if both other loops are false
				}
			
	 
	 		System.exit(0); //Exits the program
	} 
}
