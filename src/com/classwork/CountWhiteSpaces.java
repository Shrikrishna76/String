package com.classwork;

public class CountWhiteSpaces {

	public static void main(String[] args) {
		String s="This is a Strinng";
		
		int i,len=s.length();
		int ch;
		int count=0;
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
			
		}
		System.out.println("No of spaces:"+count);
		
	}

}
