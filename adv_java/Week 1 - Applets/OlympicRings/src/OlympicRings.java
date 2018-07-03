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

public class OlympicRings extends Applet 
{
	public static final int RING1 =	200;
	public static final int RING1_OUTER = 280;

		public void paint(Graphics canvas) {
	 //Draw ring 1
	 canvas.setColor(Color.BLUE);
	 canvas.fillCircle(RING_1, RING1_OUTER);
		}
}
