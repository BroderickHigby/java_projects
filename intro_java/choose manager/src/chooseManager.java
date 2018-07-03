/*
 * Programmer: Broderick Higby
 * Date: March 6, 2015
 * Project Name: chooseManager
 * Description: Demonstrate the use of an if else loop within a JOptionPane class 
 */
import javax.swing.*; //Allows us to utilize JoptionPane


public class chooseManager //Beginning of Main Method
{
	public static void main(String[] args) 
	{

		
		String window = " "; //Window is the variable that is declared 
		
		String sentence = "C for a corporate event"; //I entered a string in so I wouldn't return an error for the string being so long
		String sentence1 = "P for private event"; //Same here
		
		window = JOptionPane.showInputDialog("Enter type of event you are scheduling \n " + sentence + "\n" + sentence1);
		//JOptionPane shows the dialog box and 'window' stores input
		
		char eventType = window.charAt(0); //The input from window is called here and eventType as a char takes it and sends it into the loop 

				
		 if (eventType=='c' || eventType=='C'){ //If C is entered it goes here

				JOptionPane.showMessageDialog(null, "The manager for this event will be Dustin Britt"); 
				//The JOptionPane shows this dialog given the boolean expression C is true
		 }
		else if(eventType=='P' || eventType=='p'){

				JOptionPane.showMessageDialog(null, "The manager for this event will be Carmen Lindsey");
				//The JOptionPane shows this dialog given the boolean expression P is true		
		}
		else{
				JOptionPane.showMessageDialog(null, "Please enter a valid option");
				//The JOptionPane shows this dialog if both other loops are false
		}
		 
		 
	System.exit(0); //Exits the program
	} //End of class
} //End of method
