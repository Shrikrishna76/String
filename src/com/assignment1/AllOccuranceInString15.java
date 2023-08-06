package com.assignment1;

import java.util.Scanner;

//Write a Java program to search all occurrences of a character in given string

public class AllOccuranceInString15 {

	public static void main(String[] args) {
		String s="All occurrence of a character in string";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character you want to search occurrence:");
		char search =sc.next().charAt(0);
		
		int i,len=s.length();
		int count=0;
		
		
		for(i=0;i<len;i++)
		{
			if(s.charAt(i)==search)
			{
				System.out.println("Found at index: "+i);
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
