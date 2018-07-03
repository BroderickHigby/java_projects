/** Chapter No. 14 - Exercise No.  2 
   File Name:          Contact.java
   Programmer:         Broderick Higby
   Date Last Modified: November 10, 2015

 *Algorithm:
 *	- Create an array list "of parameter type Contact"
	- Create get and set methods for the contacts first name, last name, phone number, and e-mail address
	-  
 */
import java.util.ArrayList;
import java.io.*;
public class Contact
{
	private String first;
	private String last;
	private String phone;
	private String email;
	
	ArrayList<Contact> contactArray = new ArrayList<>();
	
	public Contact(String first, String last, String Phone, String Email)
	{
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.email = email;	
	}
	public void setFirst(String first)
	{
		this.first = first;
	}
	public String getFirst(String first)
	{
		return first;
	}
	public void setLast(String last)
	{
		this.last = last;
	}
	public String getLast(String last)
	{
		return last;
	}
	public void setPhone(String last)
	{
		this.last = last;
	}
	public String getPhone(String phone)
	{
		return phone;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail(String email)
	{
		return email;
	}
	public String toString()
	{
		return "First name: " + first + "Last Name: " + last 
				+ "Phone Number: " + phone + "Emaai: " + email;
	}
	public boolean equals(String other)
	{
		if(this.last.equals(other)||
				this.first.equals(other));
		{
		return true;
		}
	}		
}
