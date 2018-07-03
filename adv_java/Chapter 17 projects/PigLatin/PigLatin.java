import javax.swing.*;
import java.awt.*;     
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;
// Needed for Swing classes


public class PigLatin extends JFrame
{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;	
	
	JTextField userInput;
	
	public PigLatin(int rows, int columns)
	{
		super("Welcome to the Pig Latin program");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new BorderLayout());
		userInput = new JTextField();

		JLabel welcome = new JLabel();
		add(welcome);

      
        JLabel userInputText = new JLabel("Enter a word in english to see it magically translated: ");
        userInput = new JTextField(21);
        userInput.setSize(40, 10);
        JPanel panelTop = new JPanel();
        panelTop.add(userInputText);
        panelTop.add(userInput);
        JButton submit = new JButton("Submit");
        submit.addActionListener(new InputListener());
        JPanel panelBottom = new JPanel();
        panelBottom.add(submit);

        //Add panelTop to JFrame
        add(panelTop, BorderLayout.NORTH);
        add(panelBottom, BorderLayout.SOUTH);

        //JFrame set-up
        setTitle("Welcome to the Pig Latin program");
        //setSize(300, 150);
        pack();
        setLocationRelativeTo(null);

	}	
	public class InputListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			userInput.setText(Translate(userInput.getText()));		
		}
	}
	public String Translate(String pig)
	{
		String returnS = "";
		String way = "way";
		String ay = "ay";
		String firstChar = pig.substring(0,1);
		if(firstChar.equalsIgnoreCase("a") || firstChar.equalsIgnoreCase("e") || firstChar.equalsIgnoreCase("i") ||
				firstChar.equalsIgnoreCase("o") || firstChar.equalsIgnoreCase("u"))
		{
			returnS = pig + way;
			return returnS;
		}
		else
		{
			returnS = pig.substring(1) + firstChar + ay;
			return returnS;
		}
	}	

}
