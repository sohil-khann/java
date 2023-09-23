package demo;

import java.util.Scanner;

public class myEquals {



		public static boolean myEquals(String str1, String str2) {
		
		    if (str1 == null && str2 == null) {
		        return true;
		    }
		    
		   
		    if (str1 == null || str2 == null) {
		        return false;
		    }
		    
		 
		    return str1.equals(str2);
		}

	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String str1=sc.nextLine();
		    String str2=sc.nextLine();
		    
		    
		    boolean areEqual = myEquals(str1, str2); 

		  
		    sc.close();
	

	}

}
