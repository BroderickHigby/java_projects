	/**
	 * @(#)Rectangle.java
	 *
	 * Sample Applet application
	 *
	 * @author Broderick Higby
	 * @version 1.00 15/08/31
	 */
	//Imports java applet packages and abstract window toolkit
	import java.applet.*;
	import java.awt.Color;
	import java.awt.Graphics;

	public class Rectangle extends Applet //Beginning of class
	{
			public void paint(Graphics canvas) 
			{
			//The rectangle
			canvas.setColor(Color.RED);
			canvas.drawRect(100,100, 100, 100);
			
			//Draws the circle 
			canvas.setColor(Color.BLUE);
			canvas.drawOval(100,100,100,100); 
			}

	}

