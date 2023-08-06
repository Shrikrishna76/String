package com.classwork;

public class EqualityOfString2 {

	public static void main(String[] args) {
		String s1="Rohan";
		String s2=new String("Rohan");
		String s3=new String("Rohan");
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		
		boolean ans=s1.equals(s2);
		System.out.println(ans);//true
		System.out.println(s2.equals(s3));//true
	}

}
