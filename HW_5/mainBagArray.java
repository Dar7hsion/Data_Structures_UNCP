import java.util.Arrays;

public class mainBagArray {

	public static void main(String[] args) 
	{
		ADTBagArrayBased<Object> sample = new ADTBagArrayBased<Object>(15);
		
		int switchNum = 5;
		
		Object obj1 = new Object("A");
		Object obj2 = new Object("B");
		Object obj3 = new Object("C");
		Object obj4 = new Object("D");
		
		for(int i = 1; i < switchNum; i++)
		{
			switch(i)
			{
				case 1:
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj4);
					System.out.println("sample 1st add: " + Arrays.toString(sample.elements));
				break;
				
				case 2:
					sample.add(obj3);
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj2);
					sample.add(obj3);
					System.out.println("sample 2nd add: " + Arrays.toString(sample.elements));
				break;
				
				case 3:
					sample.add(obj3);
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj2);
					sample.add(obj3);
					System.out.println("sample 3rd add: " + Arrays.toString(sample.elements));
				break;
					
				case 4:
					System.out.println("get: " + sample.get(obj3));
					System.out.println("contains obj2: " + sample.contains(obj2));
					System.out.println("remove an obj4: " + sample.remove(obj4));
					System.out.println("sample: " + Arrays.toString(sample.elements));
					System.out.println("isFull: " + sample.isFull());
					System.out.println("isEmpty : " + sample.isEmpty());
					System.out.println("grab: " + sample.grab());
					System.out.println("sample: " + Arrays.toString(sample.elements));
					System.out.println("count obj4: " + sample.count(obj4));
					System.out.println("remove all obj4, number removed: " + sample.removeAll(obj4));
					System.out.println("sample: " + Arrays.toString(sample.elements));
					sample.clear();
					System.out.println("sample after clear method: " + Arrays.toString(sample.elements));
				break;
			}
		}

	}

}
