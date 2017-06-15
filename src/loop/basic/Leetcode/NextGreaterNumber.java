package loop.basic.Leetcode;

import java.util.Stack;

public class NextGreaterNumber {

	public static void main(String[] args) {
		// int x[] = { 4, 5, 2, 25 };
		int x[] = { 8, 6, 7, 3 };
		// O(n^2)
		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length - 1 - i; j++) {

				if (x[i] < x[j + 1 + i]) {
					System.out.println(x[i] + "-->" + x[j + 1 + i]);
					break;

				} else if (j + 1 + i == x.length - 1) {
					System.out.println(x[i] + "-->" + "-1");
				}
			}
			if (i == x.length - 1) {
				System.out.println(x[i] + "-->" + "-1");
			}
		}
		 Stack<Integer> s = new Stack<>();
		s.push(1);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.empty());

	}

}
