package interview.solution.arrayandstring;

import utility.Utility;

public class IV238_ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		// 1, 2, 3, 4
		// -1, 1, 0, -3, 3
		int nums[] = { -1, 1, 0, -3, 3 };

		IV238_ProductOfArrayExceptSelf obj = new IV238_ProductOfArrayExceptSelf();

		obj.productExceptSelf(nums);
	}

	// timeout
//	public int[] productExceptSelf(int[] nums) {
//
//		int productedNums[] = new int[nums.length];
//
//		if (nums.length != 0) {
//
//			if (nums.length == 1) {
//				return nums;
//			}
//
//			for (int i = 0; i < nums.length; i++) {
//				int productNum = 1;
//				for (int j = 0; j < nums.length; j++) {
//					if (j != i) {
//						productNum *= nums[j];
//						if (productNum == 0) {
//							break;
//						}
//					}
//				}
//				productedNums[i] = productNum;
//			}
//		}
//
//		return productedNums;
//	}

	// solved
	public int[] productExceptSelf(int[] nums) {
		int N = nums.length;
		int[] left_products = new int[N];
		int[] right_products = new int[N];
		int[] output_arr = new int[N];

		left_products[0] = 1;
		right_products[N - 1] = 1;

		for (int i = 1; i < N; i++) {
			left_products[i] = nums[i - 1] * left_products[i - 1];
		}

		Utility.printArray(left_products);
		System.out.println();

		for (int i = N - 2; i >= 0; i--) {
			right_products[i] = nums[i + 1] * right_products[i + 1];
		}

		Utility.printArray(right_products);

		for (int i = 0; i < N; i++) {
			output_arr[i] = left_products[i] * right_products[i];

		}
		return output_arr;
	}

}
