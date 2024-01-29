import java.util.Arrays;

public class rectTest {

	public static void main(String[] args)
	{
		// public int compareTo(T o);
		// Returns a negative integer, zero, or a positive integer as this object
		// is less than, equal to, or greater than the specified object.

		
		 	System.out.println("\n Area ");
			RectangleArea r1 = new RectangleArea(10,20);
			RectangleArea r2 = new RectangleArea(4,4);
		    System.out.println("r1 compareTo r2: " + r1.compareTo(r2));
		    System.out.println("r2 compareTo r1: " + r2.compareTo(r1));
		    System.out.println("r2 compareTo r2: " + r2.compareTo(r2));
		    System.out.println("\n Perimeter");
		    RectanglePerimeter r3 = new RectanglePerimeter(10,20);
			RectanglePerimeter r4 = new RectanglePerimeter(4,4);
		    System.out.println("r3 compareTo r4: " + r3.compareTo(r4));
		    System.out.println("r4 compareTo r3: " + r4.compareTo(r3));
		    System.out.println("r4 compareTo r4: " + r4.compareTo(r4));
		    
		    RectangleArea[] RectListA = new RectangleArea[2];
		    RectanglePerimeter[] RectListP = new RectanglePerimeter[2];
		    
		    if(r1.compareTo(r2) >= 0)
		    {
		    	RectListA[0]=r1;
		    	RectListA[1]=r2;
		    }
		    else
		    {
		    	RectListA[1]=r1;
		    	RectListA[0]=r2;
		    }
		    
		    if(r3.compareTo(r4) >= 0)
		    {
		    	RectListP[0]=r3;
		    	RectListP[1]=r4;
		    }
		    else
		    {
		    	RectListP[1]=r4;
		    	RectListP[0]=r3;
		    }
		    
		    System.out.println("\n" + Arrays.toString(RectListA));
		    System.out.println(Arrays.toString(RectListP));

	}

}
