/* Description: This is the child class, it calls from the base class "Figure" and overloads the "erase" and "draw"
 * methods in the Figure class to output a rectangle.
 * 
 */
public class Rectangle extends Figure
{	
	public void draw() //A pretty cool rectangle
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
	public void erase()
	{
		for(int i = 0; i < 50; i++) // a 
		{
			System.out.println("\n");
		}
	}
}
