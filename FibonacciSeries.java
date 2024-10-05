package javabasics;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	int n,a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	n=sc.nextInt();
	if(n==1) {
		System.out.println("0");
	}
	if(n==2) {
		System.out.println("0");
		System.out.println("1");
	}
	else {
		System.out.println("0");
		System.out.println("1");
		n=n-2;
		a=0;
		b=1;
		while(n!=0) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			n=n-1;
		}
			
	}
}
}
