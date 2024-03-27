package com.kodnest.reverse;

public class ReverseApp {
 public static void reverse(String s1)
 {
	char arr[]=s1.toCharArray();
	String revs1=" ";
	for(int i=arr.length-1;i<=0;i--)
	{
		revs1=revs1+arr[i];
	}
	System.out.println(revs1);
 }
}
