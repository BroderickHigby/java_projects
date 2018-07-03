
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleGui extends JFrame
{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
 
	JPanel picture;
	JPanel titleGifPanel;
	JLabel pLabel;
	JPanel buttonPanel;
	JFrame newFrame;
	
	public TitleGui()
	{
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Dungeon Quest");
		setLayout(new BorderLayout());
		
		//Image Panel
		titleGifPanel = new JPanel();
		buildImage();
		titleGifPanel.add(picture);
		add(titleGifPanel, BorderLayout.NORTH);
	
		//Button Panel
		buttonPanel = new JPanel();
		JButton button = new JButton("Start");
		
		//Adds action listener to the button, opens new frame, disposing of the original
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				new FloorFrame();
			}
			
		});
		
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.SOUTH);
		
        this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
	
	//Imports Chosen Gif image and adds it to the panel
	private void buildImage()
	{
		picture = new JPanel();
		pLabel = new JLabel();
		ImageIcon title = new ImageIcon("CastleV2.gif");
		
		pLabel.setIcon(title);
		picture.add(pLabel);
		
	}

	public static void main(String[] args)
	{
		TitleGui x = new TitleGui();
		x.setVisible(true);
	}
	
}