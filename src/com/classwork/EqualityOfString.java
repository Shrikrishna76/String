package com.classwork;

public class EqualityOfString {

	public static void main(String[] args) {
		String s1="krishna";
		String s2="krishnate";
		String s3=s1;
		String s4="Rohan";
		String s5="ROHAN";
		
		System.out.println("s1==s2 : "+(s1==s2));//true
		System.out.println("s1==s3 : "+(s1==s3));//true
		System.out.println("s1==s4 : "+(s1==s4));//false
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s4.equalsIgnoreCase(s5));
	}

}
