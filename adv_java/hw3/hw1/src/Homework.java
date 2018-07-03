import java.util.Calendar;

public class Homework 
 {
 	private String assignment;
 	private String date;
 	
 	public Homework()
 	{
 		this.assignment = "Assignment";
 		this.date = "Date";
 	}
 	
 	public Homework(String assignment, String date)
 	{
 		this.assignment = assignment;
 		this.date = date;
 	}
 	
 	public void setAssignment(String assignment)
 	{
 		this.assignment = assignment;
 	}
 	
 	public void setDate(String date)
 	{
 		this.date = date;
 	}
 	
 	public String getAssignment()
 	{
 		return this.assignment;
 	}
 	
 	public String getDate()
 	{
 		return this.date;
 	}
 	
 	public String toString()
 	{
 		return "Assignment: " +  this.assignment + "\nDate: " + this.date;
 	}
 	
 	public boolean comparedTo(Homework homework)
 	{
 		int year;
 		int month;
 		int day;
 		
 		int compareYear;
 		int compareMonth;
 		int compareDay;
 		
 		boolean earlier = false;
 		
 		year = Integer.parseInt(this.date.substring(6,8));
 		month = Integer.parseInt(this.date.substring(0,2));
 		day = Integer.parseInt(this.date.substring(3,5));
 		
 		compareYear = Integer.parseInt(homework.getDate().substring(6,8));
 		compareMonth = Integer.parseInt(homework.getDate().substring(0,2));
 		compareDay = Integer.parseInt(homework.getDate().substring(3,5));
 		if(year < compareYear )
 		{
 			earlier = false;
 		}
 		else if(year > compareYear)
 		{
 			earlier = true;
 		}
 		else if(year == compareYear)
 		{
 			if(month < compareMonth)
 			{
 				earlier = false;
 			}
 			else if(month > compareMonth)
 			{
 				earlier = true;
 			}
 			else if(month == compareMonth)
 			{
 				if(day < compareDay)
 	 			{
 					earlier = false;
 	 			}
 	 			else if(day > compareDay)
 	 			{
 	 				earlier = true;
 	 			}
 	 			else if(day == compareDay)
 	 			{
 	 				
 	 			}
 			}
 		}
 		return earlier;
 	}
 }