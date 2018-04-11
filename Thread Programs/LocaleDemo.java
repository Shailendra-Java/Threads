package com.example.localize;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo
{
	public static void main(String args[])
	{
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("fr","FR"));
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, new Locale("fr","FR"));
		String date = df.format(new Date());
		String time = df2.format(new Date());
		System.out.println(date);
		System.out.println(time);
	}
}