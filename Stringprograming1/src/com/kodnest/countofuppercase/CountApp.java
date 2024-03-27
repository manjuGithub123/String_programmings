package com.kodnest.countofuppercase;

public class CountApp {
 public static void dis(char[]arr)
 {
	 int Uppercase=0;
	 int Lowercase=0;
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 if(arr[i]>='a' && arr[i]<='z')
		 {
			 arr[i]+=32;
			Lowercase++; 
		 }
		 else if(arr[i]>='A' && arr[i]<='Z')
		 {
			 arr[i]-=32;
			 Uppercase++;
		 }
	 }
	 System.out.println("Uppercase: "+Uppercase);
	 System.out.println("Lowercase: "+Lowercase);
 }
}
