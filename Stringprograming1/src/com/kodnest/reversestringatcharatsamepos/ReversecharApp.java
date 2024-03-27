package com.kodnest.reversestringatcharatsamepos;

public class ReversecharApp {
 public static void num(String s1)
 {
	 String [] arr=s1.split(" ");
	 String news1=" ";
	 for(String x:arr)
	 {
		String news11=" ";
		for(int i=x.length()-1;i>=0;i--)
		{
		news11=news11+x.charAt(i);	
		}
		System.out.println(news11+" ");
 }
	 
}
}