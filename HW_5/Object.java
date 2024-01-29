
public class Object implements Comparable
{
	private String str;
	
	public Object(String s)
	{
		this.str = s;
	}
	
	public String toString()
	{
		return str;
	}

	@Override
	public int compareTo(java.lang.Object o) 
	{
		int result = this.toString().compareToIgnoreCase(o.toString());
		return result;
	}
}
