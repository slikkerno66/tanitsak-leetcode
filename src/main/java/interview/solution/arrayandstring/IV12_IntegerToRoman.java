package interview.solution.arrayandstring;

public class IV12_IntegerToRoman {

	public static void main(String[] args) {

		int s = 1000;

		IV12_IntegerToRoman obj = new IV12_IntegerToRoman();

		obj.intToRoman(s);
	}

// first version
//	public String intToRoman(int num) {
//
//		String roman = "";
//
//		while (num != 0) {
//			if (num >= 1000) {
//				roman += "M";
//				num -= 1000;
//			} else if (num < 1000 && num >= 500) {
//				if (num >= 900) {
//					roman += "CM";
//					num -= 900;
//				} else if (num >= 500) {
//					roman += "D";
//					num -= 500;
//				}
//			} else if (num < 500 && num >= 100) {
//				if (num >= 400) {
//					roman += "CD";
//					num -= 400;
//				} else if (num >= 100) {
//					roman += "C";
//					num -= 100;
//				}
//			} else if (num < 100 && num >= 50) {
//				if (num >= 90) {
//					roman += "XC";
//					num -= 90;
//				} else if (num >= 50) {
//					roman += "L";
//					num -= 50;
//				}
//			} else if (num < 50 && num >= 10) {
//				if (num >= 40) {
//					roman += "XL";
//					num -= 40;
//				} else if (num >= 10) {
//					roman += "X";
//					num -= 10;
//				}
//			} else {
//				if (num == 9) {
//					roman += "IX";
//					num -= 9;
//				} else if (num >= 5) {
//					roman += "V";
//					num -= 5;
//				} else if (num == 4) {
//					roman += "IV";
//					num -= 4;
//				} else {
//					roman += "I";
//					num -= 1;
//				}
//			}
//		}
//
//		System.out.println(roman);
//
//		return roman;
//	}

	// Better solution, StringBuilder can speed up the process 5 more times
	public String intToRoman(int num) {

		StringBuilder romanStringBuilder = new StringBuilder();

		while (num != 0) {
			if (num >= 1000) {
				romanStringBuilder.append("M");
				num -= 1000;
			} else if (num >= 900) {
				romanStringBuilder.append("CM");
				num -= 900;
			} else if (num >= 500) {
				romanStringBuilder.append("D");
				num -= 500;
			} else if (num >= 400) {
				romanStringBuilder.append("CD");
				num -= 400;
			} else if (num >= 100) {
				romanStringBuilder.append("C");
				num -= 100;
			} else if (num >= 90) {
				romanStringBuilder.append("XC");
				num -= 90;
			} else if (num >= 50) {
				romanStringBuilder.append("L");
				num -= 50;
			} else if (num >= 40) {
				romanStringBuilder.append("XL");
				num -= 40;
			} else if (num >= 10) {
				romanStringBuilder.append("X");
				num -= 10;
			} else if (num == 9) {
				romanStringBuilder.append("IX");
				num -= 9;
			} else if (num >= 5) {
				romanStringBuilder.append("V");
				num -= 5;
			} else if (num == 4) {
				romanStringBuilder.append("IV");
				num -= 4;
			} else {
				romanStringBuilder.append("I");
				num -= 1;
			}
		}

		return romanStringBuilder.toString();
	}

}
