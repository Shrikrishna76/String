package com.classwork;

public class Demo {

	public static void main(String[] args) {
	
		String s1="hello everyone";
		String s2="WELCOME";
		
		s1.toUpperCase();
		System.out.println(s1);//hello
		
		
		System.out.println(s1.toUpperCase());//HELLO
		
		
		s1=s1.toUpperCase();
		System.out.println(s1);//HELLO
		
		String s3=s2.toLowerCase();
		System.out.println(s3);
		
		char c=s1.charAt(9);
		
		System.out.println(s1.length());
		System.out.println(c);
		
		//char c1=s1.charAt(1);
		//char c2=s1.charAt(21);//java.lang.StringIndexOutOfBoundsException
		//char c1=s1.charAt('a');// No copile time error Run time error occure java.lang.StringIndexOutOfBoundsException
	
		//char c1=s1.charAt(s1.length()); error
		char c1=s1.charAt(s1.length()-1);
		System.out.println(c1);
		
	}

}
