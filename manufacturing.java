package car_showroom.java;

import java.util.Scanner;

public class manufacturing {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("welcome to our cold drink manufacturing compeny \ntplease enter the quantity that you want :");
	int q=sc.nextInt();
//	for making one litre cold drink incredients are required
	double sugar=0.2*q;
	double water=0.5*q;
	double chemicals=0.3*q;
	System.out.printf("sugar required= %.2f",sugar);
	System.out.printf("\nwater require = %.2f",water);
	System.out.printf("\nchemicals require = %.2f",chemicals);
	
	sc.close();

	}

}
