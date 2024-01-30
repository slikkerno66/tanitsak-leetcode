package solution.arrayandstring;

public class IV14_LongestCommonPrefix {

	public static void main(String[] args) {

		// "flower", "flow", "flight"
		// "dog","racecar","car"
		// "a"
		// "ab", "a"
		// "aaa","aa","aaa"
		// "abab","aba",""

		String[] s = { "flower", "flow", "flight" };

		IV14_LongestCommonPrefix obj = new IV14_LongestCommonPrefix();

		obj.longestCommonPrefix(s);
	}

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();

		boolean keepDoing = true;
		boolean notLastTime = true;

		if (strs.length == 1)
			sb.append(strs[0]);

		for (int i = 0; i < strs[0].length(); i++) {

			int j = 1;
			while (j <= strs.length - 1 && keepDoing) {

				if (strs[j].length() == 0) {
					keepDoing = false;
				} else {
					if (strs[0].charAt(i) != strs[j].charAt(i)) {
						keepDoing = false;
					}

					if (i == strs[j].length() - 1) {
						notLastTime = false;
					}

					if (strs[0].charAt(i) == strs[j].charAt(i) && j == strs.length - 1) {

						sb.append(strs[0].charAt(i));

						if (i == strs[j].length() - 1 || !notLastTime) {
							keepDoing = false;
						}
					}
					j++;
				}

			}

			if (!keepDoing) {
				break;
			}

		}

		System.out.println(sb.toString());

		return sb.toString();
	}

}
