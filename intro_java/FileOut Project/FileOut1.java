import java.io.*;

public class FileOut1
{
		
public static void main(String[] args) throws FileNotFoundException
{

	PrintWriter fileOut=new PrintWriter("data.txt");
		String aLine = "A line of text";
		fileOut.println(aLine);
		fileOut.close();
		
		}
		
}