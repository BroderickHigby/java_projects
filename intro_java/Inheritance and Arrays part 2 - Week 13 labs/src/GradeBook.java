/*---------------------------------------------------------
 *Program: GradeBook.java
 *Programmer: Broderick Higby
 *Date: 4/14/2015
 *Description: This display will demonstrate the use of a 
 *two dimensional array where the rows will be students,
 *and the columns will be the quizzes.
 *----------------------------------------------------------*/
 
 //imports the scanner
 import java.util.Scanner;
 
 //class name
 public class GradeBook
 {
 	//same as studentAverage.length
 	private int numberOfStudents;
 	
 	//same as quizAverage.length
 	private int numberOfQuizzes;
 	
 	//numberOfStudents rows and numberOfQuizzes columns
 	private int [] [] grade;
 	
 	//setting array to rows for students
 	private double[] studentAverage;
 	
 	//setting array to columns for quizzes
 	private double[] quizAverage;
 	
 	//public method statement for GradeBook
 	public GradeBook(int[] [] a)
 	{
 		//if statement for a.length
 		if (a.length == 0 || a[0].length == 0)
 		{
 			//will display the message if not grades are recorded
 			System.out.println("Empty grade records. Aborting.");
 			
 			//exit statement
 			System.exit(0);
 			
 		} //end if statement 
 		
 		//setting the length for numberOfStudents
 		numberOfStudents = a.length;
 		
 		//setting the length for numberOfQuizzes
 		numberOfQuizzes = a[0].length;
 		
 		//set fillGrade
 		fillGrade(a);
 		
 		//set fillStduentAverage
 		fillStudentAverage();
 		
 		//set fillQuizAverage
 		fillQuizAverage();
 		
 	} //end of public method statement
 	
 	//public method statement GradeBook book
 	public GradeBook(GradeBook book)
 	{
 		//declaring/setting variables
 		numberOfStudents = book.numberOfStudents;
 		numberOfQuizzes = book.numberOfQuizzes;
 		
 		//setting fillGrade to book.grade
 		fillGrade(book.grade);
 		
 		//setting fillStudentAverage
 		fillStudentAverage();
 		
 		//setting fillQuizAverage
 		fillQuizAverage(); 
 		
 	} //end of public method statement
 	
 	//public method statement GradeBook()
 	public GradeBook()
 	{
 		//Instantiating scanner
 		Scanner keyboard = new Scanner(System.in);
 		
 		//Display message/Prompt user for input
 		System.out.println("Enter number of students:");
 		
 		//scan keyboard input
 		numberOfStudents = keyboard.nextInt();
 		
 		//Display message/Prompt user for input
 		System.out.println("Enter number of quizzes:");
 		
 		//scan keyboard input
 		numberOfQuizzes = keyboard.nextInt();
 		
 		//set array for grade
 		grade = new int [numberOfStudents] [numberOfQuizzes];
 		
 		//for loop for the students
 		for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
 			
 			//for loop for the quizzes
 			for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 			{
 				
 				//display message for the studentNumber	
 				System.out.println("Enter score for student number " + studentNumber);
 				
 				//Display message for the quizNumber
 				System.out.println("on quiz number " + quizNumber);
 				
 				//scan keyboard for student and quiz
 				grade [studentNumber - 1] [quizNumber -1] = keyboard.nextInt();
 				
 			} //end of for loop
 		
 		//fill StudentAverage()
 		fillStudentAverage();
 		//fill QuizAverage()
 		fillQuizAverage();
 		
 	} //end of public method statement 
 	
 	//private method statement fillGrade
 	private void fillGrade(int [] [] a)
 	{
 		//set grade for two dimensioanl array
 		grade = new int [numberOfStudents] [numberOfQuizzes];
 		
 		//for loop
 		for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
 		{
 			//for loop
 			for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 				
 				//set two dimensional array for studentNumber quizNumber equal to a[studentNumber][quizNumber]
 				grade[studentNumber] [quizNumber] = a[studentNumber][quizNumber];
 		} //end of for loop
 		
 	} //end of private method statement
 	
 	//Fills the array studentAverage using the data from the array grade.
 	private void fillStudentAverage()
 	{
 		//set array studentAverage to numberOfStudents 
 		studentAverage = new double[numberOfStudents];
 		
 		//for loop
 		for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
 		{
 			
 			//process one student number
 			double sum = 0;
 			
 			//for loop
 			for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 				
 				//sum contains the sum of the quiz scores for student number
 				//studentNumber
 				sum = sum + grade[studentNumber - 1][quizNumber - 1];
 				
 				//average for student studentNumber is
 				//studentAverage[studentNumber - 1]
 				studentAverage[studentNumber - 1] = sum/numberOfQuizzes; 
 								
 		} //end of for loop
 		
 	} //end of private void method statement
 	
 	//Fills the arrat quizAverage using the data from the array grade.
 	private void fillQuizAverage()
 	{
 		//set array quizAverage for numberOfQuizzes
 		quizAverage = new double [numberOfQuizzes];
 		
 		//processes one quiz for all students
 		for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 		{	
 			//declare locale variable of sum equal to zero
 			double sum = 0;
 			
 			//for loop
 			for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
 				
 				//sum contains the sum of all student scores on quiz number
 				//quizNumber.
 				sum = sum + grade[studentNumber - 1][quizNumber - 1];
 				
 				//Average for quiz quizNumber is the value of
 				//quizAverage[quizNumber - 1] 
 				quizAverage[quizNumber - 1] = sum/numberOfStudents;
 		} //end of for loop
 		
 	} //end of private method statement
 	
 
 //public method statement for display()
 public void display()
 {
 	//for loop
 	for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
 	{
 		//displays the message to the user
 		System.out.print("Student " + studentNumber + " Quizzes: ");
 		
 		//for loop
 		for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 		
 		//display message of studentNumber and quizNumber
 		System.out.print(grade[studentNumber - 1][quizNumber -1] + " ");
 		
 		//display message to the user and the average
 		System.out.println(" Ave = " + studentAverage[studentNumber - 1]);
 		
 	} //end of for loop
 	
 	//display message
 	System.out.println("Quiz averages: ");
 	
 		//for loop
 		for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
 			
 			//display message of the quiz and average
 			System.out.print("Quiz " + quizNumber + " Ave = " + quizAverage[quizNumber - 1] + " ");
 			
 			//prints a blank line to make everything look nice and in order
 			System.out.println();
 } //end of public method statement
 
} //end of class GradeBook	