package labproject8.interfaces;

public class ShortStory extends WrittenWork{

	private String genre;
	private int paragraphs;
	private boolean hasPics;
	
	public ShortStory(String title, String author, int year, int pageSize, String genre, int paragraphs, boolean hasPics) 
	{
		 super(title, author, year, pageSize);
	     setGenre(genre);
	     setParagraphs(paragraphs);
	     setHasPics(hasPics);
	 }

	public String getGenre() 
	{
		return genre;
	}

	public void setGenre(String genre) 
	{
		this.genre = genre;
	}

	public int getParagraphs() 
	{
		return paragraphs;
	}

	public void setParagraphs(int paragraphs) 
	{
		this.paragraphs = paragraphs;
	}

	public boolean isHasPics() 
	{
		return hasPics;
	}

	public void setHasPics(boolean hasPics) 
	{
		this.hasPics = hasPics;
	}
	
	public boolean equals (Object obj) 
	{
		if (super.equals(obj)) {
			if (obj instanceof ShortStory) 
			{
				ShortStory story = (ShortStory) obj;
			
				if(this.genre == story.genre && this.paragraphs == story.paragraphs && this.hasPics == story.hasPics) {
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
		return false;
	}
	
	public String toString() 
	{
		
		String text = super.toString();
		return text + "\nGenre: " + this.genre + "\nParagraphs: " + this.paragraphs + "\nHas Pictures? " + this.hasPics;
	}
}