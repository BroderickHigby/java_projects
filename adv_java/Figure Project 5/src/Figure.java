/* Description: This is the base class program, the other programs 
 * 
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

