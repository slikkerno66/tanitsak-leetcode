package solution;

import java.util.Arrays;

public class MergedSortedArray88 {

	public static void main(String args[]) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		MergedSortedArray88 obj = new MergedSortedArray88();

		obj.merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;

		if (m == 0 && n == 0)
			return;

		for (int i = m; i < nums1.length; i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);

		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
}
