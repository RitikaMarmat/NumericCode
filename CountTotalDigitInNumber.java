package javabasics;

import java.util.Scanner;

public class CountTotalDigitInNumber {
public static void main(String[] args) {
	int n ,c;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	c=0;
	while(n!=0) {
		n=n/10;
		c=c+1;
	}
	System.out.println(c);
	
	}
}
