package com.assignment1;
//Compare string using == when “” is present see same reference is there

public class Samereference2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
