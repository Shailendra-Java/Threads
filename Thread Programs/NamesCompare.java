package com.example.collection;

import java.util.*;

class NamesCompare implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
			
		return st1.getName().compareTo(st2.getName());
	}
}