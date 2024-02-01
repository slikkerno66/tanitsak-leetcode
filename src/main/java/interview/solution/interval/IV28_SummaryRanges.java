package interview.solution.interval;

import java.util.ArrayList;
import java.util.List;

public class IV28_SummaryRanges {

	public static void main(String[] args) {

		int nums[] = { 0, 2, 3, 4, 6, 8, 9 };
//		int nums[] = { 0, 1, 2, 4, 5, 7 };

		IV28_SummaryRanges obj = new IV28_SummaryRanges();
		System.out.println(obj.summaryRanges(nums));

	}

	public List<String> summaryRanges(int[] nums) {

		List<String> summaryRanges = new ArrayList<>();
		String summaryRange = "";
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i + 1 != nums.length) {

				if (summaryRange == "") {
					summaryRange += nums[i];
					counter++;
				}

				int rightDiff = nums[i + 1] - nums[i];
				if (rightDiff != 1) {
					if (counter > 1) {
						summaryRange += "->" + nums[i];
					}
					summaryRanges.add(summaryRange);
					summaryRange = "";
					counter = 0;
				} else {
					counter++;
				}
			} else {
				if (counter > 1) {
					summaryRange += "->" + nums[i];
				} else {
					summaryRange = String.valueOf(nums[i]);
				}
				summaryRanges.add(summaryRange);
			}

		}

		return summaryRanges;
	}

}
