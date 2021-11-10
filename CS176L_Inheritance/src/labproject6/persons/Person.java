package labproject6.persons;

public class Person 
{
	String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String nameSet) 
	{
		name = nameSet;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name;
	}

}
