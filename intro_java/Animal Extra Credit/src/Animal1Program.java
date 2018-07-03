/*Programmer: Broderick Higby
 *Program: AnimalProgram
 *Date: 7 May 2015
 *Description: This is the original program that is minimum required of the assignment, it uses the AnimalBase a
*/

public class Animal1Program //Start of class

{

	public static void main(String[] args) //Start of main method

	{
		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Dog1 myDog = new Dog1("Rover", 4, "Urban"); 

		//These statements pull from the base class to output the Animals' information
		System.out.println("The Dog's name is " + myDog.getName() + ". " + "He has " + myDog.getLegs() + " legs");

		System.out.println("The Dog says " + myDog.getHello() + " ");

		System.out.println("Carnivorous? " + myDog.isCarnivorous());

		System.out.println("Mammal? " + myDog.isAMammal());

		System.out.println("This animal lives in a " + myDog.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myDog.GoodPet());

		
		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Cat1 myCat = new Cat1("Ketty", 4, "Urban");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Cat's name is " + myCat.getName() + ". " + "She has " + myCat.getLegs() + " legs");

		System.out.println("The Cat says " + myCat.getHello() + " ");

		System.out.println("Carnivorous? " + myCat.isCarnivorous());

		System.out.println("Mammal? " + myCat.isAMammal());

		System.out.println("This animal lives in a " + myCat.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myCat.GoodPet());

		

		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Duck1 myDuck = new Duck1("Daffy", 2, "Wetland");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Duck's name is " + myDuck.getName() + ". " + "He has " + myDuck.getLegs() + " legs");

		System.out.println("The Duck says " + myDuck.getHello() + " ");

		System.out.println("Carnivorous? " + myDuck.isCarnivorous());

		System.out.println("Mammal? " + myDuck.isAMammal());

		System.out.println("This animal lives in a " + myDuck.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myDuck.GoodPet());

		

		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Sheep1 mySheep = new Sheep1("Wooly", 4, "Pastorial");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Sheep's name is " + mySheep.getName() + ". " + "He has " + mySheep.getLegs() + " legs");

		System.out.println("The Sheep says " + mySheep.getHello() + " ");

		System.out.println("Carnivorous? " + mySheep.isCarnivorous());

		System.out.println("Mammal? " + mySheep.isAMammal());

		System.out.println("This animal lives in a " + mySheep.getBiome() + " Environment");

		System.out.println("Companion worthy? " + mySheep.GoodPet());

		

		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Frog1 myFrog = new Frog1("Kermit", 4, "Rainforest");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Frog's name is " + myFrog.getName() + ". " + "He has " + myFrog.getLegs() + " legs");

		System.out.println("The Frog says " + myFrog.getHello() + " ");

		System.out.println("Carnivorous? " + myFrog.isCarnivorous());

		System.out.println("Mammal? " + myFrog.notAMammal());

		System.out.println("This animal lives in a " + myFrog.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myFrog.GoodPet());

		

		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Eagle1 myEagle = new Eagle1("Justice", 2, "Evergreen");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Eagle's name is " + myEagle.getName() + ". " + "He has " + myEagle.getLegs() + " legs");

		System.out.println("The Eagle says " + myEagle.getHello() + " ");

		System.out.println("Carnivorous? " + myEagle.isCarnivorous());

		System.out.println("Mammal? " + myEagle.notAMammal());

		System.out.println("This animal lives in a " + myEagle.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myEagle.BadPet());

		
		//This constructor creates instance  of animal to be called in the menu class, and passes name and environment
		Fox1 myFox = new Fox1("Foxy", 2, "Forest");

		//These statements pull from the base class to output the Animals' information
		System.out.println("\nThe Fox's name is " + myFox.getName() + ". " + "He has " + myFox.getLegs() + " legs");

		System.out.println("The Fox says " + myFox.getHello() + " ");

		System.out.println("Carnivorous? " + myFox.isCarnivorous());

		System.out.println("Mammal? " + myFox.notAMammal());

		System.out.println("This animal lives in a " + myFox.getBiome() + " Environment");

		System.out.println("Companion worthy? " + myFox.BadPet());

	}

}

