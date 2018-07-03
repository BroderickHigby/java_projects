package mainPackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MovingSpriteEx extends JFrame 
{

	JPanel floor;
    public MovingSpriteEx() {
        
        initUI();
    }
    
    private void initUI() 
    {
        //add(new Board());
    //    add(floor);
    	Board b = new Board();

        //setContentPane(b);
        add(b);
        b.requestFocusInWindow();
        //add(floor);
       // add(new Board());
        setSize(1000, 1000);
        setResizable(false);
        
        setTitle("Moving sprite");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MovingSpriteEx ex = new MovingSpriteEx();
                ex.setVisible(true);
            }
        });
    }
}