package demo;

import java.util.Scanner;

public class trim {
	

		
		public static String trim1(String str) {
	
		    String trimmedStr = str.trim();
		    
		    System.out.println(trimmedStr);
		    
		 
		    return trimmedStr;
		}



	public static void main(String s[])

	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    trim1(str);
	    sc.close();
	}
}
