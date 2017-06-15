package loop.basic.Leetcode;

public class TwoSumWithoutPius {

	public static void main(String[] args) {
	System.out.println(getSum(1, 3));
		

	}

	 public static int getSum(int a, int b) {
		 if(a==0){
			 return b;
		 }
		 else if (b==0){
			 return a;
		 }
		 for( ;b!=0;){
			 int carry=a & b;
			 a=a^b;
			 b=carry<<1;
		 }
		return a;
	        
	    }
}
