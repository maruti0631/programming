package loop.basic.Leetcode;

public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(81));
		System.out.println(isPerfectSquare(8));
		System.out.println(isPerfectSquare(25));
		System.out.println(isPerfectSquare(26));
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(0));
		System.out.println(isPerfectSquare(2147483647));
		

	}

	public static boolean isPerfectSquare(int num) {
		long sum = 0;
		for (int i = 1; num >= sum; i = i + 2) {

			sum = sum + i;
			if (sum == num) {
				return true;
			}

		}
		return false;

	}

}
