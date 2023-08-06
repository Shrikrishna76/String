package com.classwork;

public class CompareToMethod {

	public static void main(String[] args) {
		String s1="a";//97
		String s2="A";//99
		
		//s1=s2   0
		//s1>s2   positive
		//s1<s2   negative
		
		int a=s1.compareTo(s2);//0, no0, positive or negative
		System.out.println("a: "+a);
		int b=s1.compareToIgnoreCase(s2);//True
		System.out.println(b);
		
		if(a==0)
		{
			System.out.println("Both String are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		System.out.println();
		
		String s3="welcome";//97
		String s4="WELCOME";//99
		
		//s1=s2   0
		//s1>s2   positive
		//s1<s2   negative
		
//		int c=s3.compareTo(s4);//0, no0, positive or negative
//		System.out.println("a: "+c);
		int d=s3.compareToIgnoreCase(s4);//True
		System.out.println(d);
		
		if(d==0)
		{
			System.out.println("Both String are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		
	}
	
	

}
