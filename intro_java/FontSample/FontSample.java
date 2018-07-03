/* Chapter No.    18     Exercise No. 6
   File Name:         FontSample
   Programmer:         Broderick Higby
   Date Last Modified: May 12, 2015


   Problem Statement: Write a GUI program to sample different fonts. The user 
   enters a line of text in a text field. The user then selects a font from a 
   font men.. Offer the three guarnteed fonts and at least two other fonts. 
   The user also slects an desired style modifiers that offers the following 
   choices 9, 10 12 14 16 24 32. There is also a "Display" button. When the 
   "Display" button is clicked, the text is displayed in the font, style, 
   and point size chosen
   
   
   
   Overall Plan (step-by-step how you want the code to make it happen):
   1. Create a Jframe that will hold all options
   2. Create a panel for font options
   3. Create a panel for text and display button 
   4. Add Panels to JFrame 
   5. Add an action listener to the display button 
  		action listener will get selected index from each of the 
  		combo boxes: font, style point size
   6. Test GUI
   etc.

   Classes needed and Purpose (Input, Processing, Output):
   
    import javax.swing.*; 
	import java.awt.*; 
	import java.awt.event.*; 

*/

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class FontSample extends JFrame
{
	JPanel choicePanel = new JPanel();
	JPanel textPanel = new JPanel();
	
	String[] fontArray = {"SansSerif", "Serif", "Monospaced", "Calibri",
								 "Algerian"};
	String[] styleArray = {"Bold", "Italic"};
	String[] pointArray = {"9", "10", "12", "14", "16", "24", "32"};
	
    //These are going to be the holes
	JComboBox fonts = new JComboBox(fontArray);
	JComboBox styleBox = new JComboBox(styleArray);
	JComboBox point = new JComboBox(pointArray);
	
	
	JTextField enterText = new JTextField();
	JButton display = new JButton("Display");
	
	public FontSample()
	{
		super("Font Samples");
		setLayout(new GridLayout(1, 2, 10, 10));
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		display.addActionListener(new displayButtonListener());
		
		choicePanel.setLayout(new GridLayout(3, 1, 10, 10));
	
		choicePanel.add(fonts);
		choicePanel.add(styleBox);
		choicePanel.add(point);
		
		textPanel.setLayout(new GridLayout(2, 1, 10, 10));
		textPanel.add(enterText);
		textPanel.add(display);
		
		add(choicePanel);	
		add(textPanel);
		
		
	}
	
	
	public class displayButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		
			int fontStyle = fonts.getSelectedIndex(); 
			String style = "SansSerif"; 
			
			switch(fontStyle)
			{
				
				case 0: 
					style = "SansSerif";
						break; 
				case 1: 
					style =  "Serif";
						break; 
				case 2: 
					style =  "Monospaced"; 
						break; 
				case 3: 
					style =  "Calibri"; 
						break; 
				case 4:
					style =  "Algerian"; 
				default: 
						break; 
			}
			
			int pointSize = point.getSelectedIndex(); 
			int setPointSize; 
			
			switch(pointSize)
			{
				case 0: 
					setPointSize = 9;  
						break; 
				case 1:
					setPointSize = 10; 
						break; 
				case 2:
					setPointSize = 12;  
						break; 		
				case 3:
					setPointSize = 14;  
						break; 
						
				case 4:
					setPointSize = 16; 
						break; 	
				case 5:
					setPointSize = 24;
						break; 
				case 6:
					setPointSize = 32; 
						break; 
				default: 
					setPointSize = 12; 
						break; 
			} 
						
			if(styleBox.getSelectedIndex() == 0)
			{
				enterText.setFont(new Font(style, Font.BOLD, setPointSize));
			}
			else
			{
				enterText.setFont(new Font(style, Font.ITALIC, setPointSize));
			}
		}
	}
	
	public static void main(String[] args)
	{
		new FontSample();
	}
}