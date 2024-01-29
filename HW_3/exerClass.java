import java.util.Scanner;

public class exerClass
{
	public int num = 1;
	public int exer;
	
	
	public exerClass()
	{
		num = Input();
		exer =exer(num);
		System.out.println(toString());
	}
	
	public int Input()
	{
		do
		{
			System.out.println("Please input a negative integer \n");	
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			try 
			{ 
				num = Integer.parseInt(ch); 
				System.out.println(ch + " is a valid negative integer \n");
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println(ch + " is not a valid negative integer \n"); 
			} 
		}	
		while(num>0);		
	return num;	
	}
	
	// num should be a negative integer
	private int exer(int num) 
	{ 
	  if (num == 0)
	  {
		 return 0; 
	  }    
	  else
	  {
		 return num + exer (num +1);  
	  }
	       
	}
	
	// num should be a negative integer
    public int getExer()
    {
    	return exer;
    }
    public void setExer()
    {
    	exer = exer(Input());
    }
    
    public String toString()
    {
    	String str = "";
    	str += "Exer: " + exer + "\n";
    	return str;
    }
}
