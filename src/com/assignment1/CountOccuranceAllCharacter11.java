package com.assignment1;

public class CountOccuranceAllCharacter11 {

	public static void main(String[] args) {
		String s="This is String";
		String s1=s.toLowerCase();
		int counts[]=new int[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			int visited=-1;
			char ch=s1.charAt(i);
			for(int j=i+1;j<s1.length();j++)
			{
				if(ch==s1.charAt(j))
				{
					count++;
					counts[j]=visited;
				}
			}
			if(counts[i]!=-1)
			{
				System.out.println(ch+" "+count);
			}
		}

	}

}
