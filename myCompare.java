package demo;

import java.util.Scanner;

public class myCompare {

	public static int myCompare(String str1, String str2) {
	    String[] words = str1.split(" "); 
	    

	    for (String word : words) {
	        if (word.equals(str2)) {
	        	   System.out.println(" yes  ' "+str2+" '  is there ");   
	        }
	    }
	 
	    return 0;
	}

	
	
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String str1=sc.nextLine();
		    String str2=sc.nextLine();
		    myCompare(str1, str2);

		    sc.close();

	}

}
