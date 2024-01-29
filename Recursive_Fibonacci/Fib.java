
public class Fib {

	public static void main(String[] args) 
	{
		int n=10;
		for(int i = 0; i<n; i++)
		System.out.println(fib(i));

	}
	
	public static int fib(int N)
	{
		if(N <= 1)
		{
            return N;
        }
        else
        {
            return fib(N-1)+fib(N-2);
        }
	}

}
