package interview.solution.hashmap;

import java.util.HashMap;

import utility.Utility;

public class IV150_TwoSum {

	public static void main(String[] args) {

		int nums[] = { 1, 3, 4, 2 };
		int target = 6;

		IV150_TwoSum obj = new IV150_TwoSum();
		Utility.printArray(obj.twoSum(nums, target));
	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			int remainder = target - nums[i];
			if (map.containsKey(remainder)) {
				if (map.get(remainder) != i) {
					int[] result = { i, map.get(remainder) };
					return result;
				}
			}
		}

		int result[] = {};

		return result;
	}

}
