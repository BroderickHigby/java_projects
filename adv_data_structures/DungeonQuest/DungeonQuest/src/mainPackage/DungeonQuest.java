package mainPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class DungeonQuest extends JFrame implements KeyListener
{
	private static int RoomCount = 0;

	// private static GameSound sound = new GameSound();
	// private static GameSound soundDoor = new GameSound();

	public static void main(String[] args)
	{
		new DungeonQuest();
	}

	boolean amulet = true;
	private BufferedImage background;
	private int cordX = 448;
	private int cordY = 896;
	boolean equipSword = true;
	private BufferStrategy myBuffer;
	boolean pike = true;
	int position = 1;
	boolean sabatons = true;
	boolean shield = true;
	ImageIcon temp;
	// Data Structure to Store Treasure Pickups
	Map<String, Integer> treasure = new HashMap<String, Integer>();

	private int vel;

	private int vel2 = 4;

	public DungeonQuest()
	{

		setSize(960, 960);
		loadImages("Room1.PNG");
		setVisible(true);
		setIgnoreRepaint(true);
		setLocationRelativeTo(null);
		this.createBufferStrategy(2);
		myBuffer = this.getBufferStrategy();
		repaint();
		// sound.play("DankDungeon.wav");

	}

	public void drawImages(Graphics2D g)
	{
		g.drawImage(background, 0, 0, this);
		g.drawImage(temp.getImage(), cordX, cordY, this);
	}

	@Override
	public void keyPressed(KeyEvent ke)
	{
		// Change this variable to test each room

		// ***ROOM1***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 1)
		{
			vel = (vel2 - (4 * RoomCount));
			setTitle("Room 1");
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				if ((cordX == 640) && ((cordY >= 704) && (cordY <= 896)))// Room
				// 1
				// Bound
				// 2
				{
					cordX = 640;
				} else if ((cordX == 640) && ((cordY > 448) && (cordY < 640)))// Room
				// 1
				// Bound
				// 7
				{
					cordX = 640;
				} else if ((cordX == 640) && ((cordY >= 192) && (cordY < 384)))// Room
				// 1
				// Bound
				// 14
				{
					cordX = 640;
				} else if ((cordX == 64) && ((cordY > 704) && (cordY <= 832)))// Room
				// 1
				// Bound
				// 19
				{
					cordX = 64;
				} else if ((cordX == 64) && ((cordY > 192) && (cordY < 384)))
				{
					cordX = 64;
				} else if ((cordX == 64) && ((cordY > 448) && (cordY < 640)))
				{
					cordX = 64;
				} else if ((cordX == 576) && ((cordY >= 0) && (cordY < 64)))// Room
				// 1
				// Bound
				// 30
				{
					cordX = 576;
				} else if ((cordX == 832) && ((cordY >= 64) && (cordY <= 832)))
				{
					cordX = 832;
				} else if ((cordX == 128) && ((cordY > 704) && (cordY <= 832)))
				{
					cordX = 128;
				} else
				{

					cordX += vel;
				}
				temp = new ImageIcon("PLayerRight.gif");
			}
				break;

			case KeyEvent.VK_LEFT:
			{
				if ((cordX == 256) && ((cordY > 704) && (cordY <= 896)))// Room
				// 1
				// Bound
				// 1
				{
					cordX = 256;
				} else if ((cordX == 256) && ((cordY > 448) && (cordY <= 576)))// Room
				// 1
				// Bound
				// 8
				{
					cordX = 256;
				} else if ((cordX == 256) && ((cordY > 192) && (cordY < 384)))// Room
				// 1
				// Bound
				// 13
				{
					cordX = 256;
				} else if ((cordX == 832) && ((cordY > 704) && (cordY <= 832)))// Room
				// 1
				// Bound
				// 21
				{
					cordX = 832;
				} else if ((cordX == 832) && ((cordY > 448) && (cordY < 640)))// Room
				// 1
				// Bound
				// 22
				{
					cordX = 832;
				} else if ((cordX == 832) && ((cordY > 192) && (cordY < 384)))// Room
				// 1
				// Bound
				// 23
				{
					cordX = 832;
				} else if ((cordX == 320) && ((cordY >= 0) && (cordY < 64)))// Room
				// 1
				// Bound
				// 29
				{
					cordX = 320;
				} else if ((cordX == 64) && ((cordY >= 64) && (cordY <= 832)))
				{
					cordX = 64;
				} else
				{

					cordX -= vel;
				}
				temp = new ImageIcon("PLayerLeft.gif");
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				if ((cordY == 896) && ((cordX >= 320) && (cordX <= 576)))// Room
				// 1
				// Bound
				// 0
				{
					cordY = 896;
				} else if ((cordY == 704) && ((cordX > 640) && (cordX < 832)))// Room
				// 1
				// Bound
				// 3
				{
					cordY = 704;
				} else if ((cordY == 704) && ((cordX >= 128) && (cordX < 256)))// Room
				// 1
				// Bound
				// 4
				{
					cordY = 704;
				} else if ((cordY == 448) && ((cordX > 640) && (cordX < 832)))// Room
				// 1
				// Bound
				// 9
				{
					cordY = 448;
				} else if ((cordY == 448) && ((cordX > 64) && (cordX <= 192)))// Room
				// 1
				// Bound
				// 10
				{
					cordY = 448;
				} else if ((cordY == 192) && ((cordX > 64) && (cordX <= 192)))// Room
				// 1
				// Bound
				// 15
				{
					cordY = 192;
				} else if ((cordY == 192) && ((cordX >= 704) && (cordX < 832)))// Room
				// 1
				// Bound
				// 16
				{
					cordY = 192;
				} else if ((cordY == 832) && (cordX == 64))// Room 1 Bound 17
				{
					cordY = 832;
				} else if ((cordY == 832) && (cordX == 832))// Room 1 Bound 18
				{
					cordY = 832;
				} else
				{

					cordY += vel;
				}
				temp = new ImageIcon("PLayerDown.gif");
			}
				break;

			case KeyEvent.VK_UP:
			{
				if ((cordY == 640) && ((cordX >= 128) && (cordX < 256)))// Room
				// 1
				// Bound
				// 5
				{
					cordY = 640;
				} else if ((cordY == 640) && ((cordX > 640) && (cordX < 832)))// Room
				// 1
				// Bound
				// 6
				{
					cordY = 640;
				} else if ((cordY == 384) && ((cordX >= 128) && (cordX < 256)))// Room
				// 1
				// Bound
				// 11
				{
					cordY = 384;
				} else if ((cordY == 384) && ((cordX > 640) && (cordX < 832)))// Room
				// 1
				// Bound
				// 12
				{
					cordY = 384;
				} else if ((cordY == 64) && ((cordX > 576) && (cordX <= 832)))// Room
				// 1
				// Bound
				// 24
				{
					cordY = 64;
				} else if ((cordY == 64) && ((cordX >= 64) && (cordX < 320)))// Room
				// 1
				// Bound
				// 26
				{
					cordY = 64;
				} else if ((cordY <= 0) && ((cordX >= 320) && (cordX <= 576)))
				{
					RoomCount++;
					vel2 = vel2 + 2;
					cordY = 896;
					position = 2;
					setTitle("Room 2");
					loadImages("Room2Chest.PNG");

				} else
				{

					cordY -= vel;
				}
				temp = new ImageIcon("PLayerUp.gif");
			}
				break;
			}
		}
		repaint();

		// ***ROOM2***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 2)
		{

			vel = (vel2 - (4 * RoomCount));
			setTitle("Room 2");
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");

				if ((cordX == 384) && ((cordY > 384) && (cordY <= 448)))// Room
				// 2
				// Bound
				// 4
				{
					cordX = 384;
				}

				else if ((cordX == 512) && ((cordY > 832) && (cordY <= 960)))
				{
					cordX = 512;
				}

				else if ((cordX == 640) && ((cordY > 768) && (cordY <= 832)))
				{
					cordX = 640;
				}

				else if ((cordX == 832) && ((cordY > 512) && (cordY <= 832)))
				{
					cordX = 832;
				} else if ((cordX == 832) && ((cordY >= 64) && (cordY < 448)))
				{
					cordX = 832;
				}

				else if ((cordX == 512) && ((cordY >= 0) && (cordY < 64)))
				{
					cordX = 512;
				}

				else if ((cordX == 640) && ((cordY >= 64) && (cordY < 128)))
				{
					cordX = 640;
				}

				else if ((cordX == 128) && ((cordY >= 64) && (cordY < 128)))
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY > 768) && (cordY <= 832)))
				{
					cordX = 128;
				} else if ((cordX >= 896) && ((cordY >= 384) && (cordY <= 576)))
				{
					RoomCount++;
					vel2 = vel2 + 4;
					cordX = 0;
					position = 3;
					setTitle("Room 3");
					loadImages("Room3Decor.PNG");
				}

				else
				{

					cordX += vel;
				}
			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");

				if ((cordX == 512) && ((cordY > 384) && (cordY <= 512)))// Room
				// 2
				// Bound
				// 2
				{
					cordX = 512;
				}

				else if ((cordX == 384) && ((cordY > 832) && (cordY <= 896)))// Room
				// 2
				// Bound
				// 5
				{
					cordX = 384;
				} else if ((cordX == 768) && ((cordY > 768) && (cordY <= 832)))
				{
					cordX = 768;
				}

				else if ((cordX == 768) && ((cordY >= 64) && (cordY < 128)))
				{
					cordX = 768;
				}

				else if ((cordX == 384) && ((cordY >= 0) && (cordY < 64)))
				{
					cordX = 384;
				}

				else if ((cordX == 256) && ((cordY >= 64) && (cordY < 128)))
				{
					cordX = 256;
				}

				else if ((cordX == 256) && ((cordY > 768) && (cordY <= 832)))
				{
					cordX = 256;
				}

				else if ((cordX == 64) && ((cordY >= 64) && (cordY < 384)))
				{
					cordX = 64;
				} else if ((cordX == 64) && ((cordY >= 576) && (cordY <= 832)))
				{
					cordX = 64;
				} else if ((cordX <= 0) && ((cordY >= 384) && (cordY <= 512)))
				{
					cordX = 890;
					position = 12;
					setTitle("Room 12");
					loadImages("Room12Decor.png");
				} else
				{

					cordX -= vel;
				}
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");

				if ((cordY == 384) && ((cordX > 384) && (cordX <= 448)))// Room
				// 2
				// Bound
				// 3
				{
					cordY = 384;
				} else if ((cordY == 832) && ((cordX >= 256) && (cordX < 384)))
				{
					cordY = 832;
				} else if ((cordY == 768) && ((cordX > 128) && (cordX < 256)))
				{
					if (amulet)
					{
						JOptionPane
								.showMessageDialog(null,
										"Congragulations, You found the Amulet of Aphrodite");// Put
						// in
						// message
						// for
						// item
						// or
						// quest
						treasure.put("Amulet", 1);
						amulet = false;
					}
					cordY = 768;
				} else if ((cordY == 832) && ((cordX >= 64) && (cordX <= 128)))
				{
					cordY = 832;
				} else if ((cordY == 832) && ((cordX >= 576) && (cordX < 640)))
				{
					cordY = 832;
				} else if ((cordY == 768) && ((cordX > 640) && (cordX < 768)))
				{
					if (pike)
					{
						JOptionPane
								.showMessageDialog(null,
										"Congragulations, You found the Pike of Arthur");// Put
						// in
						// message
						// for
						// item
						// or
						// quest
						treasure.put("Pike", 2);
						pike = false;
					}
					cordY = 768;
				} else if ((cordY == 832) && ((cordX >= 768) && (cordX <= 832)))
				{
					cordY = 832;
				} else if ((cordY == 512) && ((cordX >= 0) && (cordX < 64)))
				{
					cordY = 512;
				} else if ((cordY == 512) && ((cordX > 832) && (cordX <= 960)))
				{
					cordY = 512;
				} else if ((cordY >= 896) && ((cordX >= 384) && (cordX <= 512)))
				{
					RoomCount++;
					vel2 = vel2 + 2;
					cordY = 0;
					position = 1;
					setTitle("Room 1");
					loadImages("Room1.png");
				} else
				{

					cordY += vel;
				}
			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");

				if ((cordY == 512) && ((cordX > 384) && (cordX <= 512)))// Room
				// 2
				// Bound
				// 1
				{
					if (equipSword)
					{
						JOptionPane
								.showMessageDialog(null,
										"Congragulations, You found the Sword of Orion");// Put
						// in
						// message
						// for
						// item
						// or
						// quest
						treasure.put("Sword", 3);
						equipSword = false;
					}
					cordY = 512;
				} else if ((cordY == 384) && ((cordX >= 0) && (cordX < 64)))
				{
					cordY = 384;
				} else if ((cordY == 384) && ((cordX > 832) && (cordX <= 960)))
				{
					cordY = 384;
				} else if ((cordY == 128) && ((cordX > 128) && (cordX < 256)))
				{
					if (shield)
					{
						JOptionPane
								.showMessageDialog(null,
										"Congragulations, You found the Shield of Zeus");// Put
						// in
						// message
						// for
						// item
						// or
						// quest
						treasure.put("Shield", 4);
						shield = false;
					}
					cordY = 128;
				} else if ((cordY == 128) && ((cordX > 640) && (cordX < 768)))
				{
					if (sabatons)
					{
						JOptionPane
								.showMessageDialog(null,
										"Congragulations, You found the Sabatons of Napolean");// Put
						// in
						// message
						// for
						// item
						// or
						// quest
						treasure.put("Sabatons", 5);
						sabatons = false;
					}
					cordY = 128;
				} else if ((cordY == 64) && ((cordX >= 64) && (cordX <= 128)))
				{
					cordY = 64;
				} else if ((cordY == 64) && ((cordX > 512) && (cordX <= 640)))
				{
					cordY = 64;
				} else if ((cordY == 64) && ((cordX >= 768) && (cordX <= 832)))
				{
					cordY = 64;
				} else if ((cordY == 64) && ((cordX >= 256) && (cordX <= 384)))
				{
					cordY = 64;
				} else if ((cordY <= 64) && ((cordX >= 384) && (cordX <= 512)))
				{
					if (treasure.containsValue(1) && treasure.containsValue(2)
							&& treasure.containsValue(3)
							&& treasure.containsValue(4)
							&& treasure.containsValue(5))
					{
						cordY = 960;
						position = 10;
						setTitle("Room 10");
						loadImages("Room10.png");
					} else
					{
						JOptionPane
								.showMessageDialog(null,
										"Nice try, Explore the Dungeon and Collect all items before entering");
					}
				} else
				{

					cordY -= vel;
				}
			}
				break;
			}
		}
		repaint();

		// ***ROOM3***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 3)
		{
			vel = (vel2 - (4 * RoomCount));
			setTitle("Room 3");
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");

				if ((cordX == 960) && ((cordY >= 384) && (cordY <= 512)))
				{
					RoomCount++;
					vel2 = vel2 + 3;
					cordX = 0;
					position = 4;
					setTitle("Room 4");
					loadImages("Room4Final.PNG");
				} else
				{

					cordX += vel;
				}

			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");

				if ((cordX == 0) && ((cordY >= 384) && (cordY <= 512)))
				{
					cordX = 960;
					position = 2;
					setTitle("Room 2");
					loadImages("Room2Chest.PNG");
				} else
				{

					cordX -= vel;
				}
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");

				if ((cordY == 512) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 512;
				} else
				{
					cordY += vel;
				}
			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");

				if ((cordY == 384) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 384;
				} else
				{
					cordY -= vel;
				}
			}
				break;
			}
		}
		repaint();

		// ***ROOM4***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 4)
		{
			vel = (vel2 - (4 * RoomCount));
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX >= 896) && ((cordY >= 128) && (cordY <= 192)))
				{
					RoomCount++;
					vel2 = vel2 + 4;
					cordX = 0;
					position = 5;
					setTitle("Room 5");
					loadImages("Room5.PNG");
				}

				else if ((cordX == 320) && ((cordY > 192) && (cordY <= 512)))
				{
					cordX = 320;
				} else
				{
					cordX += vel;
				}
			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");

				if ((cordX == 0) && ((cordY >= 384) && (cordY <= 512)))
				{
					cordX = 960;
					position = 3;
					setTitle("Room3");
					loadImages("Room3Decor.png");
				}

				else if ((cordX == 256) && ((cordY >= 128) && (cordY < 384)))
				{
					cordX = 256;
				} else
				{
					cordX -= vel;
				}
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 512) && ((cordX >= 0) && (cordX <= 320)))
				{
					cordY = 512;
				} else if ((cordY == 192) && ((cordX >= 384) && (cordX < 960)))
				{
					cordY = 192;
				} else
				{
					cordY += vel;
				}
			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");

				if ((cordY == 384) && ((cordX >= 0) && (cordX < 256)))
				{
					cordY = 384;
				} else if ((cordY == 128) && ((cordX >= 256) && (cordX < 960)))
				{
					cordY = 128;
				} else
				{
					cordY -= vel;
				}
			}
				break;
			}

		}
		repaint();
		// ***ROOM5***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 5)
		{
			vel = (vel2 - (4 * RoomCount));
			// Change player position based on key press
			setTitle("Room 5");
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 512) && ((cordY >= 128) && (cordY <= 576)))
				{
					cordX = 512;

				}

				else if ((cordX == 128) && ((cordY >= 640) && (cordY < 704)))
				{
					cordX = 128;
				}

				else if ((cordX == 832) && ((cordY >= 0) && (cordY <= 704)))
				{
					cordX = 832;
				}

				else
				{

					cordX += vel;
				}
			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 448) && ((cordY > 256) && (cordY < 512)))
				{
					cordX = 448;
				} else if ((cordX == 128) && ((cordY >= 512) && (cordY <= 704)))
				{
					cordX = 128;
				}

				else if ((cordX == 768) && ((cordY >= 0) && (cordY < 704)))
				{
					cordX = 768;
				}

				else if ((cordX == 0) && ((cordY >= 128) && (cordY <= 256)))
				{
					cordX = 960;
					position = 4;
					setTitle("Room 4");
					loadImages("Room4Final.png");
				} else
				{

					cordX -= vel;
				}
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 192) && ((cordX >= 0) && (cordX < 448)))
				{
					cordY = 192;
				}

				else if ((cordY == 576) && ((cordX <= 512) && (cordX > 192)))
				{
					cordY = 576;
				}

				else if ((cordY == 704) && ((cordX >= 128) && (cordX <= 832)))
				{
					cordY = 704;
				} else
				{

					cordY += vel;
				}

			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY == 128) && ((cordX >= 0) && (cordX < 576)))
				{
					cordY = 128;
				}

				else if ((cordY == 512) && ((cordX > 128) && (cordX < 448)))
				{
					cordY = 512;
				}

				else if ((cordY == 704) && ((cordX >= 192) && (cordX <= 768)))
				{
					cordY = 704;
				}

				else if ((cordY == 0) && ((cordX >= 768) && (cordX <= 832)))
				{
					RoomCount++;
					vel2 = vel2 + 4;
					cordY = 896;
					position = 6;
					setTitle("Room 6");
					loadImages("Room6Chest.PNG");
				} else
				{

					cordY -= vel;
				}
			}
				break;

			}

		}
		repaint();

		// ***ROOM6***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 6)
		{
			vel = (vel2 - (4 * RoomCount));
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 832) && ((cordY <= 960) && (cordY >= 192)))// Room6
				// Bound2
				{
					cordX = 832;
				}

				else if ((cordX == 128) && ((cordY >= 64) && (cordY <= 128)))// Room6
				// Bound8
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY >= 64) && (cordY <= 128)))
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY >= 384) && (cordY <= 448)))
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 128;
				}

				else if ((cordX == 128) && ((cordY >= 832) && (cordY <= 896)))
				{
					cordX = 128;
				} else
				{

					cordX += vel;
				}
			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 256) && ((cordY >= 768) && (cordY <= 832)))
				{
					cordX = 256;
				} else if ((cordX == 512) && ((cordY >= 768) && (cordY <= 832)))
				{
					cordX = 512;
				} else if ((cordX == 768) && ((cordY >= 768) && (cordY <= 832)))
				{
					cordX = 768;
				} else if ((cordX == 256) && ((cordY >= 320) && (cordY <= 384)))
				{
					cordX = 256;
				} else if ((cordX == 512) && ((cordY >= 320) && (cordY <= 384)))
				{
					cordX = 512;
				} else if ((cordX == 768) && ((cordY >= 320) && (cordY <= 384)))
				{
					cordX = 768;
				} else if ((cordX == 256) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 256;
				} else if ((cordX == 512) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 512;
				} else if ((cordX == 768) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 768;
				} else if ((cordX == 256) && ((cordY >= 0) && (cordY <= 64)))
				{
					cordX = 256;
				} else if ((cordX == 512) && ((cordY >= 0) && (cordY <= 64)))
				{
					cordX = 512;
				} else if ((cordX == 768) && ((cordY >= 0) && (cordY <= 64)))
				{
					cordX = 768;
				} else if ((cordX == 768) && ((cordY >= 448) && (cordY <= 512)))
				{
					cordX = 768;
				} else if ((cordX == 128) && ((cordY <= 192) && (cordY >= 704)))// Room6
				// Bound6
				{
					cordX = 128;
				}

				else if ((cordX <= 64) && ((cordY >= 64) && (cordY <= 192)))
				{
					RoomCount++;
					vel2 = vel2 + 4;
					cordX = 890;
					position = 7;
					setTitle("Room 7");
					loadImages("Room7Bridge.png");
				} else
				{

					cordX -= vel;
				}

			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 832) && ((cordX >= 64) && (cordX <= 182)))
				{
					cordY = 832;
				}

				else if ((cordY == 768) && ((cordX >= 182) && (cordX <= 256)))
				{
					cordY = 768;
				} else if ((cordY == 832) && ((cordX >= 256) && (cordX <= 448)))
				{
					cordY = 832;
				} else if ((cordY == 768) && ((cordX >= 448) && (cordX <= 512)))
				{
					cordY = 768;
				} else if ((cordY == 832) && ((cordX >= 512) && (cordX <= 704)))
				{
					cordY = 832;
				} else if ((cordY == 768) && ((cordX >= 704) && (cordX <= 768)))
				{
					cordY = 768;
				} else if ((cordY == 320) && ((cordX >= 182) && (cordX <= 256)))
				{
					cordY = 320;
				} else if ((cordY == 384) && ((cordX >= 256) && (cordX <= 448)))
				{
					cordY = 384;
				} else if ((cordY == 320) && ((cordX >= 448) && (cordX <= 512)))
				{
					cordY = 320;
				} else if ((cordY == 384) && ((cordX >= 512) && (cordX <= 704)))
				{
					cordY = 384;
				} else if ((cordY == 320) && ((cordX >= 704) && (cordX <= 768)))
				{
					cordY = 320;
				} else if ((cordY == 896) && ((cordX >= 768) && (cordX <= 852)))// Room6
				// to
				// Room5
				{
					cordY = 0;
					position = 5;
					setTitle("Room 5");
					loadImages("Room5.PNG");
				} else
				{

					cordY += vel;
				}

			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY == 576) && ((cordX >= 182) && (cordX <= 256)))
				{
					cordY = 576;
				} else if ((cordY == 512) && ((cordX >= 256) && (cordX <= 448)))
				{
					cordY = 512;
				} else if ((cordY == 576) && ((cordX >= 448) && (cordX <= 512)))
				{
					cordY = 576;
				} else if ((cordY == 512) && ((cordX >= 512) && (cordX <= 704)))
				{
					cordY = 512;
				} else if ((cordY == 576) && ((cordX >= 256) && (cordX <= 448)))
				{
					cordY = 576;
				} else if ((cordY == 64) && ((cordX >= 0) && (cordX < 768)))
				{
					cordY = 64;
				} else
				{

					cordY -= vel;
				}

			}
				break;

			}
		}
		repaint();

		// ***ROOM7***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 7)
		{
			vel = (vel2 - (4 * RoomCount));
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");

				if ((cordX == 960) && ((cordY >= 64) && (cordY <= 192)))
				{
					cordX = 0;
					position = 6;
					setTitle("Room 6");
					loadImages("Room6Chest.png");
				} else if ((cordX == 832) && ((cordY > 128) && (cordY <= 832)))
				{
					cordX = 832;
				} else if ((cordX == 64) && ((cordY >= 64) && (cordY < 320)))
				{
					cordX = 64;
				} else if ((cordX == 64) && ((cordY > 576) && (cordY <= 832)))
				{
					cordX = 64;
				} else
				{
					cordX += vel;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");

				if ((cordX <= 0) && ((cordY >= 64) && (cordY <= 192)))
				{
					RoomCount++;
					vel2 = vel2 + 7;
					cordX = 890;
					position = 8;
					setTitle("Room 8");
					loadImages("Room8.png");
				} else if ((cordX <= 0) && ((cordY >= 768) && (cordY <= 832)))
				{
					RoomCount++;
					vel2 = vel2 + 7;
					cordX = 890;
					position = 8;
					setTitle("Room 8");
					loadImages("Room8.png");
				} else if ((cordX == 832) && ((cordY >= 64) && (cordY < 320)))
				{
					cordX = 832;
				}

				else if ((cordX == 832) && ((cordY > 576) && (cordY <= 832)))
				{
					cordX = 832;
				} else if ((cordX == 64) && ((cordY > 128) && (cordY < 768)))
				{
					cordX = 64;
				} else
				{
					cordX -= vel;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 576) && ((cordX > 64) && (cordX < 832)))
				{
					cordY = 576;
				} else if ((cordY == 128) && ((cordX >= 0) && (cordX < 64)))
				{
					cordY = 128;
				}

				else if ((cordY == 832) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 832;
				} else
				{
					cordY += vel;
				}
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY == 64) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 64;
				} else if ((cordY == 320) && ((cordX > 64) && (cordX < 832)))
				{
					cordY = 320;
				}

				else if ((cordY == 768) && ((cordX >= 0) && (cordX < 64)))
				{
					cordY = 768;
				} else
				{
					cordY -= vel;
				}
			}
			break;
			}
		}
		repaint();

		// ***ROOM8***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 8)
		{
			vel = (vel2 - (4 * RoomCount));
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 832) && ((cordY > 128) && (cordY < 768)))
				{
					cordX = 832;
				} else if ((cordX == 576) && ((cordY >= 0) && (cordY < 320)))
				{
					cordX = 576;
				} else
				{
					cordX += 4;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 704) && ((cordY >= 64) && (cordY < 320)))
				{
					cordX = 704;
				} else if ((cordX == 704) && ((cordY > 576) && (cordY <= 832)))
				{
					cordX = 704;
				}

				else if ((cordX == 320) && ((cordY >= 0) && (cordY <= 576)))
				{
					cordX = 320;
				} else
				{
					cordX -= 4;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 128) && ((cordX > 832) && (cordX < 960)))
				{
					cordY = 128;
				} else if ((cordY == 832) && ((cordX >= 704) && (cordX <= 960)))
				{
					cordY = 832;
				} else if ((cordY == 576) && ((cordX >= 320) && (cordX < 704)))
				{
					cordY = 576;
				} else
				{
					cordY += 4;
				}
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");

				if ((cordY == 0) && ((cordX >= 320) && (cordX <= 640)))
				{
					RoomCount++;
					vel2 = vel2 + 8;
					cordY = 890;
					position = 9;
					setTitle("Room 9");
					loadImages("Room9Decor.png");
				} else if ((cordY == 64) && ((cordX >= 704) && (cordX <= 960)))
				{
					cordY = 64;
				} else if ((cordY == 320) && ((cordX > 576) && (cordX < 704)))
				{
					cordY = 320;
				} else if ((cordY == 768) && ((cordX > 832) && (cordX <= 960)))
				{
					cordY = 768;
				} else
				{
					cordY -= 4;
				}
			}
			break;

			}
		}
		repaint();

		// ***ROOM9***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 9)
		{
			vel = (vel2 - (4 * RoomCount));
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				cordX += 4;
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				cordX -= 4;
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				if ((cordY == 960) && ((cordX >= 320) && (cordX <= 640)))
				{
					cordY = 0;
					position = 8;
					setTitle("Room 8");
					loadImages("Room8.png");
				}

				else
				{
					cordY += 4;
				}
			}
			break;

			case KeyEvent.VK_UP:
			{
				cordY -= 4;
			}
			break;
			}
		}
		repaint();

		// ***ROOM10***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 10)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 512) && ((cordY >= 0) && (cordY <= 960)))
				{
					cordX = 512;
				} else
				{
					cordX += 4;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 384) && ((cordY >= 0) && (cordY <= 960)))
				{
					cordX = 384;
				} else
				{
					cordX -= 4;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				cordY += 4;
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY <= 0) && ((cordX >= 384) && (cordX <= 576)))
				{
					cordY = 960;
					position = 11;
					setTitle("Room 11");
					loadImages("Room11Decor.png");
				} else
				{
					cordY -= 4;
				}
			}
			break;
			}
		}
		repaint();

		// ***ROOM11***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 11)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 512) && ((cordY >= 0) && (cordY <= 960)))
				{
					cordX = 512;
				} else
				{
					cordX += 4;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 384) && ((cordY >= 0) && (cordY <= 960)))
				{
					cordX = 384;
				} else
				{
					cordX -= 4;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				cordY += 4;
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY <= 0) && ((cordX >= 384) && (cordX <= 576)))
				{
					cordY = 960;
					position = 14;
					setTitle("Room 14");
					loadImages("Room14Decor.png");
				} else
				{
					cordY -= 4;
				}
			}
			break;
			}
		}
		repaint();

		// ***ROOM12***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 12)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");

				if ((cordX >= 960) && ((cordY >= 384) && (cordY <= 512)))
				{
					cordX = 0;
					position = 2;
					setTitle("Room 2");
					loadImages("Room2Chest.PNG");
				} else
				{

					cordX += vel;
				}

			}
				break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");

				if ((cordX <= 0) && ((cordY >= 384) && (cordY <= 512)))
				{
					cordX = 960;
					position = 13;
					setTitle("Room 13");
					loadImages("Room13.PNG");
				} else
				{

					cordX -= vel;
				}
			}
				break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");

				if ((cordY == 512) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 512;
				} else
				{
					cordY += vel;
				}
			}
				break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");

				if ((cordY == 384) && ((cordX >= 0) && (cordX <= 960)))
				{
					cordY = 384;
				} else
				{
					cordY -= vel;
				}
			}
				break;
			}
		}
		repaint();

		// ***ROOM13***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 13)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 256) && ((cordY >= 512) && (cordY <= 832)))
				{
					cordX = 256;
				}

				else if ((cordX == 512) && ((cordY >= 0) && (cordY <= 320)))
				{
					cordX = 512;
				} else if ((cordX == 256) && ((cordY >= 256) && (cordY <= 384)))
				{
					cordX = 256;
				} else
				{
					cordX += 4;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 128) && ((cordY >= 128) && (cordY <= 768)))
				{
					cordX = 128;
				} else if ((cordX == 384) && ((cordY >= 0) && (cordY <= 128)))
				{
					cordX = 384;
				} else
				{
					cordX -= 4;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 512) && ((cordX >= 256) && (cordX <= 960)))
				{
					cordY = 512;
				} else if ((cordY == 704) && ((cordX >= 64) && (cordX <= 320)))
				{
					cordY = 704;
				} else if ((cordY == 256) && ((cordX >= 256) && (cordX <= 576)))
				{
					cordY = 256;
				} else
				{
					cordY += 4;
				}
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY <= 0) && ((cordX >= 384) && (cordX <= 576)))
				{
					cordY = 890;
					position = 15;
					setTitle("Room 15");
					loadImages("Room15Chest.png");
				} else if ((cordY == 384) && ((cordX >= 256) && (cordX <= 960)))
				{
					cordY = 384;
				} else if ((cordY == 128) && ((cordX >= 64) && (cordX <= 384)))
				{
					cordY = 128;
				} else
				{
					cordY -= 4;
				}
			}
			break;
			}
		}
		repaint();

		// ***ROOM14***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 14)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				cordX += 4;
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				cordX -= 4;
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				cordY += 4;
			}
			break;

			case KeyEvent.VK_UP:
			{
				cordY -= 4;
			}
			break;
			}
		}
		repaint();

		// ***ROOM15***////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (position == 15)
		{
			switch (ke.getKeyCode())
			{
			case KeyEvent.VK_RIGHT:
			{
				temp = new ImageIcon("PLayerRight.gif");
				if ((cordX == 512) && ((cordY > 640) && (cordY <= 960)))
				{
					cordX = 512;
				}

				else if ((cordX == 512) && ((cordY >= 384) && (cordY < 640)))
				{
					cordX = 512;
				}

				else if ((cordX == 768) && ((cordY >= 512) && (cordY <= 704)))
				{
					cordX = 768;
				} else if ((cordX == 640) && ((cordY >= 512) && (cordY <= 576)))
				{
					cordX = 640;
				} else if ((cordX == 448) && ((cordY >= 256) && (cordY <= 448)))
				{
					cordX = 448;
				} else if ((cordX == 512) && ((cordY >= 192) && (cordY <= 256)))
				{
					cordX = 512;
				} else if ((cordX == 448) && ((cordY >= 64) && (cordY <= 128)))
				{
					cordX = 448;
				} else if ((cordX == 640) && ((cordY >= 64) && (cordY <= 320)))
				{
					cordX = 640;
				} else if ((cordX == 320) && ((cordY >= 64) && (cordY <= 128)))
				{
					cordX = 320;
				} else if ((cordX == 256) && ((cordY >= 192) && (cordY <= 256)))
				{
					cordX = 256;
				} else if ((cordX == 128) && ((cordY >= 448) && (cordY <= 576)))
				{
					cordX = 128;
				} else if ((cordX == 256) && ((cordY >= 448) && (cordY < 640)))
				{
					cordX = 256;
				} else
				{
					cordX += 4;
				}
			}
			break;

			case KeyEvent.VK_LEFT:
			{
				temp = new ImageIcon("PLayerLeft.gif");
				if ((cordX == 384) && ((cordY > 640) && (cordY <= 960)))
				{
					cordX = 384;
				} else if ((cordX == 384) && ((cordY >= 384) && (cordY < 640)))
				{
					cordX = 384;
				} else if ((cordX == 448) && ((cordY >= 256) && (cordY <= 448)))
				{
					cordX = 448;
				} else if ((cordX == 128) && ((cordY >= 448) && (cordY <= 704)))
				{
					cordX = 128;
				} else if ((cordX == 256) && ((cordY >= 448) && (cordY <= 576)))
				{
					cordX = 256;
				} else if ((cordX == 640) && ((cordY >= 448) && (cordY < 640)))
				{
					cordX = 640;
				} else if ((cordX == 768) && ((cordY >= 448) && (cordY <= 576)))
				{
					cordX = 768;
				} else if ((cordX == 256) && ((cordY >= 64) && (cordY <= 320)))
				{
					cordX = 256;
				} else if ((cordX == 384) && ((cordY >= 192) && (cordY <= 256)))
				{
					cordX = 384;
				} else if ((cordX == 448) && ((cordY >= 64) && (cordY <= 128)))
				{
					cordX = 448;
				} else if ((cordX == 576) && ((cordY >= 64) && (cordY <= 128)))
				{
					cordX = 576;
				} else if ((cordX == 640) && ((cordY >= 192) && (cordY <= 256)))
				{
					cordX = 640;
				} else
				{
					cordX -= 4;
				}
			}
			break;

			case KeyEvent.VK_DOWN:
			{
				temp = new ImageIcon("PLayerDown.gif");
				if ((cordY == 640) && ((cordX >= 64) && (cordX <= 384)))
				{
					cordY = 640;
				} else if ((cordY == 640) && ((cordX >= 512) && (cordY <= 832)))
				{
					cordY = 640;
				} else if ((cordY == 256) && ((cordX >= 0) && (cordX < 448)))
				{
					cordY = 256;
				}

				else if ((cordY == 256) && ((cordX > 448) && (cordX < 960)))
				{
					cordY = 256;
				} else if ((cordY == 192) && ((cordX > 256) && (cordX < 384)))
				{
					cordY = 192;
				} else if ((cordY == 192) && ((cordX > 512) && (cordX < 640)))
				{
					cordY = 192;
				} else
				{
					cordY += 4;
				}
			}
			break;

			case KeyEvent.VK_UP:
			{
				temp = new ImageIcon("PLayerUp.gif");
				if ((cordY == 512) && ((cordX >= 0) && (cordX < 320)))
				{
					cordY = 512;
				} else if ((cordY == 512) && ((cordX >= 640) && (cordX <= 969)))
				{
					cordY = 512;
				} else if ((cordY == 576) && ((cordX > 128) && (cordX < 256)))
				{
					cordY = 576;
				} else if ((cordY == 576) && ((cordX > 640) && (cordX < 768)))
				{
					cordY = 576;
				} else if ((cordY == 640) && ((cordX > 256) && (cordX < 384)))
				{
					cordY = 640;
				} else if ((cordY == 640) && ((cordX > 512) && (cordX < 640)))
				{
					cordY = 640;
				} else if ((cordY == 448) && ((cordX >= 384) && (cordX < 448)))
				{
					cordY = 448;
				} else if ((cordY == 448) && ((cordX > 448) && (cordX <= 512)))
				{
					cordY = 448;
				} else if ((cordY == 64) && ((cordX >= 0) && (cordX < 960)))
				{
					cordY = 64;
				} else if ((cordY == 128) && ((cordX > 256) && (cordX < 448)))
				{
					cordY = 128;
				} else if ((cordY == 128) && ((cordX > 448) && (cordX < 576)))
				{
					cordY = 128;
				} else
				{
					cordY -= 4;
				}
			}
			break;
			}
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent ke)
	{
	}

	@Override
	public void keyTyped(KeyEvent ke)
	{
	}

	public void loadImages(String pictureName)
	{
		try
		{
			background = ImageIO.read(new File(pictureName));
			temp = new ImageIcon("PlayerStart.gif");
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}

		addKeyListener(this);
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2 = null;
		if (myBuffer != null)
		{
			try
			{
				g2 = (Graphics2D) myBuffer.getDrawGraphics();
				drawImages(g2);
			} finally
			{
				g2.dispose();
			}
			myBuffer.show();
		}
	}
}
