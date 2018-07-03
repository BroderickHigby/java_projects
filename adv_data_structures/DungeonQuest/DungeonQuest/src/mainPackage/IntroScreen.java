//package mainPackage;
//
//import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class IntroScreen extends JFrame // extends DungeonQuest
//{
//
//	// CastleVx2.gif
//	public static final int HEIGHT = 1000;
//	// DQuest.loadImages("CastleVx2.gif");
//	public static final int WIDTH = 1000;
//
//	public static void main(String[] args)
//	{
//		IntroScreen x = new IntroScreen();
//		x.setVisible(true);
//	}
//
//	JPanel buttonPanel;
//	DungeonQuest DQuest = new DungeonQuest();
//	JFrame newFrame;
//	JPanel picture;
//	JLabel pLabel;
//
//	JPanel titleGifPanel;
//
//	// Imports Chosen Gif image and adds it to the panel
//	public IntroScreen()
//	{
//		super();
//		setSize(WIDTH, HEIGHT);
//		setTitle("Dungeon Quest");
//		setLayout(new BorderLayout());
//
//		// Image Panel
//		titleGifPanel = new JPanel();
//		buildImage();
//		titleGifPanel.add(picture);
//		add(titleGifPanel, BorderLayout.NORTH);
//
//		// Button Panel
//		buttonPanel = new JPanel();
//		JButton button = new JButton("Start");
//
//		// Adds action listener to the button, opens new frame, disposing of the
//		// original
//		button.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent e)
//			{
//				dispose();
//				new FloorFrame();
//			}
//
//		});
//
//		buttonPanel.add(button);
//		add(buttonPanel, BorderLayout.SOUTH);
//
//		this.setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//
//	}
//
//	private void buildImage()
//	{
//		picture = new JPanel();
//		pLabel = new JLabel();
//		ImageIcon title = new ImageIcon("CastleV2.gif");
//
//		pLabel.setIcon(title);
//		picture.add(pLabel);
//
//	}
//
// }
