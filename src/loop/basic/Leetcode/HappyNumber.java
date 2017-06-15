package loop.basic.Leetcode;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {

		System.out.println(isHappy(15));
		System.out.println(isHappy(1));
		System.out.println(isHappy(2));
		System.out.println(isHappy(7));
		System.out.println(isHappy(10));
		System.out.println(isHappy(31));
	}

	public static boolean isHappy(int n) {
		int sum = 0;
		HashSet set = new HashSet();
		for (;;) {
			sum = sum + (n % 10) ^ 2;
			if (n > 9) {
				n = n / 10;
			} else if (sum==1) {
				return true;
				
				} else if (set.add(sum)) {
					n=sum;
					sum=0;
					
				}
				else{
					break;
				}
			
			}

		return false;
}
	
}
