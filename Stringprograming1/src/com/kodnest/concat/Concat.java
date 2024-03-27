package com.kodnest.concat;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     System.out.println(ConcatApp.add(s1, s2));
	}

}
