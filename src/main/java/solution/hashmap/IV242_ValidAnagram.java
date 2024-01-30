package solution.hashmap;

import java.util.HashMap;

public class IV242_ValidAnagram {

	public static void main(String[] args) {

		String s = "rat";
		String t = "car";

//		String s = "anagram";
//		String t = "nagaram";

		IV242_ValidAnagram obj = new IV242_ValidAnagram();

		System.out.println(obj.isAnagram(s, t));
	}

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> mapS = putContentInHashMap(s);
		HashMap<Character, Integer> mapT = putContentInHashMap(t);

		return mapS.equals(mapT);
	}

	private HashMap<Character, Integer> putContentInHashMap(String word) {
		HashMap<Character, Integer> mapWord = new HashMap<>();
		for (Character charInWord : word.toCharArray()) {
			if (!mapWord.containsKey(charInWord)) {
				mapWord.put(charInWord, 1);
			} else {
				mapWord.put(charInWord, mapWord.get(charInWord) + 1);
			}
		}
		return mapWord;
	}

}
