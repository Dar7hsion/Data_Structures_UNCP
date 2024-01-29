class RectanglePerimeter implements Comparable<RectanglePerimeter>{
    
    private int length;
    private int width;
    RectanglePerimeter(int l,int w){
        length=l;
        width=w;
    }
    public int area(){
        
        return length * width;
    }
    public int perimeter(){
        return 2 * (length + width);
    }
    public int compareTo(RectanglePerimeter r)
    {
    	Integer tempHold = new Integer(perimeter()).compareTo(r.perimeter());
        return tempHold;  
    }
    
    public String toString()
    {
    	String str;
    	str = String.valueOf(perimeter());
    	return str;	
    }
}
