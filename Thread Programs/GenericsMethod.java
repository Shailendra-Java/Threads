package com.example.generics;

 public class GenericsMethod
 {
	 public <E> void swap(E x, E y)
	 {
		 System.out.println("Before Swap");
		 System.out.println("1st : "+x+"\n2nd : "+y);
		 
		 E temp;
		 temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println("After Swap");
		 System.out.println("1st : "+x+"\n2nd : "+y);
	 }
	 public static void main(String args[])
	 {
		 GenericsMethod gm = new GenericsMethod();
		 gm.swap(11,22);
		 gm.swap(11.5F,22.5F);
		 gm.swap('A','B');
		 gm.swap("Hello","Students");
	 }
 }