package com.classwork;

public class PrintAllVowelsFromString {
	
	public static void testVowel(String s)
	{
		int i,len=s.length();
		char ch;
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				System.out.println(ch+" is vowel");
			}
			else
			{
				System.out.println(ch+" is not vowel");
			}
		}
		
	}
	
	public static void printVowel(String s)
	{
		int i,len=s.length();
		char ch;
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				System.out.println(ch+" is vowel");
			}
			
		}
		
	}

	public static void main(String[] args) {
		String s="Welcome";
		
		testVowel(s);
		System.out.println();
		System.out.println("---------------Print vowel------------");
		printVowel(s);

	}

}
