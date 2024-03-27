package com.kodnest.strings;

public class Stringinbuildfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="kodnest technologies pvt ltd";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("kod"));
		System.out.println(s1.startsWith("manju"));
		System.out.println(s1.endsWith("ltd"));
		System.out.println(s1.endsWith("kod"));
		System.out.println(s1.contains("tech"));
		System.out.println(s1.indexOf("p"));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.indexOf("Z"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(8,18));

	}

}
