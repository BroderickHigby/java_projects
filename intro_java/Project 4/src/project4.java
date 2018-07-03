/*
 * Programmer: Broderick Higby
 * Date: March 6, 2015
 * Project Name: Project4
 * Description: Demonstrate the development of a constructor class 
 */
import javax.swing.*;

public class project4 
{
	public static void main(String[] args)
	{
		char eventType = JOptionPane.showInputDialog("Enter type of event you are scheduling").charAt(0);
		JOptionPane.showInputDialog("C for corporate event");
		JOptionPane.showInputDialog("P for private event");
		switch(eventType){
			case 'c':
			case 'C':
				JOptionPane.showMessageDialog(null, "The manager for this event will be Dustin Britt");
				break;
			case 'p':
			case 'P':
				JOptionPane.showMessageDialog(null, "The manager for this event will be Carmen Lindsey");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please enter a valid option");
					break;
		}
					
		
	}
}
