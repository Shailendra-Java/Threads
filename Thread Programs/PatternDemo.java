package com.example.pattern;

import java.util.regex.*;

public class PatternDemo 
{
	String s1,s2;
	
	PatternDemo()
	{
		s1 = "This is first JAVA program";
		s2 = "World";
	}
	public void execute()
	{
		Pattern pattern = Pattern.compile(".*"+s2+".*");
		Matcher matcher = pattern.matcher(s1);

		boolean check = matcher.matches();
		if(check == true)
			System.out.println("String found");
		else
			System.out.println("String not found");
	}
	public static void main(String args[])
	{
		PatternDemo pd = new PatternDemo();
		pd.execute();
	}
}