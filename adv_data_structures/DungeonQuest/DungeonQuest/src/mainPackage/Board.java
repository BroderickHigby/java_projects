package mainPackage;

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


public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Craft craft;
    private final int DELAY = 10;
    JPanel floorPanel;

    public Board() 
    {
    	initBoard();
    	floorPanel = new JPanel();
		floorPanel.setPreferredSize(new Dimension(960, 960));
		floorPanel.setVisible(true);
		
		GridLayout mapLayout = new GridLayout(15,15, 0, 0);
		floorPanel.setLayout(mapLayout);
		
		//row1
		for(int i = 0;i< 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		}
		
		//row2
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row3
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row4
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row5
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row6
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row7
		for(int i = 0; i< 7; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorTorchBot.gif")));
		for(int i = 0; i< 7; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		
		//row8
		for(int i = 0; i < 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorTorchRight.gif")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorTorchLeft.gif")));
		for(int i = 0; i < 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		
		//row9
		for(int i = 0; i< 7; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorTorchTop.gif")));
		for(int i = 0; i< 7; i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		}
		
		//row10
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row11
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row12
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row13
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 5;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row14
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/FloorWooden.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		
		//row15
		for(int i = 0;i< 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		}
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		floorPanel.add(new JLabel(new ImageIcon("Images/Floor.png")));
		for(int i = 0;i< 6;i++)
		{
			floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		}
		
		
		
		
		
		//floorPanel.add(new JLabel(new ImageIcon("Images/Wall.png")));
		add(floorPanel);
        //initBoard();
    }
    
    private void initBoard() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        craft = new Craft();
        timer = new Timer(DELAY, this);
        timer.start();        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        craft.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
    }
}