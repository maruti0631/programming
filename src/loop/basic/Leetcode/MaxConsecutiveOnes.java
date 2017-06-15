package loop.basic.Leetcode;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] x = { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
		// findMaxConsecutiveOnes(x);
		System.out.println(findMaxConsecutiveOnes(x));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count = count + 1;

			} else {
				if (count > count1) {
					count1 = count;
					count = 0;
				}
				count = 0;
			}
		}
		if (count > count1) {
			return count;
		} else {
			return count1;
		}

	}
}