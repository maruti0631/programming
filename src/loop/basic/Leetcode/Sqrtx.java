package loop.basic.Leetcode;

public class Sqrtx {

	public static void main(String[] args) {
		System.out.println(mySqrt(81));
		System.out.println(mySqrt(8));
		System.out.println(mySqrt(25));
		System.out.println(mySqrt(26));
		System.out.println(mySqrt(1));
		System.out.println(mySqrt(0));
		System.out.println(mySqrt(2147483647));

	}
	  public static int mySqrt(int x) {
			long sum = 0;
			int count=0;
			for (int i = 1; x>= sum; i = i + 2) {

				sum = sum + i;
				if(x>=sum){
					count++;
				}
				
			}
			return count;

		
		  
		
	        
	        
	    }

}
