 import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

 
 public class HomeworkTester 
 {
 	public static void main(String[] args)
 	{
 		ArrayList<Homework> homeworkList = new ArrayList<Homework>();
 		Scanner keyboard = new Scanner(System.in);
 		boolean loop = true;
 		int choice;
 		//Calendar calendar = new Calendar();
 		String option;
 		
 		while(loop)
 		{
 			System.out.println("Add Assignment(1) - Remove Assignment(2) - List Assignments In Order(3) - Earliest Due Date(4) - Exit(5)");
 			choice = keyboard.nextInt();
 			keyboard.nextLine();
 			
 			if(choice == 1)
 			{
 				String assignment;
 				String date;
 				Homework temp;
            
 				System.out.println("Enter Assignment Name");
 				assignment = keyboard.nextLine();
 				System.out.println("Enter Due Date");
 				date = keyboard.nextLine();
        
 				temp = new Homework(assignment, date);
 				homeworkList.add(temp);
 				
 			}
 			else if(choice == 2)
 			{
 				String assignment;
 				System.out.println("Enter the assignment you want to remove from the list");
 				assignment = keyboard.nextLine();
 				for(int i = 0;i < homeworkList.size(); i++)
 				{
 					if(homeworkList.get(i).getAssignment().contains(assignment))
 					{
 						String yOrN;
 						
 						System.out.println("Do you want to remove " + homeworkList.get(i).getAssignment() + " from the list?");
 						yOrN = keyboard.nextLine();
 						if(yOrN.charAt(0) == 'Y' || yOrN.charAt(0) == 'y')
 					{
 						homeworkList.remove(i);
 					}
 						else
 						{
 							System.out.println("The assignment " + homeworkList.get(i).getAssignment() + " was not removed");
 						}
 					}
 				}
 			
 			}
 			else if(choice == 3)
 			{
 
 				for(int i = 0; i <homeworkList.size(); i++)
 				{
 					System.out.println(homeworkList.get(i));
 				}
 			}
 			else if(choice == 4)
 			{
 				Homework earlier = homeworkList.get(0);
 				for(int i = 0; i<homeworkList.size(); i++)
 				{
 					if(earlier.comparedTo(homeworkList.get(i)))
 					{
 						earlier = homeworkList.get(i);
 					}
 					
 				}
 				System.out.println("The earliest homework assignment is due " + earlier.getDate());
 			}
 			
 			else if(choice == 5)
 			{
 				loop = false;
 			}
 			

 		}
 		System.out.println("Good-bye!");
 	}
 }