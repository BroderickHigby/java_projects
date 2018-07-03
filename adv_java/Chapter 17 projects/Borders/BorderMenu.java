import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class BorderMenu extends JFrame
{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;	
	private JMenuItem etched;
	private JMenuItem beveled;
	private JMenuItem lined;
	
	public BorderMenu()
	{

		super("Welcome to Pretty Borders");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new BorderLayout());
		JLabel welcome = new JLabel();
		add(welcome);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu borders = new JMenu("Pick a border!");
		menuBar.add(menuBar);
		beveled = new JMenuItem("Beveled");
		etched = new JMenuItem("Etched");
		lined = new JMenuItem("Lined");
		borders.add(beveled);
		borders.add(etched);
		borders.add(lined);
		setJMenuBar(menuBar);
		

        //JFrame set-up
        //setTitle("Welcome to Pretty Borders");
        setSize(300, 150);
        pack();
        setLocationRelativeTo(null);

	}	
//		public class InputListener implements ActionListener
//		{
//			public void actionPerformed(ActionEvent e)
//			{
//				userInput.setText(Translate(userInput.getText()));		
//			}
//		}
}
