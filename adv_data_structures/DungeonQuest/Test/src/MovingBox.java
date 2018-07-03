import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingBox extends JPanel implements ActionListener, KeyListener
{

	Timer tm = new Timer(5, this);
	int x = 128;
	int y = 448;
	int velX = 0;
	int velY = 0;
	
	public MovingBox()
	{
		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setPreferredSize(new Dimension(960,960));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x, y, 15, 15);
	}
	
	public void character()
	{
		
	}
	//Stops at certain boundaries
	public void actionPerformed(ActionEvent e)
	{
		if(x < 0)
		{
			velX = 0;
		    x = 0;
		}
		if(x == 256 & (y<576 & y > 384))
		{
			velX = 0;
			x = 256;
		}
		if(x == 448 & (y<576 & y > 384))
		{
			velX = 0;
			x =448;
		}
		if(y == 384  & (x < 448 & x > 256))
		{
			velY = 0;
			y = 384;
		}
		if(y == 576 & (x < 448 & x > 256))
		{
			velY = 0;
			y = 576;
		}
		
		
		if(x > 896)
		{
			velX = 0;
			x = 896;
		}
		
		if(y < 64)
		{
			velY = 0;
			y = 64;
		}
		
		if(y > 896)
		{
			velY = 0;
			y = 896;
		}
		x = x + velX;
		y = y + velY;
		repaint();
	}
	
	public void keyPressed(KeyEvent e)
	{
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_LEFT)
		{
			velX = -1;
			velY = 0;
		}
		
		if(c == KeyEvent.VK_UP)
		{
			velX = 0;
			velY = -1;
		}
		
		if(c == KeyEvent.VK_RIGHT)
		{
			velX = 1;
			velY = 0;
		}
		
		if(c == KeyEvent.VK_DOWN)
		{
			velX = 0;
			velY = 1;
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void keyReleased(KeyEvent e)
	{
		velX = 0;
		velY = 0;
	}
	public static void main(String[] args)
	{
		MovingBox x = new MovingBox();
		JFrame o = new JFrame();
		o.setTitle("Moving Box");
		o.setSize(1500, 1000);
		o.setVisible(true);
		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o.setLocationRelativeTo(null);
		o.add(x);
	}
}