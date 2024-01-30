package solution.hashmap;

import java.util.HashMap;

public class IV205_IsomorphicString {

	public static void main(String[] args) {

//		String s = "xadc";
//		String t = "baba";

//		String s = "foo";
//		String t = "bar";

//		String s = "egg";
//		String t = "add";

//		String s = "paper";
//		String t = "title";

		String s = "bbbaaaba";
		String t = "aaabbbba";

		IV205_IsomorphicString obj = new IV205_IsomorphicString();

		System.out.println(obj.isIsomorphic(s, t));
	}

	public boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> isomorphicMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			isomorphicMap.containsKey(s.charAt(i));

			isomorphicMap.containsValue(t.charAt(i));

			char sChar = s.charAt(i);
			char tChar = t.charAt(i);

			if (!isomorphicMap.containsKey(sChar) && !isomorphicMap.containsValue(tChar)) {
				isomorphicMap.put(sChar, tChar);
			} else if (isomorphicMap.containsKey(sChar) && isomorphicMap.get(sChar) != tChar) {
				return false;
			} else if (isomorphicMap.containsValue(tChar) && isomorphicMap.getOrDefault(s.charAt(i), null) == null) {
				return false;
			}

		}

		return true;
	}

}
