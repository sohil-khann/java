package demo;

import java.util.Scanner;

public class charCount {
	
	private static void charCount(String str){
		int c=0;
		char arr[]=str.toCharArray();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			c++;
		}
	System.out.println("number of characters are  :"+c);
	
//	int count=str.length();
//	System.out.println("number of character is :"+count);

	}


	public static void main(String s[])

	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    charCount(str);
	// vowelCount(new String("i am tarun Chhoker"));
	    sc.close();
	}



}
