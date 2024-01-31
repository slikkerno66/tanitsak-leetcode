package interview.solution.hashmap;

import java.util.HashMap;

import utility.Utility;

public class IV202_HappyNumber {

	public static void main(String[] args) {

		int n = 19;

		IV202_HappyNumber obj = new IV202_HappyNumber();
		System.out.println(obj.isHappy(n));
	}

	public boolean isHappy(int n) {
		HashMap<Integer, String> map = new HashMap<>();

		int iteration = 0;
		int result = n;

//		int h = (int) Math.pow(5, 2);

		while (result != 1) {

			String resultString = Integer.toString(result);

			for (int i = 0; i < resultString.length(); i++) {
				Integer.parseInt(resultString.charAt(i) + "");
			}

			result = (int) Math.pow(1, 1);

		}

		return false;
	}

}
