package loop.basic.Leetcode;

public class MoveZero {

	public static void main(String[] args) {
		int y[] = { 2, 0, 3, 1, 5, 0, 6, 4 };
		moveZeroes1(y);
		print(y);
		int z[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 };
		moveZeroes1(z);
		print(z);
		
		int x[] = { 0, 0, 4, 5 };
		moveZeroes1(x);
		print(x);

	}

	//wrong
	public static void moveZeroes2(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					int x = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = x;
				}
			}
		}
	}
	
	//wrong
	public static void moveZeroes1(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					if (nums[j + 1] != 0) {
						int x = nums[j + 1];
						nums[j + 1] = nums[j];
						nums[j] = x;
					} else {
						for (int k = j + 1; k < nums.length - 1; k++) {
							if (nums[k] != 0) {
								int x = nums[k];
								nums[k] = nums[i];
								nums[i] = x;
								j = k;
							}
						}
					}
				}
			}
		}

	}
	
	//From Net
	public void moveZeroes4(int[] nums) {

	    int j = 0;
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] != 0) {
	            int temp = nums[j];
	            nums[j] = nums[i];
	            nums[i] = temp;
	            j++;
	        }
	    }
	}
	
	public static void moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count = count + 1;
			}
		}
		int x = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				nums[x++] = nums[j];
			}
		}
		for (int k = 0; k < count; k++) {
			nums[nums.length - 1 - k] = 0;
		}
	}

	static void print(int[] nums) {
		for (int a = 0; a < nums.length; a++) {
			System.out.print(nums[a] + " ");
		}
		System.out.println();
	}
}
