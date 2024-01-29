import java.util.Scanner;

public class Euclid 
{
	
	int m = -1;
	int n = -1; 
	boolean run = true;
	
	public Euclid()
	{
		Input();	
	}
	public void Input()
	{
		Scanner scan = new Scanner(System.in);
		while(run == true)
		{
			do
			{
				System.out.println("Please input a non negative integer, (x) to exit \n");	
				String ch = scan.next();
				if(ch.equals("x"))
				{
					run = false;
					break;
				}
				else
				{
					try 
					{ 
						m = Integer.parseInt(ch); 
						System.out.println("m: " + m + " is a valid non negative integer \n");
					}  
					catch (NumberFormatException e)  
					{ 
						System.out.println(ch + " is not a valid non negative integer \n"); 
					}
				} 
			}	
			while(m<0);
			
			while(n<0 && run==true)
			{
				System.out.println("Please input a non negative integer, (x) to exit\n");	
				String ch = scan.next();
				if(ch.equals("x"))
				{
					run = false;
					break;
				}
				else
				{
					try 
					{ 
						n = Integer.parseInt(ch); 
						System.out.println("n: " + n + " is a valid non negative integer \n");
					}  
					catch (NumberFormatException e)  
					{ 
						System.out.println(ch + " is not a valid non negative integer \n"); 
					} 
				}	
			}
			if(run==true)
			System.out.println("GCD of " + m + " and " + n + " is " + gcd(m, n));
		
		}
	}
	public void Input2()
	{
		Scanner in = new Scanner(System.in);
        int m, n;
        while (true) {
            System.out.print("Enter two numbers(negative to exit): ");
            m = in.nextInt();
            n = in.nextInt();
            if (m < 0 || n < 0)
                break;
            System.out.println("GCD of " + m + " and " + n + " is " + gcd(m, n));
        }
	}
	
	public static int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        } else if (m % n == 0) {
            return n;   // base case
        } else {
            return gcd(n, m % n);   // recursive case
        }
    }
}
