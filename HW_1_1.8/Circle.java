
public class Circle {

	public static void main(String[] args) 
	{
		//Circle c1;
		
//		for(int i = 1; i<=100; i++)
//		{
//			Circle c1 = new Circle();
//		}
		double angle;
		double x;
        double y;
        int s =3;
		
		angle = Math.atan2(1, 1);
		x = (s) * Math.cos(angle);
        y = (s) * Math.sin(angle);
        System.out.println("ANGLE: " + angle);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("NewSpeed: " + Math.sqrt((Math.round(x*x))+(Math.round(y*y))));
		
		angle = Math.atan2(1, -1);
		x = (s) * Math.cos(angle);
        y = (s) * Math.sin(angle);
        System.out.println("ANGLE: " + angle);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("NewSpeed: " + Math.sqrt((Math.round(x*x))+(Math.round(y*y))));
        
		angle = Math.atan2(-1, -1);
		x = (s) * Math.cos(angle);
        y = (s) * Math.sin(angle);
        System.out.println("ANGLE: " + angle);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("NewSpeed: " + Math.sqrt((Math.round(x*x))+(Math.round(y*y))));
		
		angle = Math.atan2(-1, 1);
		x = (s) * Math.cos(angle);
        y = (s) * Math.sin(angle);
        System.out.println("ANGLE: " + angle);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("NewSpeed: " + Math.sqrt((Math.round(x*x))+(Math.round(y*y))));
       

	}

}
