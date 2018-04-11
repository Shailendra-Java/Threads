package com.example.generics;

 public class GenericsDemo<T>
 {
	 private T t;
	 public void setData(T t)
	 {
		 this.t = t;
	 }
	 public T getData()
	 {
		 return t;
	 }
	 public static void main(String args[])
	 {
		 GenericsDemo<Integer> integer = new GenericsDemo<>();
		 integer.setData(11);
		 System.out.println("Data : "+integer.getData());
		 
		 GenericsDemo<String> string = new GenericsDemo<>();
		 string.setData("Hello");
		 System.out.println("Data : "+string.getData());
	 }
 }