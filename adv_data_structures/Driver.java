import java.io.*;
import java.util.*;
public class Driver
{
        public static void main(String[] args) throws java.io.IOException
        {
        		Scanner keyboard = new Scanner(System.in);
        		
                System.out.println("Enter string: ");
                String entry = keyboard.nextLine();
                
                entry = entry.replace(".", "");
                //System.out.println(entry);
                
                StringBuilder test = new StringBuilder();
                test.append(entry);
                test = test.reverse();
                
                for(int i = 0; i < test.length(); i ++)
                {
                	System.out.print(test.charAt(i));
                }
                
     
        }

}