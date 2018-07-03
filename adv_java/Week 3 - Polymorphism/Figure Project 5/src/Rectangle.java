/* Description: This is the child class, it calls from the base class 
 * "Figure" and overloads the "erase" and "draw"
 * methods in the Figure class to output a rectangle.
 * 
 */
public class Rectangle extends Figure
{	
	public void draw() //draw method is called from "Figure"
	{   //draw method overrides Figure classes method
		System.out.println("Draw Rectangle");
		
	}
	public void erase()
	{   //erase method overrides Figure classes method
		System.out.println("Erase Rectangle");
	}
}
