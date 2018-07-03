/*-----------------------------------------------------
 *Program: GradeBookDemo
 *Programmer: Broderick Higby
 *Date: 4/16/2015
 *Description: This display will call and utilize the 
 *methods we have created for the GradeBook file. This
 *demo file will allow the user to enter the number of
 *students and the number of quizzes and it will take 
 *the scores and display several averages in correspondance
 *to the number of students and quizzes.
 *-----------------------------------------------------*/
 
 //public class name
 public class GradeBookDemo
 {
 	//main method 
 	public static void main(String[] args)
 	{
 	//calling the array for GradeBook
  	GradeBook book = new GradeBook();
  	
  	//calling the book.display
 	book.display();
 	
 	} //end of public method
 	
 } //end of public class