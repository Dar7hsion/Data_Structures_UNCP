class RectangleArea implements Comparable<RectangleArea>{
    
    private int length;
    private int width;
    RectangleArea(int l,int w){
        length=l;
        width=w;
    }
    public int area(){
        
        return length * width;
    }
    public int perimeter(){
        return 2 * (length + width);
    }
    public int compareTo(RectangleArea r)
    {
        Integer tempHold = new Integer(area()).compareTo(r.area());
        return tempHold;   
    }
    
    public String toString()
    {
    	String str;
    	str = String.valueOf(area());
    	return str;	
    }
}
