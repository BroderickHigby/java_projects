/* Description: This is the child class, it calls from the base class "Figure" and overloads the "erase" and "draw"
 * methods in the Figure class to output a rectangle in the demo class.
 * 
 */
public class Rectangle extends Figure
{	
	//A pretty cool rectangle that overrides the Figure class and called to the demo class.
	public void draw() 
	{
		System.out.println("*******************");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*                 *");
		System.out.println("*******************");
	}
	//"Erase" spaces out the lines until the previous selection is no longer visible
	public void erase()  
	{
		for(int i = 0; i < 50; i++) 
		{
			System.out.println("\n");
		}
	}
}
