/**
 * @(#)OlympicRings.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 15/08/31
 */
 
import java.awt.*;
import java.applet.*;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Graphics2D;

public class OlympicRings extends Applet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int RING_WIDTH =	 100;
	public static final int RING_HEIGHT = 100;
	public static final int OUT_WIDTH = 125;
	public static final int OUT_HEIGHT = 125;


		public void paint(Graphics canvas) 
		{
		//Background
		canvas.setColor(Color.WHITE);
		canvas.fillRect(0, 0, 1000, 1000);
		
		//Draw ring 1
		canvas.setColor(Color.BLUE);
		canvas.fillOval(75,75,OUT_WIDTH, OUT_HEIGHT);
		canvas.setColor(Color.WHITE);
		canvas.fillOval(87,87,RING_WIDTH, RING_HEIGHT);
		
		//Draw ring 2
		canvas.setColor(Color.BLACK);
		canvas.fillOval(200,75,OUT_WIDTH, OUT_HEIGHT);
		canvas.setColor(Color.WHITE);
		canvas.fillOval(212,87,RING_WIDTH, RING_HEIGHT);
		
		//Draw ring 3
		canvas.setColor(Color.YELLOW);
		canvas.fillOval(125,137,OUT_WIDTH, OUT_HEIGHT);
		canvas.setColor(Color.WHITE);
		canvas.fillOval(137,149,RING_WIDTH, RING_HEIGHT);
		
		//Draw ring 4
		canvas.setColor(Color.GREEN);
		canvas.fillOval(262,137,OUT_WIDTH, OUT_HEIGHT);
		canvas.setColor(Color.WHITE);
		canvas.fillOval(274,149,RING_WIDTH, RING_HEIGHT);

		//Draw ring 5
		canvas.setColor(Color.RED);
		canvas.fillOval(325,75,OUT_WIDTH, OUT_HEIGHT);
		canvas.setColor(Color.WHITE);
		canvas.fillOval(337,87,RING_WIDTH, RING_HEIGHT);	

		

		}


}
