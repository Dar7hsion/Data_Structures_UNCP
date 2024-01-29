
public class DiminishingSquares 
{
	public static void drawSquares(int side) 
	{

		// Print one star if side is 1 and don't call the function anymore - Base case

		if (side == 1)

		System.out.println("*");

		else {

		// Display the square of size side and call function recursively passing side-1 as argument

		for(int i=0; i<side; i++) 
		{
			for(int j=0; j<side; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		drawSquares(side-1);
		}
	}
	
	public static void main(String[] args) 
	{
		// Parse the command line argument to integer

		int side = Integer.parseInt(args[0]);

		// Call the function to print the output

		drawSquares(side);
	}
}
