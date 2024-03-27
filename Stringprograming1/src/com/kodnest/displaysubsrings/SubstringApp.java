package com.kodnest.displaysubsrings;

public class SubstringApp {
      public static void num(String s1)
      {
    	  char []arr=s1.toCharArray();

    	  for(int i=0;i<=arr.length-1;i++)
    	  {
    		  String news2=" ";
    		for(int j=i;j<=arr.length-1;j++)
    		{
    		news2=news2+arr[j];
    		System.out.println(news2);
    		}
    	  }
}
}