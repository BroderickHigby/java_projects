	/**
	 * @(#)Flower.java
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

	public class Flower extends Applet //Beginning of class
	{
			public void paint(Graphics canvas) 
			{
				//Draws the background
				canvas.setColor(Color.WHITE);
				canvas.fillRect(0, 0, 600, 600);
								
				//Draws the flower petals
				
				canvas.setColor(Color.GREEN);
				//Sets the top-left petal
				canvas.fillOval(150,150, 150, 150); 
				canvas.setColor(Color.GREEN);
				//Sets the top-left petal
				canvas.fillOval(300,150, 150, 150); 
				canvas.setColor(Color.GREEN);
				//Sets the top-left petal
				canvas.fillOval(150,300, 150, 150); 
				canvas.setColor(Color.GREEN);
				//Sets the top-left petal
				canvas.fillOval(300,300, 150, 150); 		

				//Draws the center circle 
				canvas.setColor(Color.YELLOW);
				canvas.fillOval(200,200,200,200); 				
			}

	} //End of class

