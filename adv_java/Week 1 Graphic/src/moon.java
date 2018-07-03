	/**
	 * @(#)moon.java
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

	public class moon extends Applet //Beginning of class
	{
			public void paint(Graphics canvas) 
			{
				//Draws the background
				canvas.fillRect(0, 0, 300, 300);
				
				//Draws the crecent 
				canvas.setColor(Color.BLUE);
				canvas.fillOval(75,100,100,100); 
				
				//The inner circle
				canvas.setColor(Color.BLACK);
				canvas.fillOval(50,100, 100, 100);
			

			}

	} //End of class

