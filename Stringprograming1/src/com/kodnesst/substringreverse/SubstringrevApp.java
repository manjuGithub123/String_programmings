package com.kodnesst.substringreverse;

public class SubstringrevApp {
	public static void num(String s1)
    {
  	  char []arr=s1.toCharArray();

  	  for(int i=arr.length-1;i>=0;i--)
  	  {
  		  String news2=" ";
  		for(int j=arr.length-1;j>= 0;j--)
  		{
  		news2=news2+arr[j];
  		System.out.println(news2);
  		}
  	  }
    }} 
