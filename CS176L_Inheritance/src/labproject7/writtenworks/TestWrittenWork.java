package labproject7.writtenworks;

public class TestWrittenWork {
	public static void main(String args[])
	{
		Novel novel = new Novel("Main Title", "Connor", 1999, "Horror", 10);

		ShortStory shortS = new ShortStory("Title2", "Przelomski", 2002, "Fantasy", 15, "Yes");

		System.out.println(novel);
		System.out.println();
		System.out.println(shortS);
	}


}