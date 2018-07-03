/* Course CS112    Days & Time: September 3, 2015
 * Chapter Number: 8    Project Number: 2
 * Programmer: Broderick Higby 
 * Program Title: Alien
 * Program Description: The alien file was rewritten to demonstrate the use of the abstract class when
 * 		there isn't a need to create an instance.
 */
public abstract class Alien 
{
	public static final int SNAKE_ALIEN = 0;
	public static final int OGRE_ALIEN = 1;
	public static final int MARSHMALLOW_MAN_ALIEN = 2;
	
	public int type; //Stores one of the three above types
	public int health; //0 = dead, 100 = full strength 
	public String name;
	
	public Alien (int type, int health, String name)
	{
		this.type = type;
		this.health = health;
		this.name = name;
	}
}

public class AlienPack
{
		private Alien[] aliens;
		
		public AlienPack (int numAliens)
		{
			aliens = new Alien[numAliens];
		}
		public void addAlien (Alien newAlien, int index)
		{
			aliens[index] = newAlien;
		}
		public Alien[] getAliens()
		{
			return aliens;
		}	


public abstract int calculateDamage();

}