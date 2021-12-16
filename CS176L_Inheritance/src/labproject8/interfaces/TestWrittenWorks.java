package labproject8.interfaces;

import java.util.ArrayList;

public class TestWrittenWorks {

	public static void main(String[] args) {
		Novel novel1 = new Novel("Main Title Example", "Przelomski", 1999, 1000, "Horror" , 12);
		Novel novel2 = new Novel("Macbeth", "Shakespeare", 1606, 112, "Drama", 4);
		Novel novel3 = new Novel("Dune", "Herbert", 1965, 412, "Science Fiction", 2);
		
		ShortStory sStory1 = new ShortStory("The Raven", "Poe", 1845, 40,"Fiction", 3, false);
		ShortStory sStory2 = new ShortStory("Hansel & Gretel", "Grimm", 1812, 48, "Fairy Tale" , 1, true);
		
		ArrayList<WrittenWork> writtenA = new ArrayList<>();
		
		writtenA.add(novel1);
		writtenA.add(novel2);
		writtenA.add(novel3);
		writtenA.add(sStory1);
		writtenA.add(sStory2);
		
		for (int i = 0; i < writtenA.size(); i++) 
		{
			System.out.println(writtenA.get(i));
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		writtenA.sort(new CompareByPageSize());
		
		for (int i = 0; i < writtenA.size(); i++) 
		{
			System.out.println(writtenA.get(i));
			System.out.println();
		}
	}

} 
