import java.util.Arrays;

public class mainBagLinked {

	public static void main(String[] args) 
	{
		ADTBagLinkBased<Object> sample = new ADTBagLinkBased<Object>();
		
		int switchNum = 5;
		
		LLNode obj1 = new LLNode("A");
		LLNode obj2 = new LLNode("B");
		LLNode obj3 = new LLNode("C");
		LLNode obj4 = new LLNode("D");
		
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
					System.out.println("sample 1st add: " + sample.toString());
				break;
				
				case 2:
					sample.add(obj3);
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj2);
					sample.add(obj3);
					System.out.println("sample 2nd add: " + sample.toString());				
				break;
				
				case 3:
					sample.add(obj3);
					sample.add(obj4);
					sample.add(obj1);
					sample.add(obj2);
					sample.add(obj3);
					System.out.println("sample 3rd add: " + sample.toString());
				break;
					
				case 4:
					System.out.println("get: " + sample.get(obj3));
					System.out.println("contains obj2: " + sample.contains(obj2));
					System.out.println("remove an obj4: " + sample.remove(obj4));
					System.out.println("sample: " + sample.toString());
					System.out.println("isFull: " + sample.isFull());
					System.out.println("isEmpty : " + sample.isEmpty());
					System.out.println("grab: " + sample.grab());
					System.out.println("sample: " + sample.toString());
					System.out.println("count obj4: " + sample.count(obj3));
					System.out.println("remove all obj4, number removed: " + sample.removeAll(obj4));
					System.out.println("sample: " + sample.toString());
					sample.clear();
					System.out.println("sample after clear method: will be null so nothing prints " + sample);
				break;
			}
		}

	}

}
