package interview.solution.hashmap;

import java.util.HashMap;

public class IV383_RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";

		IV383_RansomNote obj = new IV383_RansomNote();

		System.out.println(obj.canConstruct(ransomNote, magazine));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {
			char currentMagazine = magazine.charAt(i);
			map.put(currentMagazine, map.getOrDefault(currentMagazine, 0) + 1);
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			char currentRansomeNote = ransomNote.charAt(i);
			if (map.containsKey(currentRansomeNote)) {
				if (map.get(currentRansomeNote) != 0) {
					map.put(currentRansomeNote, map.get(currentRansomeNote) - 1);
				} else {
					return false;
				}
			} else {
				return false;
			}

		}

		return true;

	}

}
