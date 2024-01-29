
import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{
		ADTBagSortedArrayBased<Object> sample = new ADTBagSortedArrayBased<Object>(10);

			
		for(int i = 1; i < 6; i++)
		{
			Object obj1 = new Object("A");
			Object obj2 = new Object("B");
			Object obj3 = new Object("C");
			Object obj4 = new Object("D");
			Object obj5 = new Object("E");
			switch(i)
			{
				case 1:
				sample.add(obj4);
				sample.add(obj1);
				System.out.println("sample: " + Arrays.toString(sample.elements));	
				break;
				
				case 2:
				sample.add(obj4);
				sample.add(obj3);
				System.out.println("sample: " + Arrays.toString(sample.elements));	
				break;
				
				case 3: 
				sample.add(obj2);
				sample.add(obj3);
				System.out.println("sample: " + Arrays.toString(sample.elements));	
				break;
					
				case 4:
				sample.add(obj4);
				sample.add(obj3);


				System.out.println("sample: " + Arrays.toString(sample.elements));	
				break;
				
				case 5:
				sample.add(obj4);
				sample.add(obj3);
				System.out.println("sample: " + Arrays.toString(sample.elements));	
				System.out.println("get " + sample.get(obj4));
				System.out.println("sample: " + Arrays.toString(sample.elements));
				System.out.println("removed? "+sample.remove(obj3));
				System.out.println("sample: " + Arrays.toString(sample.elements));
				System.out.println("Grab " + sample.grab());
				System.out.println("sample: " + Arrays.toString(sample.elements));
				System.out.println("A count " + sample.count(obj1));
				System.out.println("isFull " + sample.isFull());
				System.out.println("isEmpty " + sample.isEmpty());
				System.out.println("remove count " + sample.removeAll(obj3));
				System.out.println("sample: " + Arrays.toString(sample.elements));
				System.out.println("size " + sample.size());
				sample.clear();
				System.out.println("clear: " + Arrays.toString(sample.elements));
				break;
			}
		}
		
		
		
	}
}
