// Novel.java: Subclass of WrittenWork
package labproject7.writtenworks;
public class Novel extends WrittenWork {

    private String genre;
    private int chapter;

    public Novel(String title, String author, int year, String genre, int chapters) 
    {
        /* _________Line 11_________ */
    	setAuthor(author);
    	setTitle(title);
    	setYear(year);
        setGenre(genre);
        setChapters(chapters);
    }

	public String getGenre() 
	{
		return genre;
	}

	public void setGenre(String genres) 
	{
		genre = genres;
	}

	public int getChapters() 
	{
		return chapter;
	}

	public void setChapters(int chapters) 
	{
		chapter = chapters;
	}
	 public String toString()
	 {
		 return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nGenre: "+ getGenre() + "\nChapter: "+ getChapters();
	 }
    


}
