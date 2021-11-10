package labproject6.persons;

public class Staff extends Employee
{

	String title;

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String titleSet) 
	{
		title = titleSet;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ officeNum + "\nSalary: " + salary + "\nTitle: " + title;
	}
}
