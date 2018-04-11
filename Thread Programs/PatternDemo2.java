package com.example.pattern;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternDemo2 
{
	String s1,s2;
	
	PatternDemo2()
	{
		s1 = "When in Rome, Do as oman";
		s2 = "Ro";
	}
	public void execute()
	{
		String[] words = s1.split(" ");
		Pattern pattern = Pattern.compile(s2+".*+");
		for(int i=0; i<words.length; i++)
		{
			Matcher matcher = pattern.matcher(words[i]);
			boolean check = matcher.matches();
		if(check == true)
			System.out.println("String found : "+matcher.group()+"\t Starting index: "
			+matcher.start()+"\tEnding index: "+matcher.end());
		else
			System.out.println("String not found");
		}
		
	}
	public static void main(String args[])
	{
		PatternDemo2 pd = new PatternDemo2();
		pd.execute();
	}
}