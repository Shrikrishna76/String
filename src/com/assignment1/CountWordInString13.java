package com.assignment1;
//Write a Java program to count total number of words in a string.

public class CountWordInString13 
{
	
	public static void main(String[] args) {
		
		String s="This is a count first string";
		int i,len=s.length();
		int count=0;
		for(i=0;i<len+1;i++)
		{
			if(Character.isWhitespace(i)==false)
			{
				count++;	
			}
					
		}
		System.out.println(count);
			
	}
	
}
