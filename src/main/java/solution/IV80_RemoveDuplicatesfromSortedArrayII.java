package solution;

import utility.Utility;

public class IV80_RemoveDuplicatesfromSortedArrayII {
	public static void main(String[] args) {

		int nums[] = { 1, 1, 1, 2, 2, 3 };

		IV80_RemoveDuplicatesfromSortedArrayII obj = new IV80_RemoveDuplicatesfromSortedArrayII();
		obj.removeDuplicates(nums);

		// prove solution
		Utility.printArray(nums);
	}

	public int removeDuplicates(int[] nums) {
		int resultArraySize = 0;
		int currentAppearCount = 1;
		int toUpdateIndex = 0;

		for (int i = 1; i < nums.length; i++) {
			currentAppearCount++;
			if (nums[i] > nums[i - 1] || i == nums.length - 1) {
				int updateValue = nums[i - 1];
				if (currentAppearCount != 1 && currentAppearCount % 2 != 0) {
					currentAppearCount--;
				}

				if (currentAppearCount != 1 && currentAppearCount != 2) {
					currentAppearCount = currentAppearCount / 2;
				}

				for (int j = 0; j < currentAppearCount; j++) {
					nums[toUpdateIndex] = updateValue;
					toUpdateIndex++;
				}

				resultArraySize += currentAppearCount;
				currentAppearCount = 0;

			}

		}

		System.out.println(resultArraySize);

		return resultArraySize;
	}
}
