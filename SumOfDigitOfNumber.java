package javabasics;

import java.util.Scanner;

public class SumOfDigitOfNumber {
public static void main(String[] args) {
	int n,s,b; 
	Scanner sc= new Scanner(System.in);
    n=sc.nextInt();	
    s=0;
    while(n!=0) {
    	b=n%10;
    	s=s+b;
    	n=n/10;
    }
    System.out.println(s);
}
}