package com.classwork;

public class TrimMethod {

	public static void main(String[] args) {
		String s1="  india is my country";
		
		int len=s1.length();
		System.out.println(len);
		System.out.println(s1);
		
		s1=s1.trim();
		
		 len=s1.length();
		System.out.println(len);
		System.out.println(s1);

	}

}
