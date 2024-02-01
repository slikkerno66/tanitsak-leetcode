package interview.solution.interval;

import java.util.Arrays;

public class IV56_MergeIntervals {

	public static void main(String[] args) {

//		int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		int intervals[][] = { { 1, 3 } };
//		int intervals[][] = { { 1, 4 }, { 5, 6 } };
//		int intervals[][] = { { 1, 4 }, { 0, 4 } };
//		int intervals[][] = { { 1, 4 }, { 2, 3 } };

		int intervals[][] = { { 2, 3 }, { 2, 2 }, { 3, 3 }, { 1, 3 }, { 5, 7 }, { 2, 2 }, { 4, 6 } };

		IV56_MergeIntervals obj = new IV56_MergeIntervals();
		obj.merge(intervals);
	}

	public int[][] merge(int[][] intervals) {

		String mergedInterval = "";

		int i = 1;

		if (intervals.length == 1) {
			return intervals;
		}

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		int currentStart = intervals[0][0];
		int currentEnd = intervals[0][1];

		while (i < intervals.length) {

			if (i < intervals.length - 1) {
				if (currentEnd >= intervals[i][0] && currentEnd <= intervals[i][1]) {
					currentEnd = intervals[i][1];
				}

				else if (Math.abs(intervals[i + 1][0] - intervals[i][1]) >= 1) {
					mergedInterval += currentStart + "," + currentEnd + "|";
					currentStart = intervals[i + 1][0];
					currentEnd = intervals[i + 1][1];
				}
			} else {
				// This is for the last index
				if (currentEnd >= intervals[i][0] && currentEnd <= intervals[i][1]) {
					currentEnd = intervals[i][1];
					mergedInterval += currentStart + "," + currentEnd;
				} else if (intervals[i][0] <= currentEnd && intervals[i][1] <= currentEnd
						&& intervals[i][0] >= currentStart) {
					mergedInterval += currentStart + "," + currentEnd;

				} else {
					mergedInterval += currentStart + "," + currentEnd + "|";
					mergedInterval += intervals[i][0] + "," + intervals[i][1];
				}

//				if (intervals[i - 1][0] - intervals[i][1] > 1) {
//					mergedInterval += currentStart + "," + currentEnd + "|";
//					mergedInterval += intervals[i][0] + "," + intervals[i][1];
//				}

//				if (intervals[i][0] - intervals[i - 1][1] >= 1) {
//					mergedInterval += currentStart + "," + currentEnd + "|";
//					mergedInterval += intervals[i][0] + "," + intervals[i][1];
//				}
			}

			i++;

		}

		String splittedIntervals[] = mergedInterval.split("\\|");

		int[][] result = new int[splittedIntervals.length][2];
		for (int j = 0; j < splittedIntervals.length; j++) {
			String splittedStartAndEnd[] = splittedIntervals[j].split(",");
			result[j][0] = Integer.parseInt(splittedStartAndEnd[0]);
			result[j][1] = Integer.parseInt(splittedStartAndEnd[1]);
		}

		return result;
	}

}
