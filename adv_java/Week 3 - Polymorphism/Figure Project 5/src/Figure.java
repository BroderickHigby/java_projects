/* Course CS112    Days & Time: September 10, 2015
 * Chapter Number: 8 Project Number: 5
 * Programmer: Broderick Higby
 * Program Title: Figure
 * Program Description: This program displays the different methods and demonstrates
 * the use of polymorphism, and late-binding. 
 */
public class Figure 
{
	String drawString;
	String eraseString;
	
	//This center method is called in the demo class
	public void center() 
	{
		draw();
		erase();
		System.out.println("This is the center method being called");
	}

	public void draw()
	{
		System.out.println("Draw Figure");
		
	}
	public void erase()
	{
		System.out.println("Erase Figure");
	}
}

