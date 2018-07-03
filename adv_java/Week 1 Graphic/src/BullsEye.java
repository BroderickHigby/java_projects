	/**
	 * @(#)BullsEye.java
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

	public class BullsEye extends Applet //Beginning of class
	{
			public void paint(Graphics canvas) 
			{
				//Draws the background
				canvas.setColor(Color.WHITE);
				canvas.fillRect(0, 0, 600, 600);
				
				//Draws the largest circle 
				canvas.setColor(Color.BLUE);
				canvas.fillOval(0,0,500, 500); 
				
				//Draws the Concentric Circles
				
				canvas.setColor(Color.GREEN);
				//increases the height and width by 50, then lowers the diameter by 100
				canvas.fillOval(50,50, 400, 400); 
				canvas.setColor(Color.BLUE);
				//increases the height and width by 50, then lowers the diameter by 100
				canvas.fillOval(100,100, 300, 300); 
				//Draws the Concentric Circles
				canvas.setColor(Color.GREEN);
				//increases the height and width by 50, then lowers the diameter by 100
				canvas.fillOval(150,150, 200, 200); 
				canvas.setColor(Color.BLUE);
				//increases the height and width by 50, then lowers the diameter by 100
				canvas.fillOval(200,200, 100, 100); 		
				
				
			}

	} //End of class

