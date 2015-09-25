package com.my.practice.sets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatePracticeSet {

	public static void main(String[] args) throws ParseException {
		String s = "09-05-2016";
		String usLocalDate = new SimpleDateFormat("dd-MM-yyyy", Locale.US).format(new SimpleDateFormat().parse(s));
		System.out.println(usLocalDate);
	}

}
