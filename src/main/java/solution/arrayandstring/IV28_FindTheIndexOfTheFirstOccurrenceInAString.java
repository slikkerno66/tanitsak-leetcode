package solution.arrayandstring;

public class IV28_FindTheIndexOfTheFirstOccurrenceInAString {

	public static void main(String[] args) {
		String haystack = "but";
		String needle = "sad";

		IV28_FindTheIndexOfTheFirstOccurrenceInAString obj = new IV28_FindTheIndexOfTheFirstOccurrenceInAString();
		obj.strStr(haystack, needle);
	}

	public int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
