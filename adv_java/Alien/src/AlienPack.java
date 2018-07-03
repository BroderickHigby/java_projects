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
}