package contactArray;
public class Contact
{
	private String first;
	private String last;
	private String phone;
	private String email;
		
	public Contact()
	{	
	}
	public Contact(String first, String last, String phone, String email)
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
	public String getFirst()
	{
		return first;
	}
	public void setLast(String last)
	{
		this.last = last;
	}
	public String getLast()
	{
		return last;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return "First name: " + first + " Last Name: " + last 
				+ " Phone Number: " + phone + " Email: " + email;
	}
	public boolean equals(Contact other)
	{
		if(this.last.equals(other.getLast())||
				this.first.equals(other.getFirst()))
		{
		return true;
		}
		
		int index = other.getEmail().indexOf("@");
		
		if(index == -1)
		{
			return false;
		}
		String parseEmail = other.getEmail().substring(0, index -1);
		for (int i = 0; i < parseEmail.length(); i++)
		{
			if(email.charAt(0) == parseEmail.charAt(i))
			{
				return email.equalsIgnoreCase(parseEmail.substring(i));
			}
		}			
		return false;
	}
	public Contact(String contactString)
	{
		first = contactString;
		last = contactString;
		email = contactString;
	}
	

}
