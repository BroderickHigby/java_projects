/*Programmer: Broderick Higby
 * Program: AnimalMenu
 * Date: 7 May 2015
 * Description: This is the demo class for all the Animal classes and prompts users for options on which animal
 * they want to know about
 */

import javax.swing.*; //Needed for the JOptionPane

public class AnimalMenu //Start of class
{
	public static void main(String[] args) //Start of method 
	{
		
		int choice; //choice as a variable outside the do-while is used for exiting the program 
		String window = ""; //window variable holds the input for JOptionPane
		
		do 
		{
			//Prompts user to make a selection
			window = JOptionPane.showInputDialog("\tAnimal Menu" + "\n\nPlease choose an animal" + "\n1. Dog" + "\n2. Eagle" 
						+ "\n3. Frog" + "\n4. Sheep" + "\n5. Duck" + "\n6. Cat" 
						+ "\n7. Fox" + "\n8. End the Program" + "\nEnter numerical selection below");
			//The input from window is called here and choice as an Integer that parses and sends it into the loop
			choice = Integer.parseInt(window); 

			switch (choice) //runs users selection
			{
				case 1: 
				{					
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Dog1 myDog = new Dog1("Rover", 4, "Urban"); 
					//Displays the characteristics of the animal
					JOptionPane.showMessageDialog(null,"The Dog's name is " + myDog.getName() + ". \n" + "\nHe has " + myDog.getLegs() + " legs"
							+ "\nThe Dog says " + myDog.getHello() + " " + "\nCarnivorous? " + myDog.isCarnivorous() + "\nMammal? " + myDog.isAMammal()
							+ "\nThis animal lives in a " + myDog.getBiome() + "Environment" + "\nCompanion worthy? " + myDog.GoodPet());
					break;
				}
		
				case 2:
				{
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Eagle1 myEagle = new Eagle1("Freedom", 2, "Evergreen");
					
					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null, "\nThe Eagle's name is " + myEagle.getName() + ". " + "\nHe has " + myEagle.getLegs() + " legs"
							+ "\nThe Eagle says " + myEagle.getHello() + " " + "\nMammal? " + myEagle.notAMammal() 
							+ "\nThis animal lives in a " + myEagle.getBiome() + "Environment" + "\nCompanion worthy? " + myEagle.BadPet());
					break;
				}
		
				case 3:
				{
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Frog1 myFrog = new Frog1("Kermit", 4, "Rainforest");

					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null, "\nThe Frog's name is " + myFrog.getName() + ". " + "\nHe has " + myFrog.getLegs() + " legs" 
							+ "\nThe Frog says " + myFrog.getHello() + " " + "\nCarnivorous? " + myFrog.isCarnivorous() 
							+ "\nMammal? " + myFrog.notAMammal() + "\nThis animal lives in a " + myFrog.getBiome() + " Environment" 
							+ "\nCompanion worthy? " + myFrog.GoodPet());
					break;
				}
	
				case 4:
				{
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Sheep1 mySheep = new Sheep1("Wooly", 4, "Pastorial");
		
					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null, "\nThe Sheep's name is " + mySheep.getName() + ". " + "\nHe has " + mySheep.getLegs() + " legs"	
							+ "\nThe Sheep says " + mySheep.getHello() + " " + "\nCarnivorous? " + mySheep.isCarnivorous() 
							+ "\nMammal? " + mySheep.isAMammal() + "\nThis animal lives in a " + mySheep.getBiome() + " Environment"
							+ "\nCompanion worthy? " + mySheep.GoodPet());
					break;
				}
			
				case 5:
				{
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Duck1 myDuck = new Duck1("Daffy", 2, "Wetland");
					
					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null,"\nThe Duck's name is " + myDuck.getName() + ". " + "\nHe has " + myDuck.getLegs() + " legs"
							+ "\nThe Duck says " + myDuck.getHello() + " " + "\nCarnivorous? " + myDuck.isCarnivorous()
							+ "\nMammal? " + myDuck.isAMammal() + "\nThis animal lives in a " + myDuck.getBiome() + " Environment"
							+ "\nCompanion worthy? " + myDuck.GoodPet());

					break;
				}
		
				case 6:
				{
					
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Cat1 myCat = new Cat1("Ketty", 4, "Urban");

					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null, "\nThe Cat's name is " + myCat.getName() + ". " + "\nShe has " + myCat.getLegs() + " legs"
							+ "\nThe Cat says " + myCat.getHello() + " " + "\nCarnivorous? " + myCat.isCarnivorous() 
							+ "\nMammal? " + myCat.isAMammal() + "\nThis animal lives in a " + myCat.getBiome() + " Environment"
							+ "\nCompanion worthy? " + myCat.GoodPet());
					break;
				}
				case 7:
				{
					
					//Constructs name that reflecting the class and is called within the JOptionPane message   
					Fox1 myFox = new Fox1("Foxy", 4, "Forest");

					//Displays the characteristics of the animal					
					JOptionPane.showMessageDialog(null, "\nThe Fox's name is " + myFox.getName() + ". " + "\nShe has " + myFox.getLegs() + " legs"
							+ "\nCarnivorous? " + myFox.isCarnivorous() 
							+ "\nMammal? " + myFox.isAMammal() + "\nThis animal lives in a " + myFox.getBiome() + " Environment"
							+ "\nCompanion worthy? " + myFox.BadPet());
					//An extra window displaying a message question  
					JOptionPane.showMessageDialog(null, "What Does The Fox Say?");
					//And the answer displayed calling from the parent class (This is from a song enitiled "What does the Fox say")
					JOptionPane.showMessageDialog(null,  myFox.getHello() + " " );
					
					break;	
				}			
				default:
				{
					if (choice >0 || 9 < choice)
					{
						JOptionPane.showMessageDialog(null, "Invalid entry!!! \nFatal error!!! \nprogram will now self-destruct!!!");
						System.exit(0);
					}
				}
			}

		}while (choice != 8); //while loop will end the program if user selects 8 
					JOptionPane.showMessageDialog(null, "Have a Good Day!");
					
		

	
	}//End of method
} //End of class
