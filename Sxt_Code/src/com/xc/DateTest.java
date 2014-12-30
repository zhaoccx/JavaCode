package com.xc;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.getTime().toString());
	}
}
