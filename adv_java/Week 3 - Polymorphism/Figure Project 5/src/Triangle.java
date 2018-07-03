/* Description: This is the child class, it calls from the base class "Figure" 
 * and overloads the "erase" and "draw"
 * methods in the Figure class to output a triangle.
 * 
 */
public class Triangle extends Figure
{

	
	public void draw() //draw method overrides Figure classes method
	{
		System.out.println("Draw Triangle");
		
	}
	public void erase() //erase method overrides Figure classes method
	{
		System.out.println("Erase Triangle");
	}
}
