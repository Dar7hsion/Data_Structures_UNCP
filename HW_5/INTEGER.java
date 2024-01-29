
public class INTEGER implements Comparable
{
	private int i;
	
	public INTEGER(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		String str = "";
		return str + i;
	}

	@Override
	public int compareTo(java.lang.Object o) 
	{
		if(this.equals(o))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
