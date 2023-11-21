package com.jsp.String_java_programming;

import java.util.Scanner;

public class PanagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();

		if (isPangram(s)) {
			System.out.println("Is Panagram");
		} else {
			System.out.println("Is Not Panagram");
		}
	}

	public static boolean isPangram(String s) {
		if (s.length() < 26) {
			return false;
		}

		for (char c = 'a'; c <= 'z'; c++) {
			if (s.toLowerCase().indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
}
