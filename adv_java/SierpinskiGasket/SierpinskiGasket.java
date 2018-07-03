/* Chapter No.    18     Exercise No. 1
   File Name:     SierpinskiGasket     
   Programmer:         Broderick Higby
   Date Last Modified: May 10 2015

   Problem Statement: A Sierpinski Gasket or Triangle is a type of fractal 
   named after the polish mathematician Walaw Sierpinski who described some 
   of its interesting properties in 1916. It is a nice example of how an 
   orderly structure can be created as a result of random, chaotic behavior. 
   
   
   
   Overall Plan (step-by-step how you want the code to make it happen):
   1.set current equal to point x
   2. Repeat many timess
   		a. Randomly pick target as one of the three X, Y, Z
   		b. Calculate the point halfway between current and target
   		c. Set Current to this halfway point. 
   		d. Draw a pixel at location of current. One way to do this is to fill 
   		or draw a tiny rectangle at this coordinate
   3.Create a JFrame 
   4.Pain using the Sierpinski algorithm
   etc.

   Classes needed and Purpose (Input, Processing, Output):
   import javax.swing.*;
   import java.awt.*;

*/




import javax.swing.*;
import java.awt.*;

public class SierpinskiGasket extends JFrame 
{

	Point point1 = new Point(30,600);
	Point point2 = new Point(330,75);
	Point point3 = new Point(630,600);
	Point current = point1, target;
	
	private int count=0;
	
	public SierpinskiGasket () 
	{
	    super("Sierpinski Triangle");
	    setSize(650,650);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setBackground(Color.WHITE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	}

	public void paint(Graphics g) 
	{
	    super.paint(g);
	   
	   	g.setColor(Color.RED);
	
		g.drawLine(point1.x, point1.y, point2.x, point2.y);
		g.drawLine(point1.x, point1.y, point3.x, point3.y);
	    g.drawLine(point3.x, point3.y, point2.x, point2.y);
	  
	    
	    
	    
	        while(count<10000000) 
	        {
	            int choice = (int)(Math.random()*3);
	            
	            System.out.println();
	            switch(choice) 
	            {
	                case 0: 
	                	target = point1; 
	                		break;
	                case 1: 
	                	target = point2; 
	                		break;
	                case 2: 
	                	target = point3; 
	                		break;
	                default: 
	                		break; 
	            }
	           
	            	             
	            current = new Point((Math.round(current.x + target.x)/2),
	                     (Math.round(current.y + target.y)/2));
	           
	            g.fillRect(current.x, current.y, 1 , 1);
	           
	            count++;
	        }
	        
	}

	public static void main(String[] args) 
	{
	    new SierpinskiGasket();
	}
}