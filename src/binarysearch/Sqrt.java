package binarysearch;

public class Sqrt {
    public int mySqrt(int x) {
    	int l=0, r=x, result=0;
    	while(l<=r)
    	{
    		int mid=l + (r - l) / 2;
    		if(mid*mid>x)
    		{
    			r=mid-1;
    			result=mid;
    		}
    		else if(mid*mid<x)
    		{
    			l=mid+1;
    			result= mid;
    		} 
    		else
    		{
    			return mid;
    		}
    	}
       return result; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt s= new Sqrt();
		int res=s. mySqrt(13);
		System.out.println(res);
	}

}
