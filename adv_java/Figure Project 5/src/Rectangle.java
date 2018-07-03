/* Description: This is the child class, it calls from the base class "Figure" and overloads the "erase" and "draw"
 * methods in the Figure class to output a rectangle.
 * 
 */
public class Rectangle extends Figure
{	
	public void draw()
	{
		System.out.println("Draw Rectangle"); //draw method overrides Figure classes method
		
	}
	public void erase()
	{
		System.out.println("Erase Rectangle"); //erase method overrides Figure classes method
	}
}
