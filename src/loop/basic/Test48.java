package loop.basic;

import java.util.Scanner;

class Test48 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		char ch = '*';
		/*for (int rows = n - 1; rows >= 1; rows--) {
			for (int cols = rows; cols >= 1; cols--) {
				System.out.print(" ");
			}
			int r = n;
			for (int i = 0; i <= r - rows; i++, r++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		for (int rows = 1; rows <= n; rows++) {
			for (int cols = rows; cols < n; cols++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= rows * 2 - 1; i++) {
				System.out.print(ch);
				
			}
			System.out.println();
		}
		
		/*for (int rows = 1; rows <= n; rows++) {
			for (int cols = rows; cols < n; cols++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= rows * 2 - 1; i++) {
				if (rows == n / 2 + 1)
					System.out.print(ch);
				else {
					if (i == 1 || i == rows * 2 - 1)
						System.out.print(ch);
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		sc.close();
	}
}