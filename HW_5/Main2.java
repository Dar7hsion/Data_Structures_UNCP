
import java.util.Arrays;

public class Main2 
{

	public static void main(String[] args) 
	{
		SortedArrayCollection<INTEGER> sample = new SortedArrayCollection<INTEGER>(12);
			
		for(int i = 1; i < 6; i++)
		{
			Object obj1 = new INTEGER(1);
			INTEGER obj2 = new INTEGER(2);
			INTEGER obj3 = new INTEGER(3);
			INTEGER obj4 = new INTEGER(4);
			
			switch(i)
			{
				case 1:
				sample.add(obj4);
				sample.add(obj1);
				sample.add(obj3);
				sample.add(obj2);
				//System.out.print("sample add1: " + sample.toString());
				break;
				
				case 2:
				//sample.add(obj3);
				//sample.add(obj1);
				//sample.add(obj2);
				//System.out.print("sample add2: " + sample.toString());
				break;
				
				case 3: 

				break;
					
				case 4:

				break;
				
				case 5:
				System.out.println("sample: " + Arrays.toString(sample.elements));	

				break;
			}
		}
		
		
		
	}
}
