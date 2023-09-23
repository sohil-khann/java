package demo;

import java.util.Scanner;

public class spaceCount {
	
public static int spaceCount(String str) {
	char arr[]=str.toCharArray();
	int c=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==' ') {
			c++;}
		}
	System.out.println("spaces are : "+c);
	 
	return 0;
 }





public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	 
	    spaceCount(str);
	
	    sc.close();

}
}
