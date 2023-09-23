package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class frequenceCount {
	 public static int frequenceCount(String str,char ch) {

		 char arr[]=str.toCharArray();
		int c=0;
			int n=arr.length;
			for(int i=0;i<n;i++) {
				if(arr[i]==ch) {
				c++;}
			}
		System.out.println("frequence is :"+c);
		 
		return 0;
	 }
	
	
	
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String str=sc.nextLine();
		    char ch = sc.next().charAt(0);
		    frequenceCount(str, ch);
		
		    sc.close();

	}

}
