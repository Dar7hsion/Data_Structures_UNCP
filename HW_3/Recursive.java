import java.util.Scanner;
public class Recursive
{   
	static int times=5;
    static int power=2;
	public int N = -1;
	int sum, bit, tim;
	
	public Recursive()
	{
		N = Input();
		sum = Sum(N);
		bit = Bitpower(N);
		tim = TimesFive(N);
		System.out.println(toString());	
	}
	// N should be a non negative integer
	public int Input()
	{
		do
		{
			System.out.println("Please input a non negative integer \n");	
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			try 
			{ 
				N = Integer.parseInt(ch); 
				System.out.println(ch + " is a valid integer \n");
			}  
			catch (NumberFormatException e)  
			{ 
				System.out.println(ch + " is not a valid integer \n"); 
			} 
	
		}	
		while(N<0);
			
	return N;	
	}
	// N should be a non negative integer
    public static int Sum(int N)
    {
        if(N==1)
        {
            return 1;
        }
        return N+Sum(N-1);
       
    }
    // N should be a non negative integer
    public static int Bitpower(int N)
    {
        
        if(power==1)
        {
            return N;
        }
        else
        {
        power=power-1;
        return N+Bitpower(N);
        }
    }
    // N should be a non negative integer
    public static int TimesFive(int N)
    {   
        if(times==1)
        {
            return N;
        }
        else
        {
            times=times-1;
            return N+TimesFive(N);
        }
    }
    // N should be a non negative integer
    public int getSum()
    {
    	return sum;
    }
    public void setSum()
    {
    	sum = Sum(Input());
    }
    // N should be a non negative integer
    public int getBitpower()
    {
    	return bit;
    }
    public void setBitpowerm()
    {
    	bit = Bitpower(Input());
    }
    // N should be a non negative integer
    public int getTimesFive()
    {
    	return tim;
    }
    public void setTimesFive()
    {
    	tim = TimesFive(Input());
    }
    
    public String toString()
    {
    	String str = "";
    	str += "Sum: " + sum + "\n";
    	str += "Bit: " + bit + "\n";
    	str += "time: " + tim + "\n";
    	return str;
    }
}
