package com.kodnest.stringanagrams;

import java.util.Arrays;

public class AnagramApp {
	public static String display(String s1,String s2)
	{

		char []arr=s1.toCharArray();
		char []arr1=s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		String news1=new String(arr);
		String news2=new String(arr1);

		if(news1.equals(news2))
		{
			return "both are anagrams";
		}
		else
		{
			return "both are not  anagrams";	
		}







	}
}





