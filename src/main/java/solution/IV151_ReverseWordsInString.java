package solution;

public class IV151_ReverseWordsInString {

	public static void main(String[] args) {

		String s = "a good   example";

		IV151_ReverseWordsInString obj = new IV151_ReverseWordsInString();
		obj.reverseWords(s);
	}

	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();

		String splittedString[] = s.split(" ");

		for (int i = splittedString.length - 1; i >= 0; i--) {
			splittedString[i].trim();
			if (splittedString[i] != "") {
				sb.append(splittedString[i] + " ");
			}
		}

		return sb.toString().trim();
	}
}
