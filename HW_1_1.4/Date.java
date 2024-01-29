
public class Date 
{
	int day;
	int month;
	int year;
	
	Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//This overrides the toString class in the root Object class
	public String toString()
	{
		String str = "";
		str = "Date : " + day + " - " + month + " - " + year;
		return str;
	}
	
}
