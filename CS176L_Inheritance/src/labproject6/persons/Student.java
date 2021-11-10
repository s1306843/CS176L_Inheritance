package labproject6.persons;

public class Student extends Person
{
	
	public int year;
    
	
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    public static final int SUPERSENIOR = 5;
   
    public int getYear() 
    {
		return year;
	}
	public void setYear(int yearSet) 
	{
		year = yearSet;
	}

	public String toString()
	{
		if(FRESHMAN == year)
		{
			return "name: " + name + "\nYear = Freshman";
		}
		if(SOPHOMORE == year)
		{
		return "name: " + name + "\nYear = Sophmore";
		}
		if(JUNIOR == year)
		{
		return "name: " + name + "\nYear = Junior";
		}
		if(SENIOR == year)
		{
		return "name: " + name + "\nYear = Senior";
		}
		if(SUPERSENIOR == year)
		{
		return getClass() + "\nname: " + name + "\nYear = " + SUPERSENIOR;
		}
		else 
		{
			return "";
		}
		
	}
}
