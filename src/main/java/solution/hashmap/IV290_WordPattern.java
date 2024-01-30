package solution.hashmap;

import java.util.HashMap;

public class IV290_WordPattern {

	public static void main(String[] args) {

//		String pattern = "aba";
//		String s = "cat cat cat dog";

//		String pattern = "abba";
//		String s = "   dog cat cat dog   ";

		String pattern = "abba";
		String s = "dog cat cat fish";

//		String pattern = "aaa";
//		String s = "aa aa aa aa";

		IV290_WordPattern obj = new IV290_WordPattern();

		System.out.println(obj.wordPattern(pattern, s));
	}

	public boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();

		String splittedS[] = s.trim().split(" ");

		int index = 0;

		if (pattern.toCharArray().length != splittedS.length) {
			return false;
		}

		for (char patternChar : pattern.toCharArray()) {

			if (!map.containsValue(splittedS[index]) && !map.getOrDefault(patternChar, "").equals("")
					|| map.containsValue(splittedS[index])
							&& !map.getOrDefault(patternChar, "").equals(splittedS[index])) {
				return false;
			}

			map.put(patternChar, splittedS[index]);
			index++;

		}

		return true;
	}

}
