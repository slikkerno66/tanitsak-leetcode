package solution.arrayandstring;

public class IV58_LengthOfLastWord {

	public static void main(String[] args) {
		String s = "a";

		IV58_LengthOfLastWord obj = new IV58_LengthOfLastWord();
		obj.lengthOfLastWord(s);
	}

// first version
//	public int lengthOfLastWord(String s) {
//
//		String[] splited = s.split("\\s+");
//
//		return splited[splited.length - 1].length();
//	}

	// better solution
	public int lengthOfLastWord(String s) {

		s = s.trim();

		int lastWordLength = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			}
			lastWordLength++;
		}

		return lastWordLength;
	}

}
