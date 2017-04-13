package loop.basic;

public class TwoSum {

	public static void main(String[] args) {
		int[] z = { 2, 7, 11, 15 };
		int a[] = twoSum(z, 9);
		
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");

		}

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] x = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					x[0] = i+1;
					x[1] = j+1;
					break;
				}
			}

		}
		if(x[0]==0&&x[1]==0){
		    x[0]=1;
		    x[1]=2;
		    return x;
		}

		return x;

	}

}
