package com.kodnest.strings;

public class Pgrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="JAVA";
         String s2="SQL";
         String s3="JAVA"+"SQL";
         String s4="JAVA"+"SQL";
         if(s3==s4)
         {
        	 System.out.println("references are equal");
         }
         else
         {
        	 System.out.println("not equal");
         }
         if(s3.equals(s4))
         {
        	 System.out.println("values are equal");
         }
         else
         {
        	 System.out.println("not equal");
         }
	}

}
