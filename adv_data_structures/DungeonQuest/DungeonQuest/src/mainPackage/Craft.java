package mainPackage;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Craft 
{

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Craft() 
    {
        
        initCraft();
    }
    
    private void initCraft() {
        
        ImageIcon ii = new ImageIcon("Images/FloorPlayerRight.gif");
        image = ii.getImage();
        x = 40;
        y = 60;        
    }

    //Use this method to create frame boundaries
    public void move() 
    {	
       x += dx;
       y += dy;
    }

  public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() 
    {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

       if (key == KeyEvent.VK_LEFT) 
        {
        	ImageIcon ii = new ImageIcon("Images/FloorPlayerLeft.gif");
        	image = ii.getImage();
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) 
        {
        	ImageIcon ii = new ImageIcon("Images/FloorPlayerRight.gif");
        	image = ii.getImage();
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) 
        {
        	ImageIcon ii = new ImageIcon("Images/FloorPlayerUp.gif");
        	image = ii.getImage();
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) 
        {
        	ImageIcon ii = new ImageIcon("Images/FloorPlayerDown.gif");
        	image = ii.getImage();
            dy = 1;
        }
        
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

       if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}