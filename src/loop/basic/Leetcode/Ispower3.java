package loop.basic.Leetcode;

public class Ispower3 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(8));
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfThree(15));
		System.out.println(isPowerOfThree(81));
		System.out.println(isPowerOfThree(1));
		
	

	}
public static boolean isPowerOfThree(int n) {
		
		
		for (; n != 0;) {
			if (n % 3 == 0) {
				n = n / 3;
			} else if (n == 1) {
				return true;

			}
			else{
				return false;
			}

		}

		return false;

	}

}
