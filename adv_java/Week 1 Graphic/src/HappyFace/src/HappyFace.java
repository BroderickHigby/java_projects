/**
 * @(#)HappyFace.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 15/08/27
 */
 
import java.awt.*;
import java.applet.*;

public class HappyFace extends Applet 
	{
	
	public void init() 
	{
	}

	public void paint(Graphics canvas) 
	{
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155,100, 10, 10);
		canvas.fillOval(230, 100, 10, 10);
		canvas.drawArc(150,160,100,50,180,180);
		
		canvas.drawOval(300, 50, 300, 300);
		
	 		canvas.drawOval(300, 50, 300, 300);
	} 
	
}
