package com.kodnest.reverseorder;

public class OrderstringApp {
 public static void num(String s1)
 {
	 String []arr=s1.split(" ");
         String news1=" ";
         for(int i=arr.length-1;i>=0;i--)
         {
        	 news1=news1+arr[i]+" ";
        	 
         }
         System.out.println(news1  );
 }
}
