import java.util.Scanner;

public class TriangleUpClass 
{
	int num = -1;
	public String ast = "*";
	public String str = "";
	public TriangleUpClass()
	{
		this.num = Input();
		printTriangleUp(num);
	}

	public int Input()
	{
		do
		{
			System.out.println("Please input a non negative integer \n");	
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			try 
			{ 
				num = Integer.parseInt(ch); 
				System.out.println(ch + " is a valid non negative integer \n");
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println(ch + " is not a valid non negative integer \n"); 
			} 
		}	
		while(num<0);		
	return num;	
	}
	
	public static void printTriangleUp(int n)
	{
	    if(n > 0)
	    {
	        // Recurse to print the above rows
	        printTriangleUp(n-1);
	        // Print this row:
	        for(int i=0;i<n;i++)
	        {
	            System.out.print('*');
	        }
	        // Newline
	        System.out.println();
	    }
	}
	
	public void printLoop(int num)
	{
		for(int i = 1; i <= num; i++)
		{
			
			System.out.println(TriangleUp(i));
			str = "";
			
		}
	}
	
	private String TriangleUp(int n)
	{
		if(n==1)
		{
			return str=str+ast;
		}
		else
		{
			return str=ast+TriangleUp(n-1);
		}
	}
	
	public void setLoop()
	{
		printLoop(Input());
	}

}
