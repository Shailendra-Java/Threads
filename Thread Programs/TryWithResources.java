package com.example.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources
{
	public void readFile()
	{
		String str;
		try(BufferedReader br = new BufferedReader(new FileReader("d:\\shailendra/abc.txt")))
		{
			str = br.readLine();
			System.out.println(str);
		}
		catch(IOException ioexp)
		{
			ioexp.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		TryWithResources twr = new TryWithResources();
		twr.readFile();
	}
}