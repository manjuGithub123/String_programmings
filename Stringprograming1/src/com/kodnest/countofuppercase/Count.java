package com.kodnest.countofuppercase;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
     String s1=sc.nextLine();
     char []arr=s1.toCharArray();
     for(char x:arr)
     {
    	 System.out.println(x+" ");
     }CountApp.dis(arr);
	}

}
