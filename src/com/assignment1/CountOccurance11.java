package com.assignment1;
//Write a Java program to count occurrences of a character in given string

import java.util.Scanner;

public class CountOccurance11 {
	public static void countOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count is : "+count);
    }

	public static void main(String[] args) {
		
		String s="India is my country, i love india";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character you want count occurance:");
		char c=sc.next().charAt(0);
		
		countOccurrences(s, c);
		
		
	}

}
