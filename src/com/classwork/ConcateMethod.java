package com.classwork;

public class ConcateMethod {

	public static void main(String[] args) {
		String s1="Welcome";//scp-welcome
		
		s1.concat("to TQ");// heap-welcome to TQ -unref(going for GC)   | scp to TQ
		
		System.out.println(s1);//welcome
		
		s1=s1.concat("to pune");// heap -welcome to pune(ref by s1)   | scp to pune
		System.out.println(s1);//welcome to pune
	}

}
