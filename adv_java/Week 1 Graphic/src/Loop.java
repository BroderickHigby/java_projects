/**
 * @(#)Loop.java
 *
 * Sample Applet application
 *
 * @author Broderick Higby
 * @version 1.00 15/08/31
 */
//Imports java applet packages and abstract window toolkit
import java.applet.*;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Loop extends Applet //Beginning of class
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas) 
	{

		int i, xOffset; //To make the circles in a loop
		for (i = 0; i<=5; i++);
		{
			xOffset = 110*i;

			
			if (i == 0)
			{
				canvas.setColor(Color.RED);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
			else if (i == 1)
			{
				canvas.setColor(Color.GREEN);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
			else if (i == 2)
			{
				canvas.setColor(Color.ORANGE);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
			
			else if (i == 3)
			{
				canvas.setColor(Color.BLUE);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
			
			else if (i == 4)
			{
				canvas.setColor(Color.BLACK);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
			
			else if (i == 5)
			{
				canvas.setColor(Color.YELLOW);
				canvas.fillOval(50+xOffset, 100, 100, 100);
			}
	}//End of class
}
}
