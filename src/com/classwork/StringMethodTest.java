package com.classwork;

public class StringMethodTest {

	public static void main(String[] args) {
		String s="i love india";
		
		//case 1:
		int index1=s.indexOf('i');
		//index1=s.indexOf(9);if any char is not prsent return -1
		System.out.println(index1);//giving index for 1st occurance

		//case 2:
		//int index2=s.indexOf('i',5);
		int index2=s.indexOf(105,5);//indexOf('i'5)
		System.out.println("i="+index2);
		
		int index3=s.lastIndexOf('i');
		System.out.println("i="+index3);
		
		int index4=s.lastIndexOf('i',9);
		System.out.println("i="+index4);
	}

}
