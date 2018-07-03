import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener //TODO: Make the board go under the player, so the player is animated 
{
    private Timer timer;
    private Craft craft;
    private final int DELAY = 10;
    JPanel floorPanel;

    /**The ground and all it's elements
     * 
     */
    public Board() 
    {
    	initBoard(); //initializes the board
    	floorPanel = new JPanel();
		floorPanel.setPreferredSize(new Dimension(960, 960));
		floorPanel.setVisible(true);
		
		GridLayout mapLayout = new GridLayout(15,15, 0, 0);
		floorPanel.setLayout(mapLayout);
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
		}
		
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			if(i == 1 || i <=8 || i > 9)
			{
				floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
			}
			if(i == 9)
			{
				floorPanel.add(new JLabel(new ImageIcon("FloorPlayerRight.gif")));
			}
			
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
		}
		
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		for(int i = 1; i <= 15; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
		}
		
		add(floorPanel);
        //initBoard();
    }
    
    private void initBoard() 
    {    
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        craft = new Craft();
        timer = new Timer(DELAY, this);
        timer.start();        
    }


    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) 
    {    
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);   
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {    
        craft.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter 
    {
        @Override
        public void keyReleased(KeyEvent e) 
        {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) 
        {
            craft.keyPressed(e);
        }
    }
}