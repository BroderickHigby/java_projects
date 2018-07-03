

public class Bead
{
	//variables
	private static int numberOfBeads = 0;
	private char beadSize; //s for small, m for medium, l for large
	private String color;
	
	//constructors
	Bead()
	{
		beadSize = 'm';
		color = "black";
		numberOfBeads++;
	}
	Bead(char size, String theColor)
	{
		beadSize = size;
		color = theColor;
		numberOfBeads++;
	}
	
	//methods
	public int getNumberOfBeads()
	{
		return numberOfBeads;
	}
	public char getBeadSize()
	{
		return beadSize;
	}
	public String getColor()
	{
		return color;
	}
	
	public void setBeadSize(char size)
	{
		beadSize = size;
	}
	public void setColor(String _color)
	{
		color = _color;
	}
	public String toString()
	{
		return("Bead has a size of "+beadSize+
		"\nBead has a color of "+color);
	}
	public boolean equals(Bead tempBead)
	{
		if(tempBead.getBeadSize() == this.getBeadSize()
		&&tempBead.getColor() == this.getColor())
		{
			return true;
		}
		return false;
	}
}