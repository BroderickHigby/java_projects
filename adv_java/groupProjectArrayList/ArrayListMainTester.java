//

import java.util.*;

public class ArrayListMainTester
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Bead> bracelet = new ArrayList<Bead>();
		Bead element1 = new Bead('m',"Red");
		Bead element2 = new Bead('s',"Death-Black");
		
		System.out.println("Adding 10 elements");
		bracelet.add(element1);
		bracelet.add(new Bead('s',"Blue"));
		bracelet.add(new Bead('l',"Rasberry"));
		bracelet.add(new Bead('s',"Crimson"));
		bracelet.add(new Bead('l',"Salmon"));
		bracelet.add(new Bead('m',"Burgandy"));
		bracelet.add(new Bead('m',"Cyan"));
		bracelet.add(new Bead('l',"Magenta"));
		bracelet.add(new Bead('l',"Rose-Gold"));//1
		bracelet.add(2,new Bead('m',"Purple"));//2
		
		System.out.println("\nToString method being called");
		printSize(bracelet);
		System.out.println("\nRemoving index 3");
		bracelet.remove(3);//4
		System.out.println("\nToString method being called");
		printSize(bracelet);
		
		System.out.println("\nSetting index two to new Bead object");
		bracelet.set(2,new Bead('s',"Pine-Green"));//5
		
		System.out.println("Getting index of 4");
		System.out.println(bracelet.get(4));//6
		
		System.out.println();
		System.out.println("It is "+bracelet.contains(element1)+" that Bracelet contains element1");//7
		System.out.println("It is "+bracelet.contains(element2)+" that Bracelet contains element2");
		
		System.out.println();
		bracelet.add(element2);
		System.out.println("Adding element 2\n");
		
		System.out.println("Element2 is at index "+bracelet.indexOf(element2));//8
		
		System.out.println("\nThis list is empty: "+bracelet.isEmpty());//9
		
		System.out.println("\nClearing List");
		bracelet.clear();//11
		printSize(bracelet);
		
	}
	public static void printSize(ArrayList<Bead> temp)
	{
		System.out.println("\nCurrent Size of array is "+temp.size());//3
	}
}