//package mainPackage;
//
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class FloorFrame
//{
//	public static final int FLOOR_HEIGHT = 5;
//	public static final int FLOOR_WIDTH = 5;
//	private JFrame cWindow;
//
//	public FloorFrame()
//	{
//		cWindow = new JFrame();
//
//		JPanel floorPanel;
//
//		cWindow.setSize(975, 1000);
//		cWindow.setDefaultCloseOperation(cWindow.EXIT_ON_CLOSE);
//		cWindow.setLocationRelativeTo(null);
//		cWindow.setVisible(true);
//
//		cWindow.setLayout(new FlowLayout());
//
//		floorPanel = new JPanel();
//		floorPanel.setPreferredSize(new Dimension(960, 960));
//		floorPanel.setVisible(true);
//
//		GridLayout mapLayout = new GridLayout(15, 15, 0, 0);
//		floorPanel.setLayout(mapLayout);
//
//		int count = 1;
//		int temp = 0;
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			if ((i == 1) || (i <= 8) || (i > 9))
//			{
//				floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//			}
//			if (i == 9)
//			{
//				floorPanel
//						.add(new JLabel(new ImageIcon("FloorPlayerRight.gif")));
//			}
//
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		}
//
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//		for (int i = 1; i <= 15; i++)
//		{
//			floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		}
//
//		/*
//		 * floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		 * floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		 * floorPanel.add(new JLabel(new ImageIcon("Floor.png")));
//		 * floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		 * floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		 * floorPanel.add(new JLabel(new ImageIcon("Wall.png")));
//		 * floorPanel.add(new JLabel(new
//		 * ImageIcon("FloorChestplateGreen.gif"))); floorPanel.add(new
//		 * JLabel(new ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Floor.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png"))); floorPanel.add(new JLabel(new
//		 * ImageIcon("Wall.png")));
//		 */
//
//		cWindow.add(floorPanel);
//
//	}
//
//	/*
//	 * private void buildFloorTile() { tiles[0] = new JLabel(); ImageIcon i =
//	 * new ImageIcon("FloorScaledby9.png"); tiles[0].setIcon(i); }
//	 * 
//	 * private void buildWallTile() { tiles[1] = new JLabel(); ImageIcon i = new
//	 * ImageIcon("Wall.png"); tiles[1].setIcon(i); }
//	 * 
//	 * private void buildCharacterTile() { tiles[2] = new JLabel(); ImageIcon i
//	 * = new ImageIcon("Character.png"); tiles[2].setIcon(i); }
//	 */
//
// }
