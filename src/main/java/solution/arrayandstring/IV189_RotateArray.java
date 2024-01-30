package solution.arrayandstring;

import utility.Utility;

public class IV189_RotateArray {

	public static void main(String[] args) {

		int nums[] = { -1, -100, 3, 99 };
		int k = 2;

		IV189_RotateArray obj = new IV189_RotateArray();
		obj.rotate(nums, k);

		// prove solution
		Utility.printArray(nums);

	}

	public void rotate(int[] nums, int k) {
		int tempNums[] = new int[nums.length];

		if (k != 0 && nums.length != 0 && nums.length != 1) {
			for (int i = 0; i < nums.length; i++) {
				int newPosition = i + k;

				if (newPosition >= nums.length) {
					newPosition = nums.length > newPosition ? nums.length % newPosition : newPosition % nums.length;
				}

				tempNums[newPosition] = nums[i];
			}

			System.arraycopy(tempNums, 0, nums, 0, tempNums.length);
		}
	}

}
