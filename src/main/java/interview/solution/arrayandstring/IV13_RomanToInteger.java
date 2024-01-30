package interview.solution.arrayandstring;

public class IV13_RomanToInteger {

	public static void main(String[] args) {

		String s = "DCXXI";

		IV13_RomanToInteger obj = new IV13_RomanToInteger();

		obj.romanToInt(s);
	}

// first version
//	public int romanToInt(String s) {
//
//		String currentSymbol = "";
//		int number = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//
//			currentSymbol = currentSymbol + s.charAt(i);
//
//			if (currentSymbol.length() > 1) {
//				if (currentSymbol.charAt(0) == 'C') {
//					if (currentSymbol.equals("CM")) {
//						number += 900;
//					} else if (currentSymbol.equals("CD")) {
//						number += 400;
//					}
//				} else if (currentSymbol.charAt(0) == 'X') {
//					if (currentSymbol.equals("XC")) {
//						number += 90;
//					} else if (currentSymbol.equals("XL")) {
//						number += 40;
//					}
//				} else if (currentSymbol.charAt(0) == 'I') {
//					if (currentSymbol.equals("IX")) {
//						number += 9;
//					} else if (currentSymbol.equals("IV")) {
//						number += 4;
//					} else if (currentSymbol.equals("II")) {
//						number += 2;
//					} else if (currentSymbol.equals("III")) {
//						number += 3;
//					}
//				}
//
//				currentSymbol = "";
//			} else {
//				switch (currentSymbol) {
//				case "M":
//					number += 1000;
//					currentSymbol = "";
//					break;
//				case "D":
//					number += 500;
//					currentSymbol = "";
//					break;
//				case "C":
//					if (i + 1 != s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
//						continue;
//					} else {
//						number += 100;
//						currentSymbol = "";
//					}
//					break;
//				case "L":
//					number += 50;
//					currentSymbol = "";
//					break;
//				case "X":
//					if (i + 1 != s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
//						break;
//					} else {
//						number += 10;
//						currentSymbol = "";
//					}
//					break;
//				case "V":
//					number += 5;
//					currentSymbol = "";
//					break;
//				case "I":
//					if (i + 1 != s.length() && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V')) {
//						break;
//					} else {
//						number += 1;
//						currentSymbol = "";
//					}
//					break;
//				}
//
//			}
//
//		}
//
//		// validate result
//		System.out.println(number);
//
//		return number;
//	}

	// improve version
	public int romanToInt(String s) {

		int sum = 0;
		int previousNumber = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int currentNumber = s.charAt(i);

			int number;
			switch (currentNumber) {
			case 'I':
				number = 1;
				break;
			case 'V':
				number = 5;
				break;
			case 'X':
				number = 10;
				break;
			case 'L':
				number = 50;
				break;
			case 'C':
				number = 100;
				break;
			case 'D':
				number = 500;
				break;
			case 'M':
				number = 1000;
				break;
			default:
				number = 0;
				break;
			}

			if (number < previousNumber) {
				sum -= number;
			} else {
				sum += number;
			}
			previousNumber = number;

		}

		System.out.println(sum);
		return sum;
	}

}
