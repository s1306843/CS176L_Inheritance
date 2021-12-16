package labproject8.interfaces;
import java.util.Comparator;

public class CompareByPageSize implements Comparator<WrittenWork>
{

	public int compare (WrittenWork work1, WrittenWork work2) 
	{
		if(work1.getPageSize() < work2.getPageSize()) 
		{
			return -1;
				
		}
		else if (work1.getPageSize() > work2.getPageSize())	
		{
			return 1;
		}
			
		else 
		{
			return 0;
		}
		
	}

}