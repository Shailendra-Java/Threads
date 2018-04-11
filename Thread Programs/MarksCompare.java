package com.example.collection;

import java.util.*;

class MarksCompare implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		if(st1.getMarks() > st2.getMarks())
			return 1;
		else if(st1.getMarks() < st2.getMarks())
			return -1;
		else
			return 0;
	}
}