package solution.arrayandstring;

import java.util.Arrays;

public class IV169_MajorityElement {

	public static void main(String args[]) {

		int nums[] = { 3, 2, 3 };

		IV169_MajorityElement obj = new IV169_MajorityElement();

		obj.majorityElement(nums);
	}

	public int majorityElement(int[] nums) {

		Arrays.sort(nums);

		int majorNumber = nums[0];
		int majorNumberCount = 0;

		int currentNumber = majorNumber;
		int currentNumberCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (currentNumber == nums[i]) {
				currentNumberCount++;
			}
			if (currentNumber != nums[i] || i == nums.length - 1)
				if (majorNumberCount == 0 || majorNumberCount < currentNumberCount) {
					majorNumber = currentNumber;
					majorNumberCount = currentNumberCount;
					currentNumberCount = 1;

				}
			currentNumber = nums[i];
		}

		return majorNumber;

	}
}
