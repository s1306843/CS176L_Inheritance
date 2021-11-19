package labproject7.writtenworks;

public class ShortStory extends WrittenWork {

	private String genre;
	private int paragraph;
	private String hasPics;
	
	public ShortStory(String title, String author, int year, String genre, int paragraphs, String hasPics)
	 {
	       
	    	setAuthor(author);
	    	setTitle(title);
	    	setYear(year);
	        setGenre( genre );
	        setParagraphs( paragraphs );
	        setHasPics(hasPics);

		
		
	}
	public String getGenre() 
	{
		return genre;
	}
	public void setGenre(String genres) 
	{
		genre = genres;
	}
	public int getParagraphs() {
		return paragraph;
	}
	public void setParagraphs(int paragraphs) 
	{
		paragraph = paragraphs;
	}
	public String ifHasPics() 
	{
		return hasPics;
	}
	public void setHasPics(String hasPic) 
	{
		hasPics = hasPic;
	}
	 public String toString()
	 {
		 return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nGenre: "+ getGenre() + "\nParagraphs: "+ getParagraphs() + "\nPictures: "+ ifHasPics();
	 }
}