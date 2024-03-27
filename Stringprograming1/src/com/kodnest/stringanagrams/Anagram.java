package com.kodnest.stringanagrams;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first string");
    String s1=sc.nextLine();
    System.out.println("enter second string");
    
    String s2=sc.nextLine();
   System.out.println(AnagramApp.display(s1, s2));

}
}