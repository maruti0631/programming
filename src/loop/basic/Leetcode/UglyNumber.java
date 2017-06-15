package loop.basic.Leetcode;

public class UglyNumber {
	public static void main(String[] args) {

		System.out.println(isUgly(7));
		System.out.println(isUgly(20));
		System.out.println(isUgly(25));
		System.out.println(isUgly(12));
		System.out.println(isUgly(14));
		System.out.println(isUgly(0));
	}

	// from net
	// Just divide by 2, 3 and 5 as often as possible and then check whether we
	// arrived at 1. Also try divisor 4 if that makes the code simpler / less
	// repetitive.
	public static boolean isUgly2(int num) {
		for (int i = 2; i < 6 && num > 0; i++)
			while (num % i == 0)
				num /= i;
		return num == 1;
	}

	public static boolean isUgly(int num) {
		if (num == 0) {
			return false;
		}
		for (; num != 1;) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 3 == 0) {
				num = num / 3;
			} else if (num % 5 == 0) {
				num = num / 5;
			} else {
				return false;
			}
		}
		return true;

	}

	// wrong
	public static boolean isUgly1(int num) {
		for (int i = 6; i <= num / 2; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				if (num % i == 0) {
					return true;
				}
			} else if (num % i == 0) {
				return false;
			}
		}
		if (num == 1 || num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
			return true;
		}
		return false;

	}
}