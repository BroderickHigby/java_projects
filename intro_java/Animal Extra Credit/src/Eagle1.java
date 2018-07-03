/*Programmer: Broderick Higby
 * Program: Eagle1
 * Date: 7 May 2015
 * Description: This eagle class gives specific info for the AnimalMenu and Animal1Program classes to use working w/ AnimalBase
 */

public class Eagle1 extends AnimalBase
{
	//This is the awesome Eagle class that extends the AnimalBase and is called by AnimalMenu and Animal1Program
	public Eagle1(String name, int legs, String Environment)
	{
		
		super(name, legs, Environment);
	}
	//getHello returns the animal sound, this is the only real specific thing that can't be identified within the base class	
	public String getHello() 
	{
		return "Eaaaaaaaaaaaahhhhh"; //Returns the Eagles sound; which is the sound of American freedom ringing

	}
	
}