package com.kodnest.reverse;

import java.util.Scanner;

public class Reverse {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the striing");
	String s1=sc.nextLine();
	ReverseApp.reverse(s1);
}
}
