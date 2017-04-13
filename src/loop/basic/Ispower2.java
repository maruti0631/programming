package loop.basic;

public class Ispower2 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo(12));
		System.out.println(isPowerOfTwo(13));
		System.out.println(isPowerOfTwo(1024));
		System.out.println(isPowerOfTwo(1));
	}
 
	public static boolean isPowerOfTwo(int n) {
		
		
		for (; n != 0;) {
			if (n % 2 == 0) {
				n = n / 2;
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
