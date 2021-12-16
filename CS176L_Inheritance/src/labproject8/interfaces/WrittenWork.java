package labproject8.interfaces;

public class WrittenWork {

private String title;
private String author;
private int year;
private int pageSize;



public WrittenWork(String title, String author, int year, int pageSize) 
{

   setTitle(title);
   setAuthor(author);
   setYear(year);
   setPageSize (pageSize);
   
}

public int getPageSize() 
{
	return pageSize;
}

public String getTitle() 
{
   return title;
}

public String getAuthor() 
{
   return author;
}

public int getyear() 
{
   return year;
}

public void setPageSize(int pageSize) 
{
	this.pageSize = pageSize;
}

public void setTitle(String title) 
{
   this.title = title;
}

public void setAuthor(String author) 
{
   this.author = author;
}

public void setYear(int year) 
{
   this.year = year;
}

public boolean equals (Object obj) 
{
	if (obj instanceof WrittenWork) 
	{
		WrittenWork misc = (WrittenWork) obj;
		
		if(this.title == misc.title && this.author == misc.author && this.year == misc.year && this.pageSize == misc.pageSize) {
			return true;
		}
		else 
		{
			return false;
		}
	}
	else 
	{
		
		return false;
	}
}

public String toString() 
{
	 
	 return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year + "\nPageSize: " + this.pageSize;
}
}