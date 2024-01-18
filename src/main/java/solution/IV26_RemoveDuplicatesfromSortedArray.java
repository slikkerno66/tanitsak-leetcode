package solution;

import utility.Utility;

public class IV26_RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {

		int nums[] = { 1, 1, 1, 2, 2, 3 };

		IV26_RemoveDuplicatesfromSortedArray obj = new IV26_RemoveDuplicatesfromSortedArray();
		obj.removeDuplicates(nums);

		// prove solution
		Utility.printArray(nums);
	}

	public int removeDuplicates(int[] nums) {
		int toUpdateIndex = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[toUpdateIndex - 1] < nums[i]) {
				nums[toUpdateIndex] = nums[i];
				toUpdateIndex++;
			}
		}

		return toUpdateIndex;
	}
}
