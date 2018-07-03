package Person;

import java.io.*;
import java.util.*;
import java.io.File.*;

public class PersonDemo
{
   public static void main(String args[]) throws Exception
   {
    
    Scanner keyboard = new Scanner(System.in);
    String curMonth = null, bMonth = null, dMonth = null, name = null, outPut = null;
    int curDay = 0, curYear = 0, bDay=0, bYear = 0, dDay = 0, dYear = 0, stateOfPerson = 0;
    Date death = null;
    Date alive = null;
    File f = null;
    Person p1 = null;
    ObjectOutputStream outFile;
    
    while(true)
    {
        System.out.println("Would you like to create new file or manipulate old one?\n"
        +"-->Type 1: create\n"+ "-->Type 2: manipulate");
        stateOfPerson = keyboard.nextInt();
        keyboard.nextLine();
        if(stateOfPerson==1)
        {
            
            System.out.println("Please type in current date in the standard format"
            +"(i.e January 1 1999)\n");
    
            System.out.print("Month: "); 
            curMonth = keyboard.nextLine();
            System.out.println();
    
            System.out.print("Day: ");
            curDay = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println(); 
    
            System.out.print("Year: ");
            curYear = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();
    
    
            System.out.println("Please type in this persons name:");
            name = keyboard.nextLine();
            System.out.println(); 
    
            System.out.println("Please type in this persons birth date in same format as current date:" 
            +"(i.e January 1 1999)\n");
    
            System.out.print("Month: "); 
            bMonth = keyboard.nextLine();
            System.out.println();
    
            System.out.print("Day: ");
            bDay = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();
    
            System.out.print("Year: ");
            bYear = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println();       
    
            alive = new Date(bMonth, bDay, bYear);
            
            System.out.println("Is this person dead or alive?\n"
            +"-->Type 1: alive\n" + "-->Type 2: dead");
            stateOfPerson = keyboard.nextInt();
            keyboard.nextLine();
    
            if(stateOfPerson == 1)
            {
              p1 = new Person(name, alive, death);
            }
    
            else
            {
              System.out.println("PLease type in this persons death date");
 
              System.out.print("Month: "); 
              dMonth = keyboard.nextLine();
              System.out.println();
    
              System.out.print("Day: ");
              dDay = keyboard.nextInt();
              keyboard.nextLine();
              System.out.println();
    
              System.out.print("Year: ");
              dYear = keyboard.nextInt();
              keyboard.nextLine();
              death = new Date(dMonth, dDay, dYear);
     
              p1 = new Person(name, alive, death);
            }
    
            System.out.println("Please type in the fle name you want to create for this person data:");
            outPut = keyboard.nextLine();
            outFile = new ObjectOutputStream( new FileOutputStream(outPut));
            outFile.writeObject(p1);
            continue;
        }
        else
        {
            System.out.println("Please type in the file name you want to manipulate for this person data:");
            outPut = keyboard.nextLine();
            break;
        }
        
        
    
    }
    while(true){
     System.out.println("Would you like to add more to the file?\n"
     +"-->Type 1: yes add\n"+ "-->Type 2: no");
     stateOfPerson = keyboard.nextInt();
     keyboard.nextLine();
     if(stateOfPerson==1)
     {
         
         addOne(outPut);
         continue;
     }
     else
     {
         break;
     }
    } 
    
    
    
    while(true){
     System.out.println("Would you like to delete from the file?\n"
     +"-->Type 1: yes delete\n"+ "-->Type 2: no");
     stateOfPerson = keyboard.nextInt();
     keyboard.nextLine();
     if(stateOfPerson==1)
     {
         
         deletion(outPut);
         continue;
     }
     else
     {
         break;
     }
    } 
    
    while(true){
     System.out.println("Would you like to grab an age range from the file?\n"
     +"-->Type 1: yes range\n"+ "-->Type 2: no");
     stateOfPerson = keyboard.nextInt();
     keyboard.nextLine();
     if(stateOfPerson==1)
     {
         
         range(curYear, outPut);
         continue;
     }
     else
     {
         break;
     }
    } 
    
    
   }
   
   public static void range(int curYear, String file) throws Exception
   {
    Scanner keyboard = new Scanner(System.in);
    int range = 0; 
    System.out.println("Please time in the age range you are looking for: (i.e 20, 30, 40,...");
    range = keyboard.nextInt();
    Person [] p1;
    ObjectInputStream inputStream = null;
    int count = 1;
    try
    {
       // Reading until end of file
       while( true )
       {            
         Person tempObject = (Person) inputStream.readObject();
            
         count++;    // increment the counter
       }
         
    }
    catch(EOFException e)
    {
      System.out.println( "Finished reading all objects from file" );
      p1 = new Person[count];
    } 
    inputStream.close();
    
    
    inputStream = new ObjectInputStream( new FileInputStream(file));
    int counter = 0;
    try
    {
     while(true)
     {
      p1[counter] = (Person)inputStream.readObject();
      counter++;
     }
    }
    catch(EOFException e)
    {
      System.out.println( "Done" );
    }
    inputStream.close();
    System.out.println();
    
    for(int i =0; i<p1.length-1;i++)
    {
     int ageNow = 0;
     //ageNow = curYear-p1[i]r();
     if(ageNow<=range)
     {
       System.out.println(p1[i].getName()+ " is with in given range and is "+ageNow+" years old"); 
     }
    }
    
    
       
   }
   
   
   public static void addOne(String file) throws Exception
   {
    Scanner keyboard = new Scanner(System.in);
    String curMonth = null, bMonth = null, dMonth = null, name = null;
    int curDay = 0, curYear = 0, bDay=0, bYear = 0, dDay = 0, dYear = 0, stateOfPerson = 0;
    Date death = null;
    Date alive = null;
    Person p1 = null;
    File f = null;
    AppendObjectOutputStream appendOut;
    
    System.out.println("Please type in this persons name:");
    name = keyboard.nextLine();
    
    System.out.println("PLease type in this persons birth date in same formate as current date:" 
    +"(i.e January 1 1999)\n");
    
    System.out.print("Month: "); 
    bMonth = keyboard.nextLine();
    System.out.println();
    
    System.out.print("Day: ");
    bDay = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println();
    
    System.out.print("Year: ");
    bYear = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println();
    
    alive = new Date(bMonth, bDay, bYear);//my compiler just stops here with no error message
    //all i tried to do was create object with data from user.
    
    System.out.println("Is this person dead or alive?\n"
    +"-->Type 1: alive\n" + "-->Type 2: dead");
    stateOfPerson = keyboard.nextInt();
    keyboard.nextLine();
    
    if(stateOfPerson == 1)
    {
     p1 = new Person(name, alive, death);
    }
    
    else
    {
     System.out.println("PLease type in this persons death date in same formate as current date:" 
     +"(i.e January 1 1999)\n");
    
     System.out.print("Month: "); 
     dMonth = keyboard.nextLine();
     System.out.println();
    
     System.out.print("Day: ");
     dDay = keyboard.nextInt();
     keyboard.nextLine();
     System.out.println();
    
     System.out.print("Year: ");
     dYear = keyboard.nextInt();
     keyboard.nextLine();
     death = new Date(dMonth, dDay, dYear);
     
     p1 = new Person(name, alive, death);
    }
    
    f = new File(file);
    if(f.exists())
    {
     appendOut = new AppendObjectOutputStream( new FileOutputStream(file,true));
     appendOut.writeObject(p1);
     
    }
   }
   
   public static void deletion(String file) throws Exception
   {
    Scanner keyboard = new Scanner(System.in);
    Person [] p1 = null; 
    String nameDelete= null;
    ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream(file));
    ObjectOutputStream outputStream= null;
    
    int count = 1;
    try
    {
       // Reading until end of file
       while( true )
       {            
         Person tempObject = (Person) inputStream.readObject();
         System.out.println( "Object " + count); 
         System.out.println(tempObject); 
            
         count++;    // increment the counter
       }
         
    }
    catch(EOFException e)
    {
      System.out.println( "Finished reading all objects from file" );
      p1 = new Person[count];
    } 
    inputStream.close();
    
    inputStream = new ObjectInputStream( new FileInputStream(file));
    int counter = 0;
    try
    {
     while(true)
     {
      p1[counter] = (Person)inputStream.readObject();
      counter++;
     }
    }
    catch(EOFException e)
    {
      System.out.println( "Done" );
    }
    inputStream.close();
    
    System.out.println();
    System.out.println("Please type in the name of the person you want to delete: ");
    nameDelete = keyboard.nextLine();
    System.out.println();
    
    for(int i = 0; i<p1.length-1;i++)
    {
     
     if(p1[i].getName().equalsIgnoreCase(nameDelete))
     {
      p1[i]= null;   
     }
    }
    
    try
    {
     outputStream = new ObjectOutputStream ( new FileOutputStream(file));
    }
    catch(FileNotFoundException e)
    {
     System.out.println("File not found");
    }
    
    for(int i = 0; i<p1.length-1;i++)
    {
     if(p1[i]!=null)
     {
       outputStream.writeObject(p1[i]);
     }
    }
    outputStream.close();
    
    
    System.out.println("File after deletion");
    inputStream = new ObjectInputStream( new FileInputStream(file));
    count = 1;
    try
    {
       // Reading until end of file
       while( true )
       {            
         Person tempObject = (Person) inputStream.readObject();
         System.out.println( "Object " + count); 
         System.out.println(tempObject); 
            
         count++;    // increment the counter
       }
         
    }
    catch(EOFException e)
    {
      System.out.println( "Finished reading all objects from file" );
      p1 = new Person[count];
    } 
    System.out.println();
    inputStream.close();
    
   } 
}
