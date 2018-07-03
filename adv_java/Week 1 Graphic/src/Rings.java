	/*
	 *  Ring Drawing Applet
	 *  Based on an example written by J.M. Bishop (Dec 1996)
	 *  Illustrates colour and simple graphic output
	 */

	import java.awt.Graphics;       // Java API components
	import java.awt.Color;          // needed by this applet
	import javax.swing.JApplet;

	public class Rings extends JApplet
	{
	    public void paint(Graphics g)
	    {
	        // Call superclass version of method paint

	        super.paint(g);

	        // Draw five interlocking rings of different colours
	        // See documentation for Java Graphics API for info
			//Background
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 400, 300);
	        
	        g.setColor(Color.BLUE);
	        g.drawOval(20, 20, 150, 150);
	        g.setColor(Color.BLACK);
	        g.drawOval(130, 20, 150, 150);
	        g.setColor(Color.YELLOW);
	        g.drawOval(80, 120, 150, 150);
	        g.setColor(Color.RED);
	        g.drawOval(245, 20, 150, 150);
	        g.setColor(Color.GREEN);
	        g.drawOval(180, 120, 150, 150);

	    }
	}
