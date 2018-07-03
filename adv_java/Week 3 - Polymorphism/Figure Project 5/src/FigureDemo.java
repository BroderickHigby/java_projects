/* Description: This is the demo class for the Figure program, it uses 
 * late binding to call the center method from Figure,
 * Triangle, and Rectangle classes override the Figure method
 */
public class FigureDemo 
{
	public static void main(String[] args)
	{
		//These constructions are used to call the center method
		Figure demoFigure = new Figure();
		Figure demoTriangle = new Triangle();
		Figure demoRectangle = new Rectangle();
		//The demo classes call the methods' "center" from "Figure" constructed above, then it goes over to the other classes
		//and pulls the methods from Triangle and Rectangle. Those override Figure's methods
		demoFigure.center();
		demoTriangle.center();
		demoRectangle.center();
	}
}
