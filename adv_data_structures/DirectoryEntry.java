//package edu.miracosta.Labs;


public class DirectoryEntry 
{

	private String name;
	private String number;
	
	public DirectoryEntry()
	{
		this.name = " ";
		this.number = " ";
	}
	
	public DirectoryEntry(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getNumber()
	{
		return this.number;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nNumber: " + number;
	}

}
