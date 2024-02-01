package interview.solution.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class IV219_ContainsDuplicateII {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1 };
		int k = 3;

//		int nums[] = { 1, 2, 3, 1, 2, 3 };
//		int k = 2;

		IV219_ContainsDuplicateII obj = new IV219_ContainsDuplicateII();
		System.out.println(obj.containsNearbyDuplicate(nums, k));
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			List<Integer> positionList = new ArrayList<>();
			if (!map.containsKey(nums[i])) {
				positionList.add(i);
			} else {
				positionList = map.get(nums[i]);
				positionList.add(i);
			}

			map.put(nums[i], positionList);

		}

		for (Entry<Integer, List<Integer>> mapItem : map.entrySet()) {

			List<Integer> positions = mapItem.getValue();

			for (int i = 0; i < positions.size(); i++) {

				for (int j = 0; j < positions.size(); j++) {
					if (i != j && Math.abs(positions.get(i) - positions.get(j)) <= k) {
						return true;
					}
				}
			}

		}

		return false;
	}

}
