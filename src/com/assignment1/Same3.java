package com.assignment1;
//Compare string using new operator when new is present see different reference is there
public class Same3 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        
//        if(str1==str2) 
//		{
//			System.out.println("String 1 and String 2 are same");//str1 and str2 is the same ("Hello"), the == operator returns false
//																 //because they are separate objects in memory
//		}
//		else 
//		{
//			System.out.println("String 1 and String 2 are not same");
//		}
//        
//        System.out.println();
//        System.out.println("same : "+str1.equals(str2));//However, the equals() method compares the content of the strings
//        													   //and returns true, as the content is the same.

       System.out.println(str1==str2);
	}

}
