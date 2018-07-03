public class HotlineBling 
{
		private String first;
		private String last;
		private String phone;
		private String major;
			
		public HotlineBling()
		{	
		}
		public HotlineBling(String first, String last, String phone, String major)
		{
			this.first = first;
			this.last = last;
			this.phone = phone;
			this.major = major;	
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
		public void setMajor(String major)
		{
			this.major = major;
		}
		public String getMajor()
		{
			return major;
		}
		public String toString()
		{
			return "First name: " + first + " Last Name: " + last 
					+ " Phone Number: " + phone + " major: " + major;
		}
		public boolean equals(Object obj)
		{
			HotlineBling other = (HotlineBling) obj;
			if(this.major.equalsIgnoreCase(other.getMajor()))
			{
				return true;
			}
			return false;
		}
		public HotlineBling(String contactString)
		{
			first = contactString;
			last = contactString;
			major = contactString;
		}
	
}
