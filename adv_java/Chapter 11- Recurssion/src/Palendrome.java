/* Chapter No.  11 Exercise No. 2  
File Name:          Palendrome.java
Programmer:         Broderick Higby
Date Last Modified: October 22, 2015

Problem Statement: write recursive method to detect palindrome and to
to calculate value of nth factorial 

Algorithm:
1. Main class will call isPalindrome class  
	
	isPalendrome class will:
1. clean string of all non-word chars
2. check if beginning char and ending char are =
3. strip off said chars and 
4. re-input

*/
public class Palendrome 
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome("racecar"));
		
		System.out.println(isPalindrome("raceras"));
		
		System.out.println(isPalindrome(cleanInp("Straw? No, too stupid a fad, I put soot on warts.")));
		
		System.out.println(factorial(9));
	}
	
	// regex \W matches non-word character
	// replace with "" effectively delete
	// must make it lower case to compare with == operator
	// in isPalindrome method
	public static String cleanInp(String s)
	{
		return s.replaceAll("\\W", "").toLowerCase(); 
	}
	
	public static boolean isPalindrome(String s)
	{
		if(s.length() < 2)
		{
			return true; //if length is 0 or 1 it's a palindrome
		}
		if(s.charAt(0) == s.charAt(s.length() -1))
		{
			return isPalindrome(s.substring(1, s.length()-1));//break into substring and repeat
		}
		else
		{
			return false;
		}
	}
	
	public static int factorial(int i)
	{
		//recursive case
		if(i > 1)
		{
			return i * factorial(i -1);
		}
		//base case
		else
		{
			return i;
		}
	}
	
}
