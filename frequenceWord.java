package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class frequenceWord{

	public static int frequenceWord(String str1, String str2) {
	    String[] words = str1.split(" ");
	    int count = 0;

	    for (String word : words) {
	        if (word.equals(str2)) {
	            count++;
	        }
	    }
	    System.out.println("frequence of word is : "+count);
	    return count;
	}

	
	
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String str1=sc.nextLine();
		    String str2=sc.nextLine();
		    frequenceWord(str1, str2);
	
		    sc.close();

	}

}