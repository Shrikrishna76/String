package com.classwork;

public class Demo2 {

	public static void main(String[] args) {
		String s="hello";
		
		int i,len=s.length();
		char ch;
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			System.out.println(ch+" = "+(int)ch);
		}
		
	}

}
