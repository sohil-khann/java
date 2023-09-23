package demo;

import java.util.Scanner;

public class replace {


public static int replace(String str,String str1,String str2) {
	  char[] a = str.toCharArray(); 
	  char[] b = str1.toCharArray(); 
	  char[] c = str2.toCharArray(); 
	  
	
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]==b[0]){
			
				char s=c[0];
				a[i]=s;
				
			}
		}
	System.out.println(a);
	 
	return 0;
 }





public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	    replace(str, str1, str2);
	
	    sc.close();

}
	
	

}
