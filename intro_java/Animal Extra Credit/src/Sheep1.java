/*Programmer: Broderick Higby
 * Program: Sheep1
 * Date: 7 May 2015
 * Description: This sheep class gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */

public class Sheep1 extends AnimalBase
//This is the awesome Sheep class that extends the AnimalBase and is called by AnimalMenu and Animal1Program
{

	public Sheep1(String name, int legs, String Environment)

	{

		super(name, legs, Environment); //This super class passes through name, legs, and environment

	}


	public boolean isCarnivorous()

	{

		return false;

	}

	
	//getHello returns the animal sound, this is one of the only things that can't be identified within the base class
	public String getHello()

	{

		return "Baa"; //Returns the sheeps sound; which is very sheepish


	}

	

}