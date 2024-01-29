
public class Test 
{
	public static void main(String[] args) 
	{
		
		//creating a String ArrayPair

		PairInterface<String> myPair = new ArrayPair<String>("abel", "brad");

		//displaying first and second objects

		System.out.println(myPair.getFirst());

		System.out.println(myPair.getSecond());

		//changing first object

		myPair.setFirst("oliver");

		//displaying first and second objects

		System.out.println(myPair.getFirst());

		System.out.println(myPair.getSecond());

	}

}
