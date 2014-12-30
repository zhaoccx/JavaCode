package com.zcc.datetest;

import java.util.Random;

public class DateZomeTest {
	public static void main(String[] args) {
		// for (String string : TimeZone.getAvailableIDs()) {
		// System.out.println(string);
		// new Date();
		// }
		new DateZomeTest().gString();
	}

	public String gString() {
		String string = "abcdef1234567890";
		char[] string2 = string.toCharArray();
		for (int j = 0; j < 10; j++) {
			StringBuffer buffer = new StringBuffer(16);
			Random mRandom = new Random();
			int s = 1;
			for (int i = 0; i < 16; i++) {
				s = mRandom.nextInt(16);
				buffer.append(string2[s]);
			}
			System.out.println(buffer);
		}

		return "";
	}

	public String andString(String s) {
//		String[] sarray = s.split(" ");

		return "";

	}
}
