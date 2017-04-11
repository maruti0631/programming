package loop.basic;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		int[] y = { 4, 5, 2, 25 };
		// System.out.println(nextGreaterElements(y));
		int[] z = nextGreaterElements(y);
		for (int k = 0; k < z.length; k++) {
			System.out.println(z[k]);

		}
		int x[] = new int[] { 1, 1, 2, 25 };
		int[] z1 = nextGreaterElements(x);
		printArray(z1);
		printArray(nextGreaterElements(new int[] { 1, 2, 2, 25 }));
		printArray(nextGreaterElements(new int[] { 1, 2, 6, 25 }));
		printArray(nextGreaterElements(new int[] { 1111, 111, 21, 25 }));
		printArray(nextGreaterElements(new int[] { 1111, 111, 101, 25 }));
		printArray(nextGreaterElements(new int[] { 1111, 111, 1101, 1110 }));
	}

	static void printArray(int[] z) {
		System.out.println("******");
		for (int k = 0; k < z.length; k++) {
			System.out.print(z[k] + " ");

		}
	}

	public static int[] nextGreaterElements(int[] nums) {
		Stack<Integer> s1 = new Stack<>();
		int[] x = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i == nums.length - 1) {
				s1.push(nums[i]);
				x[i] = -1;

			} else if (s1.peek() > nums[i]) {
				x[i] = s1.peek();
				s1.push(nums[i]);
			} else {
				for (; !s1.empty() && s1.peek() <= nums[i];) {
					s1.pop();
				}
				if (s1.empty()) {
					x[i] = -1;
				} else {
					x[i] = s1.peek();
				}

				s1.push(nums[i]);
			}
		}

		return x;

	}

}
