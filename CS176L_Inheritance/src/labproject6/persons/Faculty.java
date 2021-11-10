package labproject6.persons;

public class Faculty extends Employee
{

	String rank;

	public String getRank() 
	{
		return rank;
	}

	public void setRank(String rankSet) 
	{
		rank = rankSet;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ officeNum + "\nSalary: " + salary + "\nRank: " + rank;
	}

}
