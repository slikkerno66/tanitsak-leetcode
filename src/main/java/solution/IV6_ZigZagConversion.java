package solution;

import java.util.ArrayList;
import java.util.List;

public class IV6_ZigZagConversion {

	public static void main(String[] args) {
		// PAYPALISHIRING
		String s = "PAYPALISHIRING";

		IV6_ZigZagConversion obj = new IV6_ZigZagConversion();
		obj.convert(s, 3);
	}

	public String convert(String s, int numRows) {

		StringBuilder sb = new StringBuilder();

		List<List<String>> zigZaggedString = new ArrayList<>();

		int verticalIndex = 0;
		boolean downWard = true;

		if (numRows == 0) {
			return "";
		}
		if (numRows == 1) {
			return s;
		}

		for (int i = 0; i < numRows; i++) {
			zigZaggedString.add(new ArrayList<>());
		}

		for (int i = 0; i < s.length(); i++) {
			if (downWard) {

				zigZaggedString.get(verticalIndex).add(s.charAt(i) + "");

				if (verticalIndex != numRows - 1) {
					verticalIndex++;
				} else {
					downWard = false;
				}

			} else {

				verticalIndex--;

				zigZaggedString.get(verticalIndex).add(s.charAt(i) + "");
				if (verticalIndex == 0) {
					downWard = true;
					verticalIndex++;
				}

			}
		}

		for (int i = 0; i < numRows; i++) {
			for (String zigZaggedChar : zigZaggedString.get(i)) {
				if (zigZaggedChar != "") {
					sb.append(zigZaggedChar);
				}
			}
		}

		return sb.toString();
	}

}
