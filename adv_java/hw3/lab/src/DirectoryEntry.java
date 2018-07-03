
public class DirectoryEntry 
{
	String name;
	String number;
	
	
	public DirectoryEntry(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return this.number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return "Name: " + this.name + "\nNumber: " + this.number;
	}
}