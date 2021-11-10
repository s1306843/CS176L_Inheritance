package labproject6.persons;

public class Employee extends Person
{
	String officeNum;
	double salary;
	
	public String getOfficeNumber() 
	{
		return officeNum;
	}
	public void setOfficeNumber(String officeNumber) 
	{
		officeNum = officeNumber;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salarySet) 
	{
		salary = salarySet;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ officeNum + "\nSalary: " + salary;
	}
}
