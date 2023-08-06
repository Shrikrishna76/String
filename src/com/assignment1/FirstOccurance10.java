package com.assignment1;
//Write a Java program to find first occurrence of a character in a given string.

import java.util.Scanner;

public class FirstOccurance10 {

		public static int findFirstOccurrence(String s, char ch) 
		{
	        for (int i = 0; i < s.length(); i++)
	        {
	            if (s.charAt(i) == ch) 
	            {
	                return i;
	            }
	        }
	        return -1; // Character not found in the string
	    }

	    public static void main(String[] args) {
	    	String s="Hello Everyone";
	        Scanner sc = new Scanner(System.in);
	        System.out.println(s);

	        System.out.print("Enter the character to find: ");
	        char Ch = sc.next().charAt(0);

	        int result = findFirstOccurrence(s,Ch);

	        if (result != -1) 
	        {
	            System.out.println("The first occurrence of '" + Ch + "' is at index: " + result);
	        }
	        else 
	        {
	            System.out.println("'" + Ch + "' is not present in the given string.");
	        }
	        sc.close();
	    }
	   
	

}
